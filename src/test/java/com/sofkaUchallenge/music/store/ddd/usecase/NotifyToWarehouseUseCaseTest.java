package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.WarehouseNotified;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;
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
class NotifyToWarehouseUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void notifyToWarehouse(){
        var event = new InstrumentCreated(new Manufacturer("Les Paul"));

        event.setAggregateRootId("ddd");
        var useCase = new NotifyToWarehouseUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(event));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("ddd")
                .syncExecutor(useCase,new TriggeredEvent<>(event))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while notifying the warehouse"))
                .getDomainEvents();

        var notification = (WarehouseNotified) events.get(0);
        Assertions.assertEquals("We sold an instrument, please update the information in the warehouse",notification.getNotification());
        Mockito.verify(repository).getEventsBy("ddd");
    }
}