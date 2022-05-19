package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SellerId;

public class Seller extends Entity<SellerId> {
    public Seller(SellerId entityId) {
        super(entityId);
    }
}
