package com.example.Test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String code;
    private  String name;
    private  String dataSize;

}
