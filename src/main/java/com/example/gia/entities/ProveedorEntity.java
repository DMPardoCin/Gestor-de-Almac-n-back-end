package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="Proveedor")
public class ProveedorEntity extends PersonaEntity {

}
