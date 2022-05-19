package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class UpdateDrumkitValue extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final Value drumkitValue;

    public UpdateDrumkitValue(InstrumentId instrumentId, DrumkitId drumkitId, Value drumkitValue) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitValue = drumkitValue;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Value getDrumkitValue() {
        return drumkitValue;
    }
}
