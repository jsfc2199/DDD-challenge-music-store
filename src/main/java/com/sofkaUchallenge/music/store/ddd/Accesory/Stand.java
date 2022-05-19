package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;

public class Stand extends Entity<StandId> {
    public Stand(StandId entityId) {
        super(entityId);
    }
}
