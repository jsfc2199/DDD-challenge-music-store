package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.*;

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
            instrument.drumkits.add(new Drumkit(event.getDrumkitId(), event.getDrumkitType(), event.getDrumkitBrand(), event.getDrumkitValue(),
                    event.getDrumkitDrumNumber(), event.getDrumkitCymbalNumber()));
        });

        apply((DrumkitBrandChanged event)->{
            var brandToChange = instrument.getDrumkitById(event.getDrumkitId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the drum kit"));
            brandToChange.changeDrumBrand(event.getDrumkitBrand());
        });

        apply((DrumkitCymbalNumberChanged event)->{
            var cymbalNumberToChange = instrument.getDrumkitById(event.getDrumkitId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the drum kit"));
            cymbalNumberToChange.changeDrumCymbalNumber(event.getDrumkitCymbalNumber());
        });

        apply((DrumkitDrumNumberChanged event)->{
            var drumNumberToChange = instrument.getDrumkitById(event.getDrumkitId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the drum kit"));
            drumNumberToChange.changeDrumsNumber(event.getDrumkitDrumNumber());
        });

        apply((DrumkitTypeChanged event)->{
            var typeToChange = instrument.getDrumkitById(event.getDrumkitId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the drum kit"));
            typeToChange.changeDrumType(event.getDrumkitType());
        });

        apply((DrumkitValueUpdated event)->{
            var valueToUpdate= instrument.getDrumkitById(event.getDrumkitId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the drum kit"));
            valueToUpdate.updateDrumValue(event.getDrumkitValue());
        });

        apply((FluteAdded event)->{
            if(instrument.flutes().size()>70){
                throw new IllegalArgumentException("We don't have more flutes. We are out of stock");
            }
            instrument.flutes.add(new Flute(event.getFluteId(), event.getFluteBrand(), event.getFluteValue()));
        });

        apply((FluteBrandChanged event)->{
            var brandToChange = instrument.getFlutetById(event.getFluteId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the flute"));
            brandToChange.changeFluteBrand(event.getFluteBrand());
        });

        apply((FluteValueUpdated event)->{
            var valueToUpdate = instrument.getFlutetById(event.getFluteId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the flute"));
            valueToUpdate.updateFluteValue(event.getFluteValue());
        });

        apply((GuitarAdded event)->{
            if (instrument.guitars().size() > 120) {
                throw new IllegalArgumentException("We don't have more flutes. We are out of stock");
            }
            instrument.guitars.add(new Guitar(event.getGuitarId(), event.getGuitarType(), event.getGuitarBrand(), event.getGuitarValue(), event.getGuitarColor()));
        });

        apply((GuitarBrandUpdated event)->{
           var brandToUpdate = instrument.getGuitarById(event.getGuitarId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the guitar"));
           brandToUpdate.changeGuitarBrand(event.getGuitarBrand());
        });

        apply((GuitarTypeUpdated event)->{
           var typeToUpdate =  instrument.getGuitarById(event.getGuitarId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the guitar"));
           typeToUpdate.changeGuitarType(event.getGuitarType());
        });

        apply((GuitarValueUpdated event)->{
            var valueToUpdate = instrument.getGuitarById(event.getGuitarId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the guitar"));
            valueToUpdate.updateGuitarValue(event.getGuitarValue());
        });

        apply((ManufacturerAdded event)->{
            instrument.manufacturer = event.getManufacturerInstrument();
        });
    }
}
