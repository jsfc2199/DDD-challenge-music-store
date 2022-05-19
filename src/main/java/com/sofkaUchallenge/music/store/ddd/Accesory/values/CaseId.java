package com.sofkaUchallenge.music.store.ddd.Accesory.values;

import co.com.sofka.domain.generic.Identity;

public class CaseId extends Identity {
    public CaseId() {
    }

    private CaseId(String id) {
        super(id);
    }

    public static CaseId of(String id){
        return new CaseId(id);
    }
}
