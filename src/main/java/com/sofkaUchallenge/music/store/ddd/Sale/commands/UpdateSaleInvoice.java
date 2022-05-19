package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;

public class UpdateSaleInvoice extends Command {
    private final SaleId saleId;
    private final SaleInvoice saleInvoice;

    public UpdateSaleInvoice(SaleId saleId, SaleInvoice saleInvoice) {
        this.saleId = saleId;
        this.saleInvoice = saleInvoice;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public SaleInvoice getSaleInvoice() {
        return saleInvoice;
    }
}
