package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class ChangeDrumkitBrand extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final Brand drumkitBrand;

    public ChangeDrumkitBrand(InstrumentId instrumentId, DrumkitId drumkitId, Brand drumkitBrand) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitBrand = drumkitBrand;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Brand getDrumkitBrand() {
        return drumkitBrand;
    }
}
