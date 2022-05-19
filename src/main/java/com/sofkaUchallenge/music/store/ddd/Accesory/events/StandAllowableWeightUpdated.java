package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AllowedWeight;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;

public class StandAllowableWeightUpdated extends DomainEvent {
    private final StandId standId;
    private final AllowedWeight allowedWeight;

    public StandAllowableWeightUpdated(StandId standId, AllowedWeight allowedWeight) {
        super("sofka.accesory.standallowableweightupdated");
        this.standId = standId;
        this.allowedWeight = allowedWeight;
    }

    public StandId getStandId() {
        return standId;
    }

    public AllowedWeight getAllowedWeight() {
        return allowedWeight;
    }
}
