package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class GuitarValueUpdated extends DomainEvent {
    private final GuitarId guitarId;
    private final Value guitarValue;

    public GuitarValueUpdated(GuitarId guitarId, Value value) {
        super("sofka.instrument.guitarvalueupdated");
        this.guitarId = guitarId;
        this.guitarValue = value;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Value getGuitarValue() {
        return guitarValue;
    }
}
