package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CymbalNumber implements ValueObject<Integer> {
    private final Integer value;

    public CymbalNumber(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CymbalNumber)) return false;
        CymbalNumber that = (CymbalNumber) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
