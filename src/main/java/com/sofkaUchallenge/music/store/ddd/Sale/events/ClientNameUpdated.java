package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;

public class ClientNameUpdated extends DomainEvent {
    private final ClientId clientId;
    private final Name clientName;

    public ClientNameUpdated(ClientId clientId, Name name) {
        super("sofka.sale.clientnameupdated");
        this.clientId = clientId;
        this.clientName = name;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public Name getClientName() {
        return clientName;
    }
}
