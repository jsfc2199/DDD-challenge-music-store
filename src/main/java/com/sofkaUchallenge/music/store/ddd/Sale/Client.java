package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.StreetAdress;

public class Client extends Entity<ClientId> {
    private Name clientName;
    private StreetAdress clientStreetAdress;

    public Client(ClientId entityId, Name name, StreetAdress streetAdress) {
        super(entityId);
        this.clientName = name;
        this.clientStreetAdress = streetAdress;
    }

    public Name clientName() {
        return clientName;
    }

    public StreetAdress clientStreetAdress() {
        return clientStreetAdress;
    }

    public void updateClientName (Name name){
        this.clientName = name;
    }

    public void updateClientStreetAdress(StreetAdress streetAdress){
        this.clientStreetAdress = streetAdress;
    }
}
