package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.StreetAdress;

public class ClientStreetAdressUpdated extends DomainEvent {
    private final ClientId clientId;
    private final StreetAdress clientStreetAdress;

    public ClientStreetAdressUpdated(ClientId clientId, StreetAdress clientStreetAdress) {
        super("sofka.sale.clientstreetadressupdated");
        this.clientId = clientId;
        this.clientStreetAdress = clientStreetAdress;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public StreetAdress getClientStreetAdress() {
        return clientStreetAdress;
    }
}
