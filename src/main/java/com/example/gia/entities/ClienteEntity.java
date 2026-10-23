package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="Cliente")
public class ClienteEntity extends PersonaEntity{
    
}
