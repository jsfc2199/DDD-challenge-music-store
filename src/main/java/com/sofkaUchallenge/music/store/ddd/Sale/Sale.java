package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;

import java.util.Set;

public class Sale extends AggregateEvent<SaleId> {
    protected SaleInvoice saleInvoice;
    protected Set<Client> clients;
    protected Set<Seller> sellers;
    protected Set<Account> accounts;
    protected InstrumentId instrumentId;
    protected AccesoryId accesoryId;

    public Sale(SaleId entityId) {
        super(entityId);
    }
}
