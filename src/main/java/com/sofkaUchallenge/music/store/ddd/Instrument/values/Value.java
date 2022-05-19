package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Integer> {
    private final Integer value;

    public Value(Integer value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;
        Value value1 = (Value) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
