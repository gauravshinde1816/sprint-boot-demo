package com.example.Test.Repositories;

import  java.util.*;
import com.example.Test.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , String> {
    List<Client>  findByName(String name);
}
