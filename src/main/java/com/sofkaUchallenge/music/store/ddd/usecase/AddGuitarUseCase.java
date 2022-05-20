package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Instrument.Instrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.AddGuitar;

public class AddGuitarUseCase extends UseCase<RequestCommand<AddGuitar>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddGuitar> addGuitarRequestCommand) {
        var command = addGuitarRequestCommand.getCommand();
        var instrument = Instrument.from(
                command.getInstrumentId(),
                repository().getEventsBy(command.getInstrumentId().value()));
        instrument.addGuitar(command.getGuitarId(),command.getGuitarType(),command.getGuitarBrand(),command.getGuitarColor(), command.getGuitarValue());

        emit().onResponse(new ResponseEvents(instrument.getUncommittedChanges()));
    }
}
