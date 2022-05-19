package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

public class GuitarAdded extends DomainEvent {
    private final GuitarId guitarId;
    private final Type guitarType;
    private final Brand guitarBrand;
    private final Color guitarColor;
    private final Value guitarValue;

    public GuitarAdded(GuitarId guitarId, Type type, Brand brand, Color color, Value value) {
        super("sofka.instrument.guitaradded");
        this.guitarId = guitarId;
        this.guitarType = type;
        this.guitarBrand = brand;
        this.guitarColor = color;
        this.guitarValue = value;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Type getGuitarType() {
        return guitarType;
    }

    public Brand getGuitarBrand() {
        return guitarBrand;
    }

    public Color getGuitarColor() {
        return guitarColor;
    }

    public Value getGuitarValue() {
        return guitarValue;
    }
}
