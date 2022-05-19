package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaUchallenge.music.store.ddd.Sale.values.AccountId;

public class Account extends Entity<AccountId> {
    public Account(AccountId entityId) {
        super(entityId);
    }
}
