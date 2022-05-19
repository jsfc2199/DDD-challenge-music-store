package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Type;

public class ChangeDrumkitType extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final Type drumkitType;

    public ChangeDrumkitType(InstrumentId instrumentId, DrumkitId drumkitId, Type drumkitType) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitType = drumkitType;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Type getDrumkitType() {
        return drumkitType;
    }
}
