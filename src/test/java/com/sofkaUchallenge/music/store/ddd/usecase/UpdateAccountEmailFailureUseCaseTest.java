package com.sofkaUchallenge.music.store.ddd.usecase;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
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
class UpdateAccountEmailFailureUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void updateEmailInAccount(){
        var message = Assertions.assertThrows(IllegalArgumentException.class, ()->{
            var command = new UpdateAccountEmail(SaleId.of("ddd"), AccountId.of("25eff46gf"), new Email("jsfc2199fgjcom"));
            var useCase = new UpdateAccountEmailFailureUseCase();

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
                    .orElseThrow(()->new IllegalArgumentException("Something went wrong while updating the email"))
                    .getDomainEvents();

            //assert
            var event = (AccountEmailUpdated) events.get(0);
            Assertions.assertEquals("25eff46gf",event.getAccountId().value());
            Assertions.assertEquals("jsfc2199@gmail.com",event.getAccountEmail().value());
            Mockito.verify(repository).getEventsBy("ddd");
        });

        //In order for the test to fail, an erroneous email is being passed in order to verify that the failed test is correct.
        Assertions.assertEquals("The email is not valid", message.getMessage());

    }
}