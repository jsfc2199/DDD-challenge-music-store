package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Brand;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.CaseId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Type;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

import java.util.Objects;

public class Case extends Entity<CaseId> {
    private Type caseType;
    private Brand caseBrand;
    private Value caseValue;

    public Case(CaseId entityId, Type type, Brand brand, Value value) {
        super(entityId);
        this.caseType = type;
        this.caseBrand = brand;
        this.caseValue = value;
    }

    public Type caseType() {
        return caseType;
    }

    public Brand caseBrand() {
        return caseBrand;
    }

    public Value caseValue() {
        return caseValue;
    }

    public void updateValue(Value value){
        this.caseValue = Objects.requireNonNull(value);
    }

    public void changeType(Type type){
        this.caseType = Objects.requireNonNull(type);
    }
}
