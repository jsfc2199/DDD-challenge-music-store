package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Type;

public class ChangeCaseTyoe extends Command {
    private final AccesoryId accesoryId;
    private final CaseId caseId;
    private final Type type;

    public ChangeCaseTyoe(AccesoryId accesoryId, CaseId caseId, Type type) {
        this.accesoryId = accesoryId;
        this.caseId = caseId;
        this.type = type;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public CaseId getCaseId() {
        return caseId;
    }

    public Type getType() {
        return type;
    }
}
