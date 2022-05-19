package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.CymbalNumber;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class ChangeDrumkitCymbalNumber extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final CymbalNumber drumkitCymbalNumber;

    public ChangeDrumkitCymbalNumber(InstrumentId instrumentId, DrumkitId drumkitId, CymbalNumber drumkitCymbalNumber) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitCymbalNumber = drumkitCymbalNumber;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public CymbalNumber getDrumkitCymbalNumber() {
        return drumkitCymbalNumber;
    }
}
