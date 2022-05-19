package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class UpdateGuitarBrand extends Command {
    private final InstrumentId instrumentId;
    private final GuitarId guitarId;
    private final Brand guitarBrand;

    public UpdateGuitarBrand(InstrumentId instrumentId, GuitarId guitarId, Brand guitarBrand) {
        this.instrumentId = instrumentId;
        this.guitarId = guitarId;
        this.guitarBrand = guitarBrand;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Brand getGuitarBrand() {
        return guitarBrand;
    }
}
