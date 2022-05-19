package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

public class AddGuitar extends Command {
    private final InstrumentId instrumentId;
    private final GuitarId guitarId;
    private final Type guitarType;
    private final Brand guitarBrand;
    private final Color guitarColor;
    private final Value guitarValue;

    public AddGuitar(InstrumentId instrumentId, GuitarId guitarId, Type guitarType, Brand guitarBrand, Color guitarColor, Value guitarValue) {
        this.instrumentId = instrumentId;
        this.guitarId = guitarId;
        this.guitarType = guitarType;
        this.guitarBrand = guitarBrand;
        this.guitarColor = guitarColor;
        this.guitarValue = guitarValue;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
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
