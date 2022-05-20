package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Accesory.Accesory;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.ChangeCaseTyoe;

public class ChangeCaseTypeUseCase extends UseCase<RequestCommand<ChangeCaseTyoe>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ChangeCaseTyoe> changeCaseTyoeRequestCommand) {
        var command = changeCaseTyoeRequestCommand.getCommand();

        var accesory = Accesory.from(command.getAccesoryId(), retrieveEvents(command.getAccesoryId().value()));
        accesory.changeCaseTyoe(command.getCaseId(),command.getType());

        emit().onResponse(new ResponseEvents(accesory.getUncommittedChanges()));
    }
}
