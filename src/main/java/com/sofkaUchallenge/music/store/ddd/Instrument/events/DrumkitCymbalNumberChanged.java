package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.CymbalNumber;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;

public class DrumkitCymbalNumberChanged extends DomainEvent {
    private final DrumkitId drumkitId;
    private final CymbalNumber drumkitCymbalNumber;

    public DrumkitCymbalNumberChanged(DrumkitId drumkitId, CymbalNumber cymbalNumber) {
        super("sofka.instrument.drumkitcymbalnumberchanged");
        this.drumkitId = drumkitId;
        this.drumkitCymbalNumber = cymbalNumber;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public CymbalNumber getDrumkitCymbalNumber() {
        return drumkitCymbalNumber;
    }
}
