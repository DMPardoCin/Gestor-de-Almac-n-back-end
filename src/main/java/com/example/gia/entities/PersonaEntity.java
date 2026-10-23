package com.example.gia.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data 
@MappedSuperclass 
public class PersonaEntity extends BaseEntity{
    private String nombre;
    private String email;
    private String telefono;
    
}
