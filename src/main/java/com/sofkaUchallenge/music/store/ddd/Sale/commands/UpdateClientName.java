package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.ClientId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class UpdateClientName extends Command {
    private final SaleId saleId;
    private final ClientId clientId;
    private final Name clientName;

    public UpdateClientName(SaleId saleId, ClientId clientId, Name clientName) {
        this.saleId = saleId;
        this.clientId = clientId;
        this.clientName = clientName;
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
}
