package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StandId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class UpdateStandValue extends Command {
    private final AccesoryId accesoryId;
    private final StandId standId;
    private final Value valueStand;

    public UpdateStandValue(AccesoryId accesoryId, StandId standId, Value value) {
        this.accesoryId = accesoryId;
        this.standId = standId;
        this.valueStand = value;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public StandId getStandId() {
        return standId;
    }

    public Value getValueStand() {
        return valueStand;
    }
}
