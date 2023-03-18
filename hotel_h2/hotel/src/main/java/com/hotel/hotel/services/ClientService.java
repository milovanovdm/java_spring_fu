package com.hotel.hotel.services;

import org.springframework.stereotype.Service;

import com.hotel.hotel.repositories.ClientRepository;
import com.hotel.hotel.models.Client;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void saveClient(Client client){
        clientRepository.save(client);
    }

    public Client getClient(Integer id) {
        return clientRepository.findById(id).get();
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

}
