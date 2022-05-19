package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;

public class Accesory extends AggregateEvent<AccesoryId> {
    public Accesory(AccesoryId entityId) {
        super(entityId);
    }
}
