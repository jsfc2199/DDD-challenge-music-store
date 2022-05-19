package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class Sale extends AggregateEvent<SaleId> {
    public Sale(SaleId entityId) {
        super(entityId);
    }
}
