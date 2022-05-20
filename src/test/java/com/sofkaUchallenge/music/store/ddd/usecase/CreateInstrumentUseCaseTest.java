package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.CreateInstrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateInstrumentUseCaseTest {
    @Test
    void createNewInstrument(){
        var id = new InstrumentId();
        var manufacturer = new Manufacturer("Carlos");

        var command = new CreateInstrument(id,manufacturer);
        var useCase = new CreateInstrumentUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        InstrumentCreated event = (InstrumentCreated) events.get(0);
        Assertions.assertEquals("Carlos", event.getManufacturerInstrument().value());
    }
}