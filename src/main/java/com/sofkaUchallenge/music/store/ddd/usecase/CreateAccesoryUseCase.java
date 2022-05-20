package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Accesory.Accesory;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.CreateAccesory;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.AccesoryCreated;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Manufacturer;

import java.util.List;

public class CreateAccesoryUseCase extends UseCase<RequestCommand<CreateAccesory>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateAccesory> createAccesoryRequestCommand) {

        var command = createAccesoryRequestCommand.getCommand();
        var accesory = new Accesory(command.getAccesoryId(),command.getManufacturer());



        emit().onResponse(new ResponseEvents(
                accesory.getUncommittedChanges() //gives me the changes that are not confirmed yet
        ));

        //with this fake values the test is okay
        /*emit().onResponse(new ResponseEvents(List.of(
                new AccesoryCreated(new Manufacturer("Jaime"))
        )));*/
    }
}
