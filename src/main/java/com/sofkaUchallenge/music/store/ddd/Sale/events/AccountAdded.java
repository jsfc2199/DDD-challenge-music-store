package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Email;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Username;

public class AccountAdded extends DomainEvent {
    private final AccountId accountId;
    private final Email accountEmail;
    private final Username accountUsername;

    public AccountAdded(AccountId accountId, Email accountEmail, Username accountUsername) {
        super("sofka.sale.accountadded");
        this.accountId = accountId;
        this.accountEmail = accountEmail;
        this.accountUsername = accountUsername;
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
