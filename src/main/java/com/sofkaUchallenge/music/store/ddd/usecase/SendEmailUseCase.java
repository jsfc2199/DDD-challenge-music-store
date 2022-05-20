package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.events.SaleCreated;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class SendEmailUseCase extends UseCase<TriggeredEvent<SaleCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<SaleCreated> saleCreatedTriggeredEvent) {
        var event = saleCreatedTriggeredEvent.getDomainEvent();
        var sale = Sale.from(SaleId.of(event.aggregateRootId()), this.retrieveEvents());
        sale.sendEmailToClient("Your purchase has been a success");

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
