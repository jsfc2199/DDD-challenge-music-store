package com.sofkaUchallenge.music.store.ddd.Sale.values;

import co.com.sofka.domain.generic.Identity;

public class AccountId extends Identity {
    public AccountId() {
    }

    private AccountId(String id) {
        super(id);
    }

    public static AccountId of(String id){
        return new AccountId(id);
    }
}
