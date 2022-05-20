package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.events.EmailSent;
import com.sofkaUchallenge.music.store.ddd.Sale.events.SaleCreated;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SendEmailUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void sendEmailToClient(){
        var event = new SaleCreated(new SaleInvoice(135000));

        event.setAggregateRootId("ddd");
        var useCase = new SendEmailUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(event));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("ddd")
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while sending the email"))
                .getDomainEvents();

        var email = (EmailSent) events.get(0);
        Assertions.assertEquals("Your purchase has been a success", email.getEmailSent());
        Mockito.verify(repository).getEventsBy("ddd");
    }
}