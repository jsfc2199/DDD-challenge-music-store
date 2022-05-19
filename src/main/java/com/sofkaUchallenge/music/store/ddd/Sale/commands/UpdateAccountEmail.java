package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Email;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;

public class UpdateAccountEmail extends Command {
    private final SaleId saleId;
    private final AccountId accountId;
    private final Email accountEmail;

    public UpdateAccountEmail(SaleId saleId, AccountId accountId, Email accountEmail) {
        this.saleId = saleId;
        this.accountId = accountId;
        this.accountEmail = accountEmail;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getAccountEmail() {
        return accountEmail;
    }
}
