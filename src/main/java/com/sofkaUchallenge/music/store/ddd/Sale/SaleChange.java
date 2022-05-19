package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaUchallenge.music.store.ddd.Sale.events.*;

import java.util.HashSet;

public class SaleChange extends EventChange {
    public SaleChange(Sale sale) {
        apply((SaleCreated event)->{
            sale.saleInvoice = event.getSaleInvoice();
            sale.clients = new HashSet<>();
            sale.sellers = new HashSet<>();
            sale.accounts = new HashSet<>();
        });

        apply((AccesoryAssociated event)->{
            sale.accesoryId = event.getAccesoryId();
        });

        apply((AccountAdded event)->{
            if(sale.accounts().size()>2){
                throw new IllegalArgumentException("The user can only have 2 accounts");
            }
            sale.accounts.add(new Account(event.getAccountId(), event.getAccountEmail(), event.getAccountUsername()));
        });

        apply((AccountEmailUpdated event)->{
           var emailToUpdate = sale.getAccountById(event.getAccountId()).orElseThrow(()->new IllegalArgumentException("Wrong Id to reach the account"));
           emailToUpdate.updateAccountEmail(event.getAccountEmail());
        });

        apply((AccountUsernameUpdated event)->{
            var usernameToUpdate = sale.getAccountById(event.getAccountId()).orElseThrow(()->new IllegalArgumentException("Wrong Id to reach the account"));
            usernameToUpdate.updateAccountUserName(event.getAccountUsername());
        });

        apply((ClientAdded event)->{
            if (sale.clients().size() > 1) {
                throw new IllegalArgumentException("The sale can only have 1 client");
            }
            sale.clients.add(new Client(event.getClientId(), event.getClientName(), event.getClientStreetAdress()));
        });

        apply((ClientNameUpdated event)->{
            var nameToUpdate = sale.getClientById(event.getClientId()).orElseThrow(()->new IllegalArgumentException("Wrong Id to reach the client"));
            nameToUpdate.updateClientName(event.getClientName());
        });

        apply((ClientStreetAdressUpdated event)->{
            var streetAdressToUpdate = sale.getClientById(event.getClientId()).orElseThrow(()->new IllegalArgumentException("Wrong Id to reach the client"));
            streetAdressToUpdate.updateClientStreetAdress(event.getClientStreetAdress());
        });

        apply((InstrumentAssociated event)->{
           sale.instrumentId = event.getInstrumentId();
        });

        apply((SaleInvoiceUpdated event)->{
            sale.saleInvoice = event.getSaleInvoice();
        });

        apply((SellerAdded event)->{
           if(sale.sellers().size()>2){
               throw new IllegalArgumentException("The sale can only have max 2 sellers");
           }
           sale.sellers.add(new Seller(event.getSellerId(), event.getSellerName()));
        });

        apply((SellerNameUpdated event)->{
            var nameToUpdate = sale.getSellertById(event.getSellerId()).orElseThrow(()->new IllegalArgumentException("Wrong id to reach the seller"));
            nameToUpdate.updateSellerName(event.getSellerName());
        });
    }
}
