package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumNumber;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class ChangeDrumKitDrumNumber extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final DrumNumber drumkitDrumNumber;

    public ChangeDrumKitDrumNumber(InstrumentId instrumentId, DrumkitId drumkitId, DrumNumber drumkitDrumNumber) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitDrumNumber = drumkitDrumNumber;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public DrumNumber getDrumkitDrumNumber() {
        return drumkitDrumNumber;
    }
}
