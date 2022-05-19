package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AllowedWeight;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class StandAdded extends DomainEvent {
    private final StandId standId;
    private final AllowedWeight allowedWeight;
    private final Value valueStand;

    public StandAdded(StandId standId, AllowedWeight allowedWeight, Value value) {
        super("sofka.accesory.standadded");
        this.standId = standId;
        this.allowedWeight = allowedWeight;
        this.valueStand = value;
    }

    public StandId getStandId() {
        return standId;
    }

    public AllowedWeight getAllowedWeight() {
        return allowedWeight;
    }

    public Value getValueStand() {
        return valueStand;
    }
}
