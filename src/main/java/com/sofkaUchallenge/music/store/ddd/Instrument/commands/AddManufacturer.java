package com.sofkaUchallenge.music.store.ddd.Instrument.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.Manufacturer;

public class AddManufacturer extends Command {
    private final InstrumentId instrumentId;
    private final Manufacturer manufacturerInstrument;

    public AddManufacturer(InstrumentId instrumentId, Manufacturer manufacturerInstrument) {
        this.instrumentId = instrumentId;
        this.manufacturerInstrument = manufacturerInstrument;
    }

    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    public Manufacturer getManufacturerInstrument() {
        return manufacturerInstrument;
    }
}
