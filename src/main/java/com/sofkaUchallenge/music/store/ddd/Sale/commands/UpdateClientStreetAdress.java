package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.StreetAdress;

public class UpdateClientStreetAdress extends Command {
    private final SaleId saleId;
    private final ClientId clientId;
    private final StreetAdress clientStreetAdress;

    public UpdateClientStreetAdress(SaleId saleId, ClientId clientId, StreetAdress clientStreetAdress) {
        this.saleId = saleId;
        this.clientId = clientId;
        this.clientStreetAdress = clientStreetAdress;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public StreetAdress getClientStreetAdress() {
        return clientStreetAdress;
    }
}
