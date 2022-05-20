package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Instrument.Instrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.CreateInstrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;

import java.util.List;

public class CreateInstrumentUseCase extends UseCase<RequestCommand<CreateInstrument>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateInstrument> createInstrumentRequestCommand) {
        var command = createInstrumentRequestCommand.getCommand();
        var instrument = new Instrument(command.getInstrumentId(), command.getManufacturerInstrument());

        emit().onResponse(new ResponseEvents(
                instrument.getUncommittedChanges()
        ));
    }
}
