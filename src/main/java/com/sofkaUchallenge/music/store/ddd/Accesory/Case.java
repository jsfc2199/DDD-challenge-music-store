package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;

public class Case extends Entity<CaseId> {
    public Case(CaseId entityId) {
        super(entityId);
    }
}
