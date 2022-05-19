package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class CaseValueUpdated extends DomainEvent {
    private final CaseId caseId;
    private final Value valueCase;

    public CaseValueUpdated(CaseId caseId, Value value) {
        super("sofka.accesory.casevalueupdated");
        this.caseId = caseId;
        this.valueCase = value;
    }

    public CaseId getCaseId() {
        return caseId;
    }

    public Value getValueCase() {
        return valueCase;
    }
}
