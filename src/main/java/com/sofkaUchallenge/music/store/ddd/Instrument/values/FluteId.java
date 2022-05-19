package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.Identity;

public class FluteId extends Identity {
    public FluteId() {
    }

    private FluteId(String id) {
        super(id);
    }

    public static FluteId of(String id){
        return new FluteId(id);
    }
}
