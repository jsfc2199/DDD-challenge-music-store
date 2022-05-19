package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class DrumkitValueUpdated extends DomainEvent {
    private final DrumkitId drumkitId;
    private final Value drumkitValue;

    public DrumkitValueUpdated(DrumkitId drumkitId, Value value) {
        super("sofka.instrument.drumkitvalueupdated");
        this.drumkitId = drumkitId;
        this.drumkitValue = value;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Value getDrumkitValue() {
        return drumkitValue;
    }
}
