package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.AddAccount;

public class AddAccountUseCase extends UseCase<RequestCommand<AddAccount>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddAccount> addAccountRequestCommand) {
        var command = addAccountRequestCommand.getCommand();
        var sale = Sale.from(
                command.getSaleId(),
                repository().getEventsBy(command.getSaleId().value()));
        sale.addAccount(command.getAccountId(),command.getAccountEmail(),command.getAccountUsername());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
