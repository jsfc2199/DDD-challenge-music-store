package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;

public class GuitarBrandUpdated extends DomainEvent {
    private final GuitarId guitarId;
    private final Brand guitarBrand;

    public GuitarBrandUpdated(GuitarId guitarId, Brand brand) {
        super("sofka.instrument.guitarbrandupdated");
        this.guitarId = guitarId;
        this.guitarBrand = brand;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Brand getGuitarBrand() {
        return guitarBrand;
    }
}
