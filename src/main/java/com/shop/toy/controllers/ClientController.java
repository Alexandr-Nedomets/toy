package com.shop.toy.controllers;

import com.shop.toy.models.dto.ClientDto;
import com.shop.toy.models.entity.Client;
import com.shop.toy.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ClientDto findById(@PathVariable(name = "id") Long id) {
        return clientService.findById(id);
    }

    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping
    public ResponseEntity<ClientDto> save(@Valid @RequestBody ClientDto clientDto){
        ClientDto save = clientService.save(clientDto);
        return ResponseEntity.of(Optional.of(save));
    }
}
