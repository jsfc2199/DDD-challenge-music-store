package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;

public class AccesoryAssociated extends DomainEvent {
    private final AccesoryId accesoryId;

    public AccesoryAssociated(AccesoryId accesoryId) {
        super("sofka.sale.accesoryassociated");
        this.accesoryId = accesoryId;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }
}
