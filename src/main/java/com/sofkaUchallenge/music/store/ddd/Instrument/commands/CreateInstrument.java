package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;

public class CreateInstrument extends Command {
    private final InstrumentId instrumentId;
    private final Manufacturer manufacturerInstrument;

    public CreateInstrument(InstrumentId instrumentId, Manufacturer manufacturer) {
        this.instrumentId = instrumentId;
        this.manufacturerInstrument = manufacturer;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public Manufacturer getManufacturerInstrument() {
        return manufacturerInstrument;
    }
}
