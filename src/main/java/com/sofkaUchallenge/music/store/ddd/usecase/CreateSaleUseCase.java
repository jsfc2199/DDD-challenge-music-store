package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.CreateSale;

public class CreateSaleUseCase extends UseCase<RequestCommand<CreateSale>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSale> createSaleRequestCommand) {
        var command = createSaleRequestCommand.getCommand();
        var sale = new Sale(command.getSaleId(),command.getSaleInvoice());

        emit().onResponse(new ResponseEvents(
                sale.getUncommittedChanges()
        ));
    }
}
