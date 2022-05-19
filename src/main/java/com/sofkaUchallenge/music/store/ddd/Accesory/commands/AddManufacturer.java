package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Manufacturer;

public class AddManufacturer extends Command {
    private final AccesoryId accesoryId;
    private final Manufacturer manufacturer;

    public AddManufacturer(AccesoryId entityId, Manufacturer manufacturer) {
        this.accesoryId = entityId;
        this.manufacturer = manufacturer;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
