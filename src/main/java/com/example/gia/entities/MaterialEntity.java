package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity 
@Data 
@EqualsAndHashCode(callSuper = true)
@Table(name="Material")
public class MaterialEntity extends ItemInventarioEntity{
    @Enumerated(EnumType.STRING)
    private TipoMaterial tipo;


}
