package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.UpdateClientStreetAdress;

public class UpdateClientStreetAdressUseCase extends UseCase<RequestCommand<UpdateClientStreetAdress>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateClientStreetAdress> updateClientStreetAdressRequestCommand) {
        var command = updateClientStreetAdressRequestCommand.getCommand();
        var sale = Sale.from(command.getSaleId(), retrieveEvents(command.getSaleId().value()));

        sale.updateClientStreetAdress(command.getClientId(), command.getClientStreetAdress());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
