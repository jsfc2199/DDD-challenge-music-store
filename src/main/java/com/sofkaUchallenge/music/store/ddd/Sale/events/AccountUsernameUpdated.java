package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Username;

public class AccountUsernameUpdated extends DomainEvent {
    private final AccountId accountId;
    private final Username accountUsername;

    public AccountUsernameUpdated(AccountId accountId, Username accountUsername) {
        super("sofka.sale.accountusernameupdated");
        this.accountId = accountId;
        this.accountUsername = accountUsername;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Username getAccountUsername() {
        return accountUsername;
    }
}
