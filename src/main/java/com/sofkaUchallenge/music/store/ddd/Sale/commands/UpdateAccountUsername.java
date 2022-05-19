package com.sofkaUchallenge.music.store.ddd.Sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Username;

public class UpdateAccountUsername extends Command {
    private final SaleId saleId;
    private final AccountId accountId;
    private final Username accountUsername;

    public UpdateAccountUsername(SaleId saleId, AccountId accountId, Username accountUsername) {
        this.saleId = saleId;
        this.accountId = accountId;
        this.accountUsername = accountUsername;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Username getAccountUsername() {
        return accountUsername;
    }
}
