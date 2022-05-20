package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.AddGuitar;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.CreateInstrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.GuitarAdded;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;
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
class AddGuitarUseCaseTest {

    @InjectMocks
    private AddGuitarUseCase useCase;

    //mock
    @Mock
    private DomainEventRepository repository; //allows me to have all the events that are already persisted

    @Test
    void addGuitarToInstrument (){
        //arrange
        InstrumentId instrumentId = InstrumentId.of("ddd");
        GuitarId guitarId = new GuitarId();
        Type guitarType = new Type("Electric");
        Brand guitarBrand = new Brand("Jackson");
        Color guitarColor = new Color("Dark Black");
        Value guitarValue = new Value(1235000);

        var command = new AddGuitar(instrumentId, guitarId, guitarType, guitarBrand, guitarColor, guitarValue);

        when(repository.getEventsBy("ddd")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(command.getInstrumentId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while adding the guitar"))
                .getDomainEvents();

        //assert
        var event = (GuitarAdded) events.get(0);
        Assertions.assertEquals("Jackson",event.getGuitarBrand().value());
        Assertions.assertEquals("Dark Black",event.getGuitarColor().value());
        Assertions.assertEquals(1235000, event.getGuitarValue().value());
        Assertions.assertEquals("Electric", event.getGuitarType().value());
    }

    private List<DomainEvent> history() {
        //InstrumentId instrumentId = InstrumentId.of("xxxx");
        var manufacturer = new Manufacturer("Carlos");

        var passedEvent = new InstrumentCreated(
                manufacturer
        );

        return List.of(passedEvent);
    }
}