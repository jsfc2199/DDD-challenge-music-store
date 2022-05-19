package com.sofkaUchallenge.music.store.ddd.Accesory.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AllowedWeight implements ValueObject<Integer> {
    private final Integer value;

    public AllowedWeight(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AllowedWeight)) return false;
        AllowedWeight that = (AllowedWeight) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
