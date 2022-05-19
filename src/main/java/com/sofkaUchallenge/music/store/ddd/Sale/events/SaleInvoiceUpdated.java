package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;

public class SaleInvoiceUpdated extends DomainEvent {
    private final SaleInvoice saleInvoice;

    public SaleInvoiceUpdated(SaleInvoice saleInvoice) {
        super("sofka.sale.saleinvoiceupdated");
        this.saleInvoice = saleInvoice;
    }

    public SaleInvoice getSaleInvoice() {
        return saleInvoice;
    }
}
