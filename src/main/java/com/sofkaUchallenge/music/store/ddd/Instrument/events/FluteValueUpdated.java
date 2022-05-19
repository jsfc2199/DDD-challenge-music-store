package com.sofkaUchallenge.music.store.ddd.Instrument.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Value;

public class FluteValueUpdated extends DomainEvent {
    private final FluteId fluteId;
    private final Value fluteValue;

    public FluteValueUpdated(FluteId fluteId, Value value) {
        super("sofka.instrument.flutevalueupdated");
        this.fluteId = fluteId;
        this.fluteValue = value;
    }

    public FluteId getFluteId() {
        return fluteId;
    }

    public Value getFluteValue() {
        return fluteValue;
    }
}
