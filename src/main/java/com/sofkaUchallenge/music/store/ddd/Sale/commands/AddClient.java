package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.StreetAdress;

public class AddClient extends Command {
    private final SaleId saleId;
    private final ClientId clientId;
    private final Name clientName;
    private final StreetAdress clientStreetAdress;

    public AddClient(SaleId saleId, ClientId clientId, Name clientName, StreetAdress clientStreetAdress) {
        this.saleId = saleId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientStreetAdress = clientStreetAdress;
    }

    public SaleId getSaleId() {
        return saleId;
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
