package com.sofkaUchallenge.music.store.ddd.Accesory.values;

import co.com.sofka.domain.generic.Identity;

public class AccesoryId extends Identity {
    public AccesoryId() {
    }

    private AccesoryId(String id) {
        super(id);
    }

    public static AccesoryId of(String id){
        return new AccesoryId(id);
    }
}
