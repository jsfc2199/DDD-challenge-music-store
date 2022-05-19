package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StringAccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

import java.util.Objects;

public class StringAccesory extends Entity<StringAccesoryId> {
    private Value stringAccesoryValue;
    public StringAccesory(StringAccesoryId entityId, Value value) {
        super(entityId);
        this.stringAccesoryValue = value;
    }

    public Value stringAccesoryValue() {
        return stringAccesoryValue;
    }

    public void updateValue(Value value){
        this.stringAccesoryValue = Objects.requireNonNull(value);
    }
}
