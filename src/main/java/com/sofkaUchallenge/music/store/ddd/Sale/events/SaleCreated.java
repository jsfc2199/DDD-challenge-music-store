package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;

public class SaleCreated extends DomainEvent {
    private final SaleInvoice saleInvoice;
    public SaleCreated(SaleInvoice saleInvoice) {
        super("sofka.sale.salecreated");
        this.saleInvoice = saleInvoice;
    }

    public SaleInvoice getSaleInvoice() {
        return saleInvoice;
    }
}
