package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.UpdateAccountEmail;

public class UpdateAccountEmailUseCase extends UseCase<RequestCommand<UpdateAccountEmail>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateAccountEmail> updateAccountEmailRequestCommand) {
        var command = updateAccountEmailRequestCommand.getCommand();
        var sale = Sale.from(command.getSaleId(), retrieveEvents(command.getSaleId().value()));
        sale.updateAccountEmail(command.getAccountId(),command.getAccountEmail());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
