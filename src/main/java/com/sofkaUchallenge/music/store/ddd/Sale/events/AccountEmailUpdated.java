package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Email;

public class AccountEmailUpdated extends DomainEvent {
    private final AccountId accountId;
    private final Email accountEmail;

    public AccountEmailUpdated(AccountId accountId, Email accountEmail) {
        super("sofka.sale.accountemailupdated");
        this.accountId = accountId;
        this.accountEmail = accountEmail;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getAccountEmail() {
        return accountEmail;
    }
}
