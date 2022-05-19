package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class ChangeFluteBrand extends Command {
    private final InstrumentId instrumentId;
    private final FluteId fluteId;
    private final Brand fluteBrand;

    public ChangeFluteBrand(InstrumentId instrumentId, FluteId fluteId, Brand fluteBrand) {
        this.instrumentId = instrumentId;
        this.fluteId = fluteId;
        this.fluteBrand = fluteBrand;
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
}
