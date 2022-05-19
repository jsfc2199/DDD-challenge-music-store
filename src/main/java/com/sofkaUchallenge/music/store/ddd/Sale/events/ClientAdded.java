package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.StreetAdress;

public class ClientAdded extends DomainEvent {
    private final ClientId clientId;
    private final Name clientName;
    private final StreetAdress clientStreetAdress;

    public ClientAdded(ClientId clientId, Name name, StreetAdress streetAdress) {
        super("sofka.sale.clientadded");
        this.clientId = clientId;
        this.clientName = name;
        this.clientStreetAdress = streetAdress;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public Name getClientName() {
        return clientName;
    }

    public StreetAdress getClientStreetAdress() {
        return clientStreetAdress;
    }
}
