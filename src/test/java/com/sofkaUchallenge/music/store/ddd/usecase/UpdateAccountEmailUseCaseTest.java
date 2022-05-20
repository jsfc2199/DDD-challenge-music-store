package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.UpdateAccountEmail;
import com.sofkaUchallenge.music.store.ddd.Sale.events.AccountAdded;
import com.sofkaUchallenge.music.store.ddd.Sale.events.AccountEmailUpdated;
import com.sofkaUchallenge.music.store.ddd.Sale.events.SaleCreated;
import com.sofkaUchallenge.music.store.ddd.Sale.values.*;
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
class UpdateAccountEmailUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void updateEmailInAccount(){
        //arrange
        SaleId saleId = SaleId.of("ddd");
        AccountId accountId = AccountId.of("25eff46gf");
        Email accountEmail = new Email("jsfc2199@gmail.com");

        var command = new UpdateAccountEmail(saleId, accountId, accountEmail);
        var useCase = new UpdateAccountEmailUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(
           new SaleCreated(new SaleInvoice(900000)),
           new AccountAdded(AccountId.of("25eff46gf"), new Email("juans1997@gmail.com"), new Username("sebasfc2199"))
        ));

        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("ddd")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AccountEmailUpdated) events.get(0);
        Assertions.assertEquals("25eff46gf",event.getAccountId().value());
        Assertions.assertEquals("jsfc2199@gmail.com",event.getAccountEmail().value());
        Mockito.verify(repository).getEventsBy("ddd");
    }
}