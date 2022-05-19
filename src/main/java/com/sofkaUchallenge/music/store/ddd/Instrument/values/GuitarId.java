package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.Identity;

public class GuitarId extends Identity {

    public GuitarId() {
    }

    private GuitarId(String id) {
        super(id);
    }

    public static GuitarId of(String id){
        return new GuitarId(id);
    }
}
