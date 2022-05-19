package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaleInvoice implements ValueObject<Integer> {
    private final Integer value;

    public SaleInvoice(Integer value) {
        this.value = value;
        if(this.value<0){
            throw new IllegalArgumentException("The invoice can't be negative");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleInvoice)) return false;
        SaleInvoice that = (SaleInvoice) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
