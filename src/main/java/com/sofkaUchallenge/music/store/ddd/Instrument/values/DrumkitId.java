package com.sofkaUchallenge.music.store.ddd.Instrument.values;

import co.com.sofka.domain.generic.Identity;

public class DrumkitId extends Identity {

    private DrumkitId(String id) {
        super(id);
    }

    public DrumkitId() {
    }

    public static DrumkitId of(String id){
        return new DrumkitId(id);
    }
}
