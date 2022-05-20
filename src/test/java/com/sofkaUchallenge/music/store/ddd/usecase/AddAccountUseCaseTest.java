package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.AddAccount;
import com.sofkaUchallenge.music.store.ddd.Sale.events.AccountAdded;
import com.sofkaUchallenge.music.store.ddd.Sale.events.SaleCreated;
import com.sofkaUchallenge.music.store.ddd.Sale.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddAccountUseCaseTest {

    @InjectMocks
    private AddAccountUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addAccountToSale(){
        //arrange
        SaleId saleId = SaleId.of("ddd");
        AccountId accountId = new AccountId();
        Email accountEmail = new Email("ramonfmesa@gmail.com");
        Username accountUsername = new Username("monrafranco6392");
        var command = new AddAccount(saleId, accountId, accountEmail, accountUsername);

        when(repository.getEventsBy("ddd")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(command.getAccountId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while adding the account"))
                .getDomainEvents();

        //assert
        var event = (AccountAdded) events.get(0);
        Assertions.assertEquals("ramonfmesa@gmail.com",event.getAccountEmail().value());
        Assertions.assertEquals("monrafranco6392",event.getAccountUsername().value());
    }

    private List<DomainEvent> history(){
        var invoice = new SaleInvoice(135000);
        var passedEvent = new SaleCreated(invoice);
        return List.of(passedEvent);
    }
}