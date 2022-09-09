package com.dmapi.app.dmapi.infrastructure.services;

import com.dmapi.app.dmapi.domain.Client;
import com.dmapi.app.dmapi.infrastructure.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {

    private final IClientRepository _clientRepository;

    @Autowired
    public ClientService(IClientRepository clientRepository) {
        this._clientRepository = clientRepository;
    }

    public List<Client> getClient() {
        return _clientRepository.findAll();
    }

    public Optional<Client> getClientById(UUID Id) {
        return _clientRepository.findById(Id);
    }
}
