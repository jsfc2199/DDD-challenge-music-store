package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.DrumkitId;

public class Drumkit extends Entity<DrumkitId> {
    public Drumkit(DrumkitId entityId) {
        super(entityId);
    }
}
