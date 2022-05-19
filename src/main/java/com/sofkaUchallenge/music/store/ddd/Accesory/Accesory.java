package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.*;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Accesory extends AggregateEvent<AccesoryId> {
    protected Manufacturer manufacturer;
    protected Set<Case> cases;
    protected Set<Stand> stands;
    protected Set<StringAccesory> stringAccesories;

    public Accesory(AccesoryId entityId, Manufacturer manufacturer) {
        super(entityId);
        appendChange(new AccesoryCreated(manufacturer)).apply();
    }

    private Accesory(AccesoryId entityId){
        super(entityId);
        subscribe(new AccesoryChange(this));
    }

    public static Accesory from(AccesoryId accesoryId, List<DomainEvent> events){
        var accesory = new Accesory(accesoryId);
        events.forEach(accesory::applyEvent);
        return accesory;
    }

    //behaviors
    public void addManufacturer(Manufacturer manufacturer){
        Objects.requireNonNull(manufacturer);
        appendChange(new ManufacturerAdded(manufacturer)).apply();
    }

    public void addCase(CaseId caseId, Type type, Brand brand, Value value){
        Objects.requireNonNull(caseId);
        Objects.requireNonNull(type);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(value);
        appendChange(new CaseAdded(caseId, type, brand, value)).apply();
    }

    public void changeCaseTyoe(CaseId caseId, Type type){
        Objects.requireNonNull(caseId);
        Objects.requireNonNull(type);
        appendChange(new CaseTypeAdded(caseId,type)).apply();
    }

    public void updateCaseValue(CaseId caseId, Value value){
        Objects.requireNonNull(caseId);
        Objects.requireNonNull(value);
        appendChange(new CaseValueUpdated(caseId,value)).apply();
    }

    public void addStringAccesory(StringAccesoryId stringAccesoryId, Value value){
        Objects.requireNonNull(stringAccesoryId);
        Objects.requireNonNull(value);
        appendChange(new StringAccesoryAdded(stringAccesoryId,value)).apply();
    }

    public void updateStringAccesory(StringAccesoryId stringAccesoryId, Value value){
        Objects.requireNonNull(stringAccesoryId);
        Objects.requireNonNull(value);
        appendChange(new StringAccesoryUpdated(stringAccesoryId,value)).apply();
    }

    public void addStand(StandId standId, AllowedWeight allowedWeight, Value value){
        Objects.requireNonNull(standId);
        Objects.requireNonNull(allowedWeight);
        Objects.requireNonNull(value);
        appendChange(new StandAdded(standId,allowedWeight,value)).apply();
    }

    public void updateStandAllowableWeight(StandId standId,AllowedWeight allowedWeight){
        Objects.requireNonNull(standId);
        Objects.requireNonNull(allowedWeight);
        appendChange(new StandAllowableWeightUpdated(standId,allowedWeight)).apply();
    }

    public void updateStandValue(StandId standId, Value value){
        Objects.requireNonNull(standId);
        Objects.requireNonNull(value);
        appendChange(new StandValueUpdated(standId,value)).apply();
    }

    public Optional<Case> getCaseById(CaseId caseId){
        return cases().stream().filter(caseElement -> caseElement.identity().equals(caseId)).findFirst();
    }

    public Optional<Stand> getStandById(StandId standId){
        return stands().stream().filter(stand -> stand.identity().equals(standId)).findFirst();
    }

    public Optional<StringAccesory> getStringAccesoryById(StringAccesoryId stringAccesoryId){
        return stringAccesories().stream().filter(stringAccesory -> stringAccesory.identity().equals(stringAccesoryId)).findFirst();
    }

    //--------------
    public Manufacturer manufacturer() {
        return manufacturer;
    }

    public Set<Case> cases() {
        return cases;
    }

    public Set<Stand> stands() {
        return stands;
    }

    public Set<StringAccesory> stringAccesories() {
        return stringAccesories;
    }
}
