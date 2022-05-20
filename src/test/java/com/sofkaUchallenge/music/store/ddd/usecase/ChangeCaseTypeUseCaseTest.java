package com.sofkaUchallenge.music.store.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaUchallenge.music.store.ddd.Accesory.commands.ChangeCaseTyoe;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.AccesoryCreated;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.CaseAdded;
import com.sofkaUchallenge.music.store.ddd.Accesory.events.CaseTypeAdded;
import com.sofkaUchallenge.music.store.ddd.Accesory.values.*;
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
class ChangeCaseTypeUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void changeCaseType() {
        //arange
        AccesoryId accesoryId = AccesoryId.of("ddd");
        CaseId caseId = CaseId.of("CaseX256");
        Type type = new Type("Hard");

        var command = new ChangeCaseTyoe(accesoryId, caseId, type);
        var useCase = new ChangeCaseTypeUseCase();

        when(repository.getEventsBy("ddd")).thenReturn(List.of(
                new AccesoryCreated(
                        new Manufacturer("Vivaldi")
                ),
                new CaseAdded(CaseId.of("CaseX256"),
                    new Type("Weak"),
                    new Brand("Fender"),
                    new Value(80000))
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
        var event = (CaseTypeAdded) events.get(0);
        Assertions.assertEquals("Hard",event.getType().value());
        Mockito.verify(repository).getEventsBy("ddd");
    }

}