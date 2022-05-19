package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class UpdateCaseValue {
    private final AccesoryId accesoryId;
    private final CaseId caseId;
    private final Value valueCase;

    public UpdateCaseValue(AccesoryId accesoryId, CaseId caseId, Value valueCase) {
        this.accesoryId = accesoryId;
        this.caseId = caseId;
        this.valueCase = valueCase;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public CaseId getCaseId() {
        return caseId;
    }

    public Value getValueCase() {
        return valueCase;
    }
}
