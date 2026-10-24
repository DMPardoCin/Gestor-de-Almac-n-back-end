package com.example.gia.entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass 
public class DetalleArticuloEntity extends BaseEntity{
    private String nombreArticulo;
    private Double cantidad;
    private TipoArticulo tipo;

}
