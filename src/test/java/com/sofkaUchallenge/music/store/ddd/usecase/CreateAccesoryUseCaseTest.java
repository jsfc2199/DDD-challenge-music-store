package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.CreateAccesory;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.AccesoryCreated;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Manufacturer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateAccesoryUseCaseTest {
    @Test

    void createNewAccesory(){
        var id = new AccesoryId();
        var manufacturer = new Manufacturer("Jaime");

        var command = new CreateAccesory(id,manufacturer);
        var useCase = new CreateAccesoryUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating the accesory"))
                .getDomainEvents();

        AccesoryCreated event = (AccesoryCreated) events.get(0);
        Assertions.assertEquals("Jaime",event.getManufacturer().value());
    }

}