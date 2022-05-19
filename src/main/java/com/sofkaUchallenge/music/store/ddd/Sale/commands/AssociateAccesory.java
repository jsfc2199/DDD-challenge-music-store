package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class AssociateAccesory extends Command {
    private final SaleId saleId;
    private final AccesoryId accesoryId;

    public AssociateAccesory(SaleId saleId, AccesoryId accesoryId) {
        this.saleId = saleId;
        this.accesoryId = accesoryId;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }
}
