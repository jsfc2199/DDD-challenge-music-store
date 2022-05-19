package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StringAccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class StringAccesoryUpdated extends DomainEvent {
    private final StringAccesoryId stringAccesoryId;
    private final Value valueAccesory;

    public StringAccesoryUpdated(StringAccesoryId stringAccesoryId, Value value) {
        super("sofka.accesory.stringaccesoryupdated");
        this.stringAccesoryId = stringAccesoryId;
        this.valueAccesory = value;
    }

    public StringAccesoryId getStringAccesoryId() {
        return stringAccesoryId;
    }

    public Value getValueAccesory() {
        return valueAccesory;
    }
}
