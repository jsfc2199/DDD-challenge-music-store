package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Type;

public class CaseTypeAdded extends DomainEvent {
    private final CaseId caseId;
    private final Type type;
    public CaseTypeAdded(CaseId caseId, Type type) {
        super("sofka.accesory.casetypeadded");
        this.caseId = caseId;
        this.type = type;
    }

    public CaseId getCaseId() {
        return caseId;
    }

    public Type getType() {
        return type;
    }
}
