package com.example.gia.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data 
@MappedSuperclass 
public class ListaEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name="id_modelo")
    private ModeloCajaFuerteEntity modelo;

    private Double cantidad;
}
