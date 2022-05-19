package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

public class DrumkitAdded extends DomainEvent {
    private final DrumkitId drumkitId;
    private final Type drumkitType;
    private final Brand drumkitBrand;
    private final Value drumkitValue;
    private final DrumNumber drumkitDrumNumber;
    private final CymbalNumber drumkitCymbalNumber;

    public DrumkitAdded(DrumkitId drumkitId, Type type, Brand brand, Value value, DrumNumber drumNumber, CymbalNumber cymbalNumber) {
        super("sofka.instrument.drumkitadded");
        this.drumkitId = drumkitId;
        this.drumkitType = type;
        this.drumkitBrand = brand;
        this.drumkitValue = value;
        this.drumkitDrumNumber = drumNumber;
        this.drumkitCymbalNumber = cymbalNumber;
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
