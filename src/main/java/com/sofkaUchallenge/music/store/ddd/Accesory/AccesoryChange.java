package com.sofkaUchallenge.music.store.ddd.Accesory;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.*;

import java.util.HashSet;

public class AccesoryChange extends EventChange {
    public AccesoryChange(Accesory accesory){

        apply((AccesoryCreated event)->{
            accesory.manufacturer = event.getManufacturer();
            accesory.cases = new HashSet<>();
            accesory.stands = new HashSet<>();
            accesory.stringAccesories = new HashSet<>();
        });

        apply((CaseAdded event) ->{
            if(accesory.cases().size()>15){
                throw new IllegalArgumentException("We don't have more that 15 cases, we are out of stock");
            }
            accesory.cases.add(new Case(event.getCaseId(), event.getType(), event.getBrand(), event.getCaseValue()));
        });

        apply((CaseTypeAdded event) ->{
            var caseToaAdd = accesory.getCaseById(event.getCaseId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the case"));
            caseToaAdd.addType(event.getType());
        });

        apply((CaseValueUpdated event) ->{
            var valueCaseToUpdate = accesory.getCaseById(event.getCaseId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the case"));
            valueCaseToUpdate.updateValue(event.getValueCase());
        });

        apply((ManufacturerAdded event) ->{
            accesory.manufacturer = event.getManufacturer();
        });

        apply((StandAdded event)->{
            if(accesory.stands().size()>10){
                throw new IllegalArgumentException("We don't have more stands, we are out of stock");
            }
            accesory.stands.add(new Stand(event.getStandId(), event.getAllowedWeight(), event.getValueStand()));
        });

        apply((StandAllowableWeightUpdated event)->{
           var standWeightToBeUpdate = accesory.getStandById(event.getStandId()).orElseThrow(()->
                   new IllegalArgumentException("Wrong Id to reach the stand"));
           standWeightToBeUpdate.updateAllowedWeight(event.getAllowedWeight());
        });

        apply((StandValueUpdated e)->{
            var standValueToBeUpdate = accesory.getStandById(e.getStandId()).orElseThrow(()->
                    new IllegalArgumentException("Wrong Id to reach the stand"));
            standValueToBeUpdate.updateValue(e.getValueStand());
        });

        apply((StringAccesoryAdded event)->{
            if(accesory.stringAccesories().size()>75){
                throw new IllegalArgumentException("We don't have more strings, we are out of stock");
            }
            accesory.stringAccesories.add(new StringAccesory(event.getStringAccesoryId(), event.getValueString()));
        });

        apply((StringAccesoryUpdated event)->{
            var stringToBeUpdated = accesory.getStringAccesoryById(event.getStringAccesoryId())
                    .orElseThrow(()->new IllegalArgumentException("Wrong Id to reach the string"));
            stringToBeUpdated.updateStringAccesoryValue(event.getValueAccesory());
        });
    }
}
