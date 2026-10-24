package com.example.gia.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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

    @OneToMany (mappedBy = "modelo")
    private List<CajaFuerteEntity> cajasFuertes=new ArrayList<>();

}
