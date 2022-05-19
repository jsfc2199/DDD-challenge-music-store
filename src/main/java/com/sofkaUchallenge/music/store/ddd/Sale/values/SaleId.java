package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.Identity;

public class SaleId extends Identity {
    public SaleId() {
    }

    private SaleId(String id) {
        super(id);
    }

    public static SaleId of(String id){
        return new SaleId(id);
    }
}
