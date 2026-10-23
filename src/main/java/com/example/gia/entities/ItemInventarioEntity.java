package com.example.gia.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass 
@EqualsAndHashCode(callSuper = true)
@Data 
public class ItemInventarioEntity extends BaseEntity {
    private int cantidad;
    private String nombre;
}
