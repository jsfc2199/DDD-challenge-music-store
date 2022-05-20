package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.Instrument;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class NotifyToWarehouseUseCase extends UseCase<TriggeredEvent<InstrumentCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<InstrumentCreated> instrumentCreatedTriggeredEvent) {
        var event = instrumentCreatedTriggeredEvent.getDomainEvent();
        var instrument = Instrument.from(InstrumentId.of(event.aggregateRootId()),this.retrieveEvents());
        instrument.notifyToWarehouse("We sold an instrument, please update the information in the warehouse");

        emit().onResponse(new ResponseEvents(instrument.getUncommittedChanges()));
    }
}
