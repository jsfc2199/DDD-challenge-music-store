package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;

public class ManufacturerAdded extends DomainEvent {
    private final Manufacturer manufacturerInstrument;

    public ManufacturerAdded(Manufacturer manufacturer) {
        super("sofka.instrument.manufactureradded");
        this.manufacturerInstrument = manufacturer;
    }

    public Manufacturer getManufacturerInstrument() {
        return manufacturerInstrument;
    }
}
