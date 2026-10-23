package com.example.gia.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="Modelo_caja_fuerte")
public class ModeloCajaFuerteEntity extends BaseEntity{

    private String referencia;
    private String descripcion;
    private Double capacidad;
    private Double peso;
    private Double alto;
    private Double ancho;

    

}
