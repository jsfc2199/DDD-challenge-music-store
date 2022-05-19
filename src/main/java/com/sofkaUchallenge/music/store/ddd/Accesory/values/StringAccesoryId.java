package com.sofkaUchallenge.music.store.ddd.Accesory.values;

import co.com.sofka.domain.generic.Identity;

public class StringAccesoryId extends Identity {

    private StringAccesoryId(String id) {
        super(id);
    }

    public StringAccesoryId() {
    }

    public static StringAccesoryId of(String id){
        return new StringAccesoryId(id);
    }
}
