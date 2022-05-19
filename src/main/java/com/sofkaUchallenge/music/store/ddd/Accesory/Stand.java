package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AllowedWeight;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

import java.util.Objects;

public class Stand extends Entity<StandId> {
    private AllowedWeight standAllowedWeight;
    private Value standValue;

    public Stand(StandId entityId, AllowedWeight allowedWeight, Value value) {
        super(entityId);
        this.standAllowedWeight = allowedWeight;
        this.standValue = value;
    }

    public AllowedWeight standAllowedWeight() {
        return standAllowedWeight;
    }

    public Value standValue() {
        return standValue;
    }

    public void updateAllowedWeight(AllowedWeight allowedWeight){
        this.standAllowedWeight = Objects.requireNonNull(allowedWeight);
    }

    public void updateValue(Value value){
        this.standValue = value;
    }
}
