package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class UpdateFluteValue extends Command {
    private final InstrumentId instrumentId;
    private final FluteId fluteId;
    private final Value fluteValue;

    public UpdateFluteValue(InstrumentId instrumentId, FluteId fluteId, Value fluteValue) {
        this.instrumentId = instrumentId;
        this.fluteId = fluteId;
        this.fluteValue = fluteValue;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public FluteId getFluteId() {
        return fluteId;
    }

    public Value getFluteValue() {
        return fluteValue;
    }
}
