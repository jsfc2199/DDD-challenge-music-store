package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.UpdateClientStreetAdress;
import com.sofkaUchallenge.music.store.ddd.Sale.events.ClientAdded;
import com.sofkaUchallenge.music.store.ddd.Sale.events.ClientStreetAdressUpdated;
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
class UpdateClientStreetAdressUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateClientStreetAdress(){
        //arrange
        SaleId saleId = SaleId.of("ddd");
        ClientId clientId = ClientId.of("569871fff");
        StreetAdress clientStreetAdress = new StreetAdress("Street 25 Carolina - 36C");

        var command = new UpdateClientStreetAdress(saleId, clientId, clientStreetAdress);
        var useCase = new UpdateClientStreetAdressUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(
           new SaleCreated(new SaleInvoice(6000000)),
           new ClientAdded(ClientId.of("569871fff"), new Name("Juan Sebastian"), new StreetAdress("St Anger 49 - North B"))
        ));
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("ddd")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while updating the street address"))
                .getDomainEvents();

        //assert
        var event = (ClientStreetAdressUpdated) events.get(0);
        Assertions.assertEquals("569871fff",event.getClientId().value());
        Assertions.assertEquals("Street 25 Carolina - 36C", event.getClientStreetAdress().value());
        Mockito.verify(repository).getEventsBy("ddd");
    }

}