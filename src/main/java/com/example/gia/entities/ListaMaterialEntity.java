package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Lista_material")
public class ListaMaterialEntity extends BaseEntity{

    @ManyToOne
    @JoinColumn(name="id_modelo")
    private ModeloCajaFuerteEntity modelo;

    @ManyToOne
    @JoinColumn(name="id_material")
    private MaterialEntity material;

    private int cantidad;

}