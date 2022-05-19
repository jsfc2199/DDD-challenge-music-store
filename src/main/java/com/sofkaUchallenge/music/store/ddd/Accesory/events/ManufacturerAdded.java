package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Manufacturer;

public class ManufacturerAdded extends DomainEvent {
    private final Manufacturer manufacturer;

    public ManufacturerAdded(Manufacturer manufacturer) {
        super("sofka.accesory.manufactureradded");
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
