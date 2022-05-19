package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

import java.util.Objects;

public class Flute extends Entity<FluteId> {
    private Brand fluteBrand;
    private Value fluteValue;

    public Flute(FluteId entityId, Brand brand, Value value) {
        super(entityId);
        this.fluteBrand = brand;
        this.fluteValue = value;
    }

    public Brand fluteBrand() {
        return fluteBrand;
    }

    public Value fluteValue() {
        return fluteValue;
    }

    public void changeFluteBrand(Brand brand){
        this.fluteBrand = Objects.requireNonNull(brand);
    }

    public void updateFluteValue(Value value){
        this.fluteValue = Objects.requireNonNull(value);
    }
}
