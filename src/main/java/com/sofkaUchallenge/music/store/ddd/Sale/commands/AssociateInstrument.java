package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class AssociateInstrument extends Command {
    private final SaleId saleId;
    private final InstrumentId instrumentId;

    public AssociateInstrument(SaleId saleId, InstrumentId instrumentId) {
        this.saleId = saleId;
        this.instrumentId = instrumentId;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }
}
