package com.sofkaUchallenge.music.store.ddd.Sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.AccesoryId;
import com.sofkaUchallenge.music.store.ddd.Instrument.values.InstrumentId;
import com.sofkaUchallenge.music.store.ddd.Sale.events.*;
import com.sofkaUchallenge.music.store.ddd.Sale.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Sale extends AggregateEvent<SaleId> {
    protected SaleInvoice saleInvoice;
    protected Set<Client> clients;
    protected Set<Seller> sellers;
    protected Set<Account> accounts;
    protected InstrumentId instrumentId;
    protected AccesoryId accesoryId;

    public Sale(SaleId entityId, SaleInvoice saleInvoice) {
        super(entityId);
        appendChange(new SaleCreated(saleInvoice)).apply();
    }

    private Sale(SaleId entityId){
        super(entityId);
        subscribe(new SaleChange(this));
    }

    public static Sale from(SaleId saleId, List<DomainEvent> events){
        var sale = new Sale(saleId);
        events.forEach(sale::applyEvent);
        return sale;
    }

    public void updateSaleInvoice(SaleInvoice saleInvoice){
        Objects.requireNonNull(saleInvoice);
        appendChange(new SaleInvoiceUpdated(saleInvoice)).apply();
    }

    public void addClient(ClientId clientId, Name name, StreetAdress streetAdress){
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(streetAdress);
        appendChange(new ClientAdded(clientId, name, streetAdress)).apply();
    }

    public void updateClientName(ClientId clientId, Name name){
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(name);
        appendChange(new ClientNameUpdated(clientId, name)).apply();
    }

    public void updateClientStreetAdress(ClientId clientId, StreetAdress streetAdress){
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(streetAdress);
        appendChange(new ClientStreetAdressUpdated(clientId, streetAdress)).apply();
    }

    public void addSeller(SellerId sellerId, Name name){
        Objects.requireNonNull(sellerId);
        Objects.requireNonNull(name);
        appendChange(new SellerAdded(sellerId,name)).apply();
    }

    public void updateSellerName(SellerId sellerId, Name name){
        Objects.requireNonNull(sellerId);
        Objects.requireNonNull(name);
        appendChange(new SellerNameUpdated(sellerId,name)).apply();
    }

    public void addAccount(AccountId accountId, Email email, Username username){
        Objects.requireNonNull(accountId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(username);
        appendChange(new AccountAdded(accountId,email,username)).apply();
    }

    public void updateAccountEmail(AccountId accountId, Email email){
        Objects.requireNonNull(accountId);
        Objects.requireNonNull(email);
        appendChange(new AccountEmailUpdated(accountId,email)).apply();
    }

    public void updateAccountUsername(AccountId accountId, Username username){
        Objects.requireNonNull(accountId);
        Objects.requireNonNull(username);
        appendChange(new AccountUsernameUpdated(accountId,username)).apply();
    }

    public void associateInstrument(InstrumentId instrumentId){
        appendChange(new InstrumentAssociated(instrumentId)).apply();
    }
    public void associateAccesory(AccesoryId accesoryId){
        appendChange(new AccesoryAssociated(accesoryId)).apply();
    }

    public Optional<Client> getClientById(ClientId clientId){
        return clients().stream().filter(client -> client.identity().equals(clientId)).findFirst();
    }

    public Optional<Seller> getSellertById(SellerId sellerId){
        return sellers().stream().filter(seller -> seller.identity().equals(sellerId)).findFirst();
    }

    public Optional<Account> getAccountById(AccountId accountId){
        return accounts().stream().filter(account -> account.identity().equals(accountId)).findFirst();
    }

    public SaleInvoice saleInvoice() {
        return saleInvoice;
    }

    public Set<Client> clients() {
        return clients;
    }

    public Set<Seller> sellers() {
        return sellers;
    }

    public Set<Account> accounts() {
        return accounts;
    }

    public InstrumentId instrumentId() {
        return instrumentId;
    }

    public AccesoryId accesoryId() {
        return accesoryId;
    }
}
