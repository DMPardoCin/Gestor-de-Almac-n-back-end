package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="Caja_fuerte")
public class CajaFuerteEntity extends BaseEntity{
    private Double precio;
    private EstadoCajaFuerte estado;
    private String observaciones;

    @ManyToOne 
    @JoinColumn (name="referencia") 
    private ModeloCajaFuerteEntity modelo;

}
