package com.sofkaUchallenge.music.store.ddd.Sale.events;

import co.com.sofka.domain.generic.DomainEvent;

public class EmailSent extends DomainEvent {
    private final String emailSent;
    public EmailSent(String email) {
        super("sofka.sale.emailsent");
        this.emailSent = email;
    }

    public String getEmailSent() {
        return emailSent;
    }
}
