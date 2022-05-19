package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class UpdateGuitarValue extends Command {
    private final InstrumentId instrumentId;
    private final GuitarId guitarId;
    private final Value guitarValue;

    public UpdateGuitarValue(InstrumentId instrumentId, GuitarId guitarId, Value guitarValue) {
        this.instrumentId = instrumentId;
        this.guitarId = guitarId;
        this.guitarValue = guitarValue;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Value getGuitarValue() {
        return guitarValue;
    }
}
