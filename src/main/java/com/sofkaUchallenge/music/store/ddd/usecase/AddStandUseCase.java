package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Accesory.Accesory;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.AddStand;

public class AddStandUseCase extends UseCase<RequestCommand<AddStand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddStand> addStandRequestCommand) {
        var command = addStandRequestCommand.getCommand();
        var accessory = Accesory.from(
                command.getAccesoryId(),
                repository().getEventsBy(command.getAccesoryId().value()));

        accessory.addStand(command.getStandId(),command.getAllowedWeight(),command.getValueStand());

        emit().onResponse(new ResponseEvents(accessory.getUncommittedChanges()));
    }
}
