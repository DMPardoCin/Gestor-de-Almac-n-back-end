package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table(name="Lista_herramienta")
public class ListaHerramientaEntity extends ListaEntity {

    @ManyToOne
    @JoinColumn(name="id_herramienta")
    private HerramientaEntity herramienta;


}
