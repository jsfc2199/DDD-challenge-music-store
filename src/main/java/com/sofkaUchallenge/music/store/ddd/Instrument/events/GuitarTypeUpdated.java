package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Type;

public class GuitarTypeUpdated extends DomainEvent {
    private final GuitarId guitarId;
    private final Type guitarType;

    public GuitarTypeUpdated(GuitarId guitarId, Type type) {
        super("sofka.instrument.guitartypeupdated");
        this.guitarId = guitarId;
        this.guitarType = type;
    }

    public GuitarId getGuitarId() {
        return guitarId;
    }

    public Type getGuitarType() {
        return guitarType;
    }
}
