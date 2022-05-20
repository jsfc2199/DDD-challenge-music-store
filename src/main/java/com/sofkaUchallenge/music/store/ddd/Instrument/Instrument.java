package com.sofkaUchallenge.music.store.ddd.Instrument;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Instrument.events.*;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Instrument extends AggregateEvent<InstrumentId> {
    protected Manufacturer manufacturer;
    protected Set<Guitar> guitars;
    protected Set<Drumkit> drumkits;
    protected Set<Flute> flutes;

    public Instrument(InstrumentId entityId, Manufacturer manufacturer) {
        super(entityId);
        appendChange(new InstrumentCreated(manufacturer)).apply();
    }

    private Instrument(InstrumentId entityId){
        super(entityId);
        subscribe(new InstrumentChange(this));
    }

    public static Instrument from(InstrumentId instrumentId, List<DomainEvent> events){
        var instrument = new Instrument(instrumentId);
        events.forEach(instrument::applyEvent);
        return instrument;
    }

    public void addManufacturer(Manufacturer manufacturer){
        Objects.requireNonNull(manufacturer);
        appendChange(new ManufacturerAdded(manufacturer)).apply();
    }

    public void addGuitar(GuitarId guitarId, Type type, Brand brand, Color color, Value value){
        Objects.requireNonNull(guitarId);
        Objects.requireNonNull(type);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(color);
        Objects.requireNonNull(value);
        appendChange(new GuitarAdded(guitarId,type,brand,color,value)).apply();
    }

    public void updateGuitarBrand(GuitarId guitarId, Brand brand){
        Objects.requireNonNull(guitarId);
        Objects.requireNonNull(brand);
        appendChange(new GuitarBrandUpdated(guitarId,brand)).apply();
    }

    public void updateGuitarType(GuitarId guitarId, Type type){
        Objects.requireNonNull(guitarId);
        Objects.requireNonNull(type);
        appendChange(new GuitarTypeUpdated(guitarId,type)).apply();
    }

    public void updateGuitarValue(GuitarId guitarId, Value value){
        Objects.requireNonNull(guitarId);
        Objects.requireNonNull(value);
        appendChange(new GuitarValueUpdated(guitarId,value)).apply();
    }

    public void addDrumkit(DrumkitId drumkitId, Type type, Brand brand, Value value, DrumNumber drumNumber, CymbalNumber cymbalNumber){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(type);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(value);
        Objects.requireNonNull(drumNumber);
        Objects.requireNonNull(cymbalNumber);
        appendChange(new DrumkitAdded(drumkitId,type,brand,value,drumNumber,cymbalNumber)).apply();
    }

    public void changeDrumkitBrand(DrumkitId drumkitId, Brand brand){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(brand);
        appendChange(new DrumkitBrandChanged(drumkitId,brand)).apply();
    }

    public void updateDrumkitValue(DrumkitId drumkitId, Value value){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(value);
        appendChange(new DrumkitValueUpdated(drumkitId,value));
    }

    public void changeDrumkitType(DrumkitId drumkitId,Type type){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(type);
        appendChange(new DrumkitTypeChanged(drumkitId,type)).apply();
    }

    public void changeDrumkitCymbalNumber(DrumkitId drumkitId,CymbalNumber cymbalNumber){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(cymbalNumber);
        appendChange(new DrumkitCymbalNumberChanged(drumkitId,cymbalNumber)).apply();
    }

    public void changeDrumKitDrumNumber(DrumkitId drumkitId, DrumNumber drumNumber){
        Objects.requireNonNull(drumkitId);
        Objects.requireNonNull(drumNumber);
        appendChange(new DrumkitDrumNumberChanged(drumkitId,drumNumber)).apply();
    }

    public void addFlute(FluteId fluteId, Brand brand, Value value){
        Objects.requireNonNull(fluteId);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(value);
        appendChange(new FluteAdded(fluteId,brand,value)).apply();
    }

    public void changeFluteBrand(FluteId fluteId,Brand brand){
        Objects.requireNonNull(fluteId);
        Objects.requireNonNull(brand);
        appendChange(new FluteBrandChanged(fluteId,brand)).apply();
    }

    public void updateFluteValue(FluteId fluteId, Value value){
        Objects.requireNonNull(fluteId);
        Objects.requireNonNull(value);
        appendChange(new FluteValueUpdated(fluteId,value)).apply();
    }

    public Optional<Guitar> getGuitarById(GuitarId guitarId){
        return guitars().stream().filter(guitar -> guitar.identity().equals(guitarId)).findFirst();
    }

    public Optional<Drumkit> getDrumkitById(DrumkitId drumkitId){
        return drumkits().stream().filter(drumkit -> drumkit.identity().equals(drumkitId)).findFirst();
    }

    public Optional<Flute> getFlutetById(FluteId fluteId){
        return flutes().stream().filter(flute -> flute.identity().equals(fluteId)).findFirst();
    }

    public void notifyToWarehouse(String notification){
        Objects.requireNonNull(notification);
        appendChange(new WarehouseNotified(notification)).apply();
    }

    //----------------
    public Manufacturer manufacturer() {
        return manufacturer;
    }

    public Set<Guitar> guitars() {
        return guitars;
    }

    public Set<Drumkit> drumkits() {
        return drumkits;
    }

    public Set<Flute> flutes() {
        return flutes;
    }
}
