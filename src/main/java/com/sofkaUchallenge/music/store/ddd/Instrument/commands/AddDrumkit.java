package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

public class AddDrumkit extends Command {
    private final InstrumentId instrumentId;
    private final DrumkitId drumkitId;
    private final Type drumkitType;
    private final Brand drumkitBrand;
    private final Value drumkitValue;
    private final DrumNumber drumkitDrumNumber;
    private final CymbalNumber drumkitCymbalNumber;

    public AddDrumkit(InstrumentId instrumentId, DrumkitId drumkitId, Type drumkitType, Brand drumkitBrand, Value drumkitValue,
                      DrumNumber drumkitDrumNumber, CymbalNumber drumkitCymbalNumber) {
        this.instrumentId = instrumentId;
        this.drumkitId = drumkitId;
        this.drumkitType = drumkitType;
        this.drumkitBrand = drumkitBrand;
        this.drumkitValue = drumkitValue;
        this.drumkitDrumNumber = drumkitDrumNumber;
        this.drumkitCymbalNumber = drumkitCymbalNumber;
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

    public Brand getDrumkitBrand() {
        return drumkitBrand;
    }

    public Value getDrumkitValue() {
        return drumkitValue;
    }

    public DrumNumber getDrumkitDrumNumber() {
        return drumkitDrumNumber;
    }

    public CymbalNumber getDrumkitCymbalNumber() {
        return drumkitCymbalNumber;
    }
}
