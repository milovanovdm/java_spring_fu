package com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotel.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
