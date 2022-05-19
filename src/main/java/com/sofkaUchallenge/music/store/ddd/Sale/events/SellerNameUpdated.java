package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SellerId;

public class SellerNameUpdated extends DomainEvent {
    private final SellerId sellerId;
    private final Name sellerName;

    public SellerNameUpdated(SellerId sellerId, Name sellerName) {
        super("sofka.sale.sellernameupdated");
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
