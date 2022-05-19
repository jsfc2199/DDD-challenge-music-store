package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Type;

public class UpdateGuitarType extends Command {
    private final InstrumentId instrumentId;
    private final GuitarId guitarId;
    private final Type guitarType;

    public UpdateGuitarType(InstrumentId instrumentId, GuitarId guitarId, Type guitarType) {
        this.instrumentId = instrumentId;
        this.guitarId = guitarId;
        this.guitarType = guitarType;
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
}
