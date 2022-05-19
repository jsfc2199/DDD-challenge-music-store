package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.DrumkitAdded;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.InstrumentCreated;

import java.util.HashSet;

public class InstrumentChange extends EventChange {
    public InstrumentChange(Instrument instrument){
        apply((InstrumentCreated event) ->{
            instrument.manufacturer = event.getManufacturerInstrument();
            instrument.guitars = new HashSet<>();
            instrument.flutes = new HashSet<>();
            instrument.drumkits = new HashSet<>();
        });

        apply((DrumkitAdded event)->{
            if(instrument.drumkits().size()>5){
                throw new IllegalArgumentException("We don't have more drum kits. We are out of stock");
            }
            instrument.drumkits.add(new Drumkit(e))
        });
    }
}
