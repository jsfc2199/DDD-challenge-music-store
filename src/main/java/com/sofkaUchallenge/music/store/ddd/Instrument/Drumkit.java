package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

import java.util.Objects;

public class Drumkit extends Entity<DrumkitId> {
    private Type drumType;
    private Brand drumBrand;
    private Value drumValue;
    private DrumNumber drumsNumber;
    private CymbalNumber cymbalsNumber;

    public Drumkit(DrumkitId entityId, Type type, Brand brand, Value value, DrumNumber drumNumber, CymbalNumber cymbalNumber) {
        super(entityId);
        this.drumType = type;
        this.drumBrand = brand;
        this.drumValue = value;
        this.drumsNumber = drumNumber;
        this.cymbalsNumber = cymbalNumber;
    }



    public Type drumType() {
        return drumType;
    }

    public Brand dumBrand() {
        return drumBrand;
    }

    public Value drumValue() {
        return drumValue;
    }

    public DrumNumber drumsNumber() {
        return drumsNumber;
    }

    public CymbalNumber cymbalsNumber() {
        return cymbalsNumber;
    }

    public void changeDrumBrand(Brand brand){
        this.drumBrand = Objects.requireNonNull(brand);
    }

    public void updateDrumValue(Value value){
        this.drumValue = Objects.requireNonNull(value);
    }

    public void changeDrumType(Type type){
        this.drumType = Objects.requireNonNull(type);
    }

    public void changeDrumCymbalNumber(CymbalNumber cymbalNumber){
        this.cymbalsNumber = Objects.requireNonNull(cymbalNumber);
    }

    public void changeDrumsNumber(DrumNumber drumNumber){
        this.drumsNumber = Objects.requireNonNull(drumNumber);
    }
}
