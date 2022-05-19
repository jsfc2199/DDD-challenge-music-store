package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StreetAdress implements ValueObject<String> {
    private final String value;

    public StreetAdress(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The street adress can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StreetAdress)) return false;
        StreetAdress that = (StreetAdress) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
