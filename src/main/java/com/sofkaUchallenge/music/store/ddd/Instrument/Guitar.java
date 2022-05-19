package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.GuitarId;

public class Guitar extends Entity<GuitarId> {
    public Guitar(GuitarId entityId) {
        super(entityId);
    }
}
