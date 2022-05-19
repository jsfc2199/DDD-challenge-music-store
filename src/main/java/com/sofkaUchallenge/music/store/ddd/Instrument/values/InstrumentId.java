package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.Identity;

public class InstrumentId extends Identity {
    private InstrumentId(String id) {
        super(id);
    }

    public InstrumentId() {
    }

    public static InstrumentId of(String id){
        return new InstrumentId(id);
    }
}
