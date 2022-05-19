package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class Instrument extends AggregateEvent<InstrumentId> {
    public Instrument(InstrumentId entityId) {
        super(entityId);
    }
}
