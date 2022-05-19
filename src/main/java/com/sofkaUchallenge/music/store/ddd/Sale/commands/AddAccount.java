package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Email;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Username;

public class AddAccount extends Command {
    private final SaleId saleId;
    private final AccountId accountId;
    private final Email accountEmail;
    private final Username accountUsername;

    public AddAccount(SaleId saleId, AccountId accountId, Email accountEmail, Username accountUsername) {
        this.saleId = saleId;
        this.accountId = accountId;
        this.accountEmail = accountEmail;
        this.accountUsername = accountUsername;
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

    public Username getAccountUsername() {
        return accountUsername;
    }
}
