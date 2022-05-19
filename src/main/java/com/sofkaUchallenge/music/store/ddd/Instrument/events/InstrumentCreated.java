package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;

public class InstrumentCreated extends DomainEvent {
    protected Manufacturer manufacturerInstrument;

    public InstrumentCreated(Manufacturer manufacturer) {
        super("sofka.instrument.instrumentcreated");
        this.manufacturerInstrument = manufacturer;
    }

    public Manufacturer getManufacturerInstrument() {
        return manufacturerInstrument;
    }
}
