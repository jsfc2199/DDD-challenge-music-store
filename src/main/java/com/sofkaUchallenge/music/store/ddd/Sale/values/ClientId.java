package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.Identity;

public class ClientId extends Identity {
    public ClientId() {
    }

    private ClientId(String id) {
        super(id);
    }

    public static ClientId of(String id){
        return new ClientId(id);
    }
}
