package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.AddStand;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.AccesoryCreated;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.StandAdded;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddStandUseCaseTest {

    @InjectMocks
    private AddStandUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addStandToAccesory(){
        //arrange
        AccesoryId accesoryId = AccesoryId.of("ddd");
        StandId standId = new StandId();
        AllowedWeight allowedWeight = new AllowedWeight(50);
        Value valueStand = new Value(80000);

        var command = new AddStand(accesoryId, standId, allowedWeight, valueStand);

        when(repository.getEventsBy("ddd")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(command.getAccesoryId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while adding the stand"))
                .getDomainEvents();

        //assert
        var event = (StandAdded) events.get(0);
        Assertions.assertEquals(50,event.getAllowedWeight().value());
        Assertions.assertEquals(80000,event.getValueStand().value());
    }

    private List<DomainEvent> history(){
        var manufacturer = new Manufacturer("Vivaldi");

        var passedEvent = new AccesoryCreated(
                manufacturer
        );

        return List.of(passedEvent);
    }

}