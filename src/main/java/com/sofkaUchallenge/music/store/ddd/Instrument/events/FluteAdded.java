package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class FluteAdded extends DomainEvent {
    private final FluteId fluteId;
    private final Brand fluteBrand;
    private final Value fluteValue;

    public FluteAdded(FluteId fluteId, Brand brand, Value value) {
        super("sofka.instrument.fluteadded");
        this.fluteId = fluteId;
        this.fluteBrand = brand;
        this.fluteValue = value;
    }

    public FluteId getFluteId() {
        return fluteId;
    }

    public Brand getFluteBrand() {
        return fluteBrand;
    }

    public Value getFluteValue() {
        return fluteValue;
    }
}
