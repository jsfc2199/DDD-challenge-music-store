package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class AddFlute extends Command {
    private final InstrumentId instrumentId;
    private final FluteId fluteId;
    private final Brand fluteBrand;
    private final Value fluteValue;

    public AddFlute(InstrumentId instrumentId, FluteId fluteId, Brand brand, Value value) {
        this.instrumentId = instrumentId;
        this.fluteId = fluteId;
        this.fluteBrand = brand;
        this.fluteValue = value;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public FluteId getFluteId() {
        return fluteId;
    }

    public Brand getFluteBrand() {
        return fluteBrand;
    }

    public Value getFluteValue() {
        return fluteValue;
    }
}
