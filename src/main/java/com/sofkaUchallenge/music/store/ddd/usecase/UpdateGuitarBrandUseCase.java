package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Instrument.Instrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.commands.UpdateGuitarBrand;

public class UpdateGuitarBrandUseCase extends UseCase<RequestCommand<UpdateGuitarBrand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateGuitarBrand> updateGuitarBrandRequestCommand) {
        var command = updateGuitarBrandRequestCommand.getCommand();

        var instrument = Instrument.from(command.getInstrumentId(), retrieveEvents(command.getInstrumentId().value()));
        instrument.updateGuitarBrand(command.getGuitarId(),command.getGuitarBrand());

        emit().onResponse(new ResponseEvents(instrument.getUncommittedChanges()));


    }
}
