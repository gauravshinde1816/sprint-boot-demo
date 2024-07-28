package com.example.Test.controller;
import  java.util.List;

import com.example.Test.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Test.services.ClientService;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping(value = "clients")
    public Client addClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
    }
}
