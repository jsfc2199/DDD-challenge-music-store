package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AllowedWeight;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class AddStand extends Command {
    private final AccesoryId accesoryId;
    private final StandId standId;
    private final AllowedWeight allowedWeight;
    private final Value valueStand;

    public AddStand(AccesoryId accesoryId, StandId standId, AllowedWeight allowedWeight, Value valueStand) {
        this.accesoryId = accesoryId;
        this.standId = standId;
        this.allowedWeight = allowedWeight;
        this.valueStand = valueStand;
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

    public Value getValueStand() {
        return valueStand;
    }
}
