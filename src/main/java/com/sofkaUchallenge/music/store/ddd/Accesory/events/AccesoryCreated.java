package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Manufacturer;

public class AccesoryCreated extends DomainEvent {
    private final Manufacturer manufacturer;
    public AccesoryCreated(Manufacturer manufacturer) {
        super("sofka.accesory.accesorycreated");
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
