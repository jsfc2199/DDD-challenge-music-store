package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class StandValueUpdated extends DomainEvent {
    private final StandId standId;
    private final Value valueStand;

    public StandValueUpdated(StandId standId, Value value) {
        super("sofka.accesory.standvalueupdated");
        this.standId = standId;
        this.valueStand = value;
    }

    public StandId getStandId() {
        return standId;
    }

    public Value getValueStand() {
        return valueStand;
    }
}
