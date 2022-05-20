package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Sale.Sale;
import com.sofkaUchallenge.music.store.ddd.Sale.commands.CreateSale;
import com.sofkaUchallenge.music.store.ddd.Sale.events.SaleCreated;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleId;
import com.sofkaUchallenge.music.store.ddd.Sale.values.SaleInvoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateSaleUseCaseTest {
    @Test

    void createNewSale(){
        var id = new SaleId();
        var saleInvoice = new SaleInvoice(135000);

        var command = new CreateSale(id,saleInvoice);
        var useCase = new CreateSaleUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating the sale"))
                .getDomainEvents();

        SaleCreated event = (SaleCreated) events.get(0);
        Assertions.assertEquals(command.getSaleInvoice().value(), event.getSaleInvoice().value());
    }

}