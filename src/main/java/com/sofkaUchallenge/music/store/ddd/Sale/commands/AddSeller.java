package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Name;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SellerId;

public class AddSeller extends Command {
    private final SaleId saleId;
    private final SellerId sellerId;
    private final Name sellerName;

    public AddSeller(SaleId saleId, SellerId sellerId, Name sellerName) {
        this.saleId = saleId;
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public SellerId getSellerId() {
        return sellerId;
    }

    public Name getSellerName() {
        return sellerName;
    }
}
