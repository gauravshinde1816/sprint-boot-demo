package com.example.Test.services;


import com.example.Test.Repositories.ClientRepository;
import com.example.Test.Repositories.ClientRepository;
import com.example.Test.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
   private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public Client createClient(Client client){
        return clientRepository.save(client);
    }

}
