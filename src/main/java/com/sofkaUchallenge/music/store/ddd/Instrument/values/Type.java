package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Type implements ValueObject<String> {
    private final String value;

    public Type(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The type can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type)) return false;
        Type type = (Type) o;
        return Objects.equals(value, type.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
