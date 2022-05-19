package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SellerId;

public class SellerAdded extends DomainEvent {
    private final SellerId sellerId;
    private final Name sellerName;

    public SellerAdded(SellerId sellerId, Name sellerName) {
        super("sofka.sale.selleradded");
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    public SellerId getSellerId() {
        return sellerId;
    }

    public Name getSellerName() {
        return sellerName;
    }
}
