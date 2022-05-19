package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;

public class Client extends Entity<ClientId> {
    public Client(ClientId entityId) {
        super(entityId);
    }
}
