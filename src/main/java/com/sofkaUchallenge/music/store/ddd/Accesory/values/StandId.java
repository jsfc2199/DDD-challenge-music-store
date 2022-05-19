package com.sofkaUchallenge.music.store.ddd.Accesory.values;

import co.com.sofka.domain.generic.Identity;

public class StandId extends Identity {
    private StandId(String id) {
        super(id);
    }

    public StandId() {
    }

    public static StandId of(String id){
        return new StandId(id);
    }
}
