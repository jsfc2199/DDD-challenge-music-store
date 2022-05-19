package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Username implements ValueObject<String> {
    private final String value;

    public Username(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The user name can't be blank");
        }

        if(this.value.length()<8){
            throw new IllegalArgumentException("The user name needs to have more than 8 charecters");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Username)) return false;
        Username username = (Username) o;
        return Objects.equals(value, username.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
