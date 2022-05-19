package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;

public class FluteBrandChanged extends DomainEvent {
    private final FluteId fluteId;
    private final Brand fluteBrand;

    public FluteBrandChanged(FluteId fluteId, Brand brand) {
        super("sofka.instrument.flutebrandchanged");
        this.fluteId = fluteId;
        this.fluteBrand = brand;
    }

    public FluteId getFluteId() {
        return fluteId;
    }

    public Brand getFluteBrand() {
        return fluteBrand;
    }
}
