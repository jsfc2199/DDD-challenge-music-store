package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.UpdateGuitarBrand;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.GuitarAdded;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.GuitarBrandUpdated;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UpdateGuitarBrandUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateGuitarBrand(){
        //arrange
        InstrumentId instrumentId = InstrumentId.of("ddd");
        GuitarId guitarId = GuitarId.of("XD125");
        Brand guitarBrand = new Brand("Fender");

        var command = new UpdateGuitarBrand(instrumentId, guitarId, guitarBrand);
        var useCase = new UpdateGuitarBrandUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(
                new InstrumentCreated(
                        new Manufacturer("Juancho")
                ),
        new GuitarAdded(GuitarId.of("XD125"),
                new Type("Electric"),
                new Brand("Jackson"),
                new Color("White"),
                new Value(1250000))
        ));

        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("ddd")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (GuitarBrandUpdated) events.get(0);
        Assertions.assertEquals("Fender",event.getGuitarBrand().value());
        Mockito.verify(repository).getEventsBy("ddd");
    }


}