package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<String> {
    private final String value;

    public Color(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The brand can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        Color color = (Color) o;
        return Objects.equals(value, color.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
