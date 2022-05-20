package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;

public class WarehouseNotified extends DomainEvent {
    private final String notification;
    public WarehouseNotified(String notification) {
        super("sofka.instrument.warehousenotified");
        this.notification = notification;
    }

    public String getNotification() {
        return notification;
    }
}
