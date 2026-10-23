package com.example.gia.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity 
@Data 
@EqualsAndHashCode(callSuper = true)
@Table(name="Herramienta")
public class HerramientaEntity extends ItemInventarioEntity{
    @Enumerated(EnumType.STRING)
    private TipoHerramienta tipo;

   
    @OneToMany (mappedBy = "herramienta")
    private List<PrestamoHerramientaEntity>prestamos=new ArrayList<>();

}
