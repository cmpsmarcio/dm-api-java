package com.dmapi.app.dmapi.controller;

import com.dmapi.app.dmapi.controller.base.IClientController;
import com.dmapi.app.dmapi.domain.Client;
import com.dmapi.app.dmapi.infrastructure.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ClientController implements IClientController {

    private final ClientService _clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this._clientService = clientService;
    }

    public List<Client> getClient()  {
        return this._clientService.getClient();
    }

    public Optional<Client> getClientById(UUID Id) {
        return this._clientService.getClientById(Id);
    }
}
