package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.FluteId;

public class Flute extends Entity<FluteId> {
    public Flute(FluteId entityId) {
        super(entityId);
    }
}
