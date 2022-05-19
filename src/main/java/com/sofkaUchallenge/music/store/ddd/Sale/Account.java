package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Email;
import com.sofkaUchallenge.music.store.ddd.Sale.values.Username;

public class Account extends Entity<AccountId> {
    private Email accountEmail;
    private Username accountUserName;

    public Account(AccountId entityId, Email email, Username username) {
        super(entityId);
        this.accountEmail = email;
        this.accountUserName = username;
    }
}
