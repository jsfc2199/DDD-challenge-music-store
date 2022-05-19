package com.sofkaUchallenge.music.store.ddd.Accesory.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.StringAccesoryId;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.Value;

public class StringAccesoryAdded extends DomainEvent {
    private final StringAccesoryId stringAccesoryId;
    private final Value valueString;
    public StringAccesoryAdded(StringAccesoryId stringAccesoryId, Value value) {
        super("sofka.accesory.stringaccesoryadded");
        this.stringAccesoryId = stringAccesoryId;
        this.valueString = value;
    }

    public StringAccesoryId getStringAccesoryId() {
        return stringAccesoryId;
    }

    public Value getValueString() {
        return valueString;
    }
}
