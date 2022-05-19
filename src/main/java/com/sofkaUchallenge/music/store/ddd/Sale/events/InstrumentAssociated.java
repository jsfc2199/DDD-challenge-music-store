package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;

public class InstrumentAssociated extends DomainEvent {
    private final InstrumentId instrumentId;

    public InstrumentAssociated(InstrumentId instrumentId) {
        super("sofka.sale.instrumentassociated");
        this.instrumentId = instrumentId;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }
}
