package com.sofkaUchallenge.music.store.ddd.Accesory.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StringAccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class UpdateStringAccesory extends Command {
    private final AccesoryId accesoryId;
    private final StringAccesoryId stringAccesoryId;
    private final Value valueStringAccesory;

    public UpdateStringAccesory(AccesoryId accesoryId, StringAccesoryId stringAccesoryId, Value valueStringAccesory) {
        this.accesoryId = accesoryId;
        this.stringAccesoryId = stringAccesoryId;
        this.valueStringAccesory = valueStringAccesory;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public StringAccesoryId getStringAccesoryId() {
        return stringAccesoryId;
    }

    public Value getValueStringAccesory() {
        return valueStringAccesory;
    }
}
