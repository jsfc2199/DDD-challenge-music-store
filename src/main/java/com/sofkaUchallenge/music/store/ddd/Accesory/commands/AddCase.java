package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.*;

public class AddCase extends Command {
    private final AccesoryId accesoryId;
    private final CaseId caseId;
    private final Type type;
    private final Brand brand;
    private final Value value;

    public AddCase(AccesoryId accesoryId, CaseId caseId, Type type, Brand brand, Value value) {
        this.accesoryId = accesoryId;
        this.caseId = caseId;
        this.type = type;
        this.brand = brand;
        this.value = value;
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

    public Brand getBrand() {
        return brand;
    }

    public Value getValue() {
        return value;
    }
}
