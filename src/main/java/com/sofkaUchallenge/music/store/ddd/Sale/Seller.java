package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SellerId;

public class Seller extends Entity<SellerId> {
    private Name sellerName;

    public Seller(SellerId entityId, Name name) {
        super(entityId);
        this.sellerName = name;
    }

    public Name sellerName() {
        return sellerName;
    }

    public void updateSellerName(Name name){
        this.sellerName = name;
    }
}
