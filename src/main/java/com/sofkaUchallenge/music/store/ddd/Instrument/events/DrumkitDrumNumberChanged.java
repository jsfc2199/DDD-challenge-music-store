package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumNumber;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;

public class DrumkitDrumNumberChanged extends DomainEvent {
    private final DrumkitId drumkitId;
    private final DrumNumber drumkitDrumNumber;

    public DrumkitDrumNumberChanged(DrumkitId drumkitId, DrumNumber drumNumber) {
        super("sofka.instrument.drumkitdrumnumberchanged");
        this.drumkitId = drumkitId;
        this.drumkitDrumNumber = drumNumber;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public DrumNumber getDrumkitDrumNumber() {
        return drumkitDrumNumber;
    }
}
