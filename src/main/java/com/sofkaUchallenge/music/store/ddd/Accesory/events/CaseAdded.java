package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Type;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class CaseAdded extends DomainEvent {
    private final CaseId caseId;
    private final Type type;
    private final Brand brand;
    private final Value caseValue;

    public CaseAdded(CaseId caseId, Type type, Brand brand, Value value) {
        super("sofka.accesory.caseadded");
        this.caseId =caseId;
        this.type = type;
        this.brand = brand;
        this.caseValue = value;
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

    public Value getCaseValue() {
        return caseValue;
    }
}
