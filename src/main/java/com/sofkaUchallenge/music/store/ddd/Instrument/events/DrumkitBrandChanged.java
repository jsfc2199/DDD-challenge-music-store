package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;

public class DrumkitBrandChanged extends DomainEvent {
    private final DrumkitId drumkitId;
    private final Brand drumkitBrand;

    public DrumkitBrandChanged(DrumkitId drumkitId, Brand brand) {
        super("sofka.instrument.drumkitbrandchanged");
        this.drumkitId = drumkitId;
        this.drumkitBrand = brand;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Brand getDrumkitBrand() {
        return drumkitBrand;
    }
}
