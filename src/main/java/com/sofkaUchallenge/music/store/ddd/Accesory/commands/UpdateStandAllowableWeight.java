package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AllowedWeight;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;

public class UpdateStandAllowableWeight extends Command {
    private final AccesoryId accesoryId;
    private final StandId standId;
    private final AllowedWeight allowedWeight;

    public UpdateStandAllowableWeight(AccesoryId accesoryId, StandId standId, AllowedWeight allowedWeight) {
        this.accesoryId = accesoryId;
        this.standId = standId;
        this.allowedWeight = allowedWeight;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public StandId getStandId() {
        return standId;
    }

    public AllowedWeight getAllowedWeight() {
        return allowedWeight;
    }
}
