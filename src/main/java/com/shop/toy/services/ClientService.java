package com.shop.toy.services;

import com.shop.toy.models.dto.ClientDto;
import com.shop.toy.models.entity.Client;
import com.shop.toy.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.shop.toy.models.mappers.ClientMapper.CLIENT_MAPPER;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDto findById(Long id) {
        return CLIENT_MAPPER.toClientDto(clientRepository.findById(id).get());
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public ClientDto save(ClientDto clientDto) {
        Client client = clientRepository.save(CLIENT_MAPPER.toClient(clientDto));
        return CLIENT_MAPPER.toClientDto(client);
    }
}
