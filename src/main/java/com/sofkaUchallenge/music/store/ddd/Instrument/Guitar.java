package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

import java.util.Objects;

public class Guitar extends Entity<GuitarId> {
    private Type guitarType;
    private Brand guitarBrand;
    private Value guitarValue;
    private Color guitarColor;

    public Guitar(GuitarId entityId, Type type, Brand brand, Value value, Color color) {
        super(entityId);
        this.guitarType = type;
        this.guitarBrand = brand;
        this.guitarValue = value;
        this.guitarColor = color;
    }

    public Type guitarType() {
        return guitarType;
    }

    public Brand guitarBrand() {
        return guitarBrand;
    }

    public Value guitarValue() {
        return guitarValue;
    }

    public Color guitarColor() {
        return guitarColor;
    }

    public void changeGuitarBrand(Brand brand){
        this.guitarBrand = Objects.requireNonNull(brand);
    }

    public void updateGuitarValue(Value value){
        this.guitarValue = Objects.requireNonNull(value);
    }

    public void changeGuitarType(Type type){
        this.guitarType = Objects.requireNonNull(type);
    }
}
