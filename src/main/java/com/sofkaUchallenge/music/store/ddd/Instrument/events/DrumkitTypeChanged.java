package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Type;

public class DrumkitTypeChanged extends DomainEvent {
    private final DrumkitId drumkitId;
    private final Type drumkitType;

    public DrumkitTypeChanged(DrumkitId drumkitId, Type type) {
        super("sofka.instrument.drumkittypechanged");
        this.drumkitId = drumkitId;
        this.drumkitType = type;
    }

    public DrumkitId getDrumkitId() {
        return drumkitId;
    }

    public Type getDrumkitType() {
        return drumkitType;
    }
}
