package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table(name="Detalle_compra")
public class DetalleCompraEntity extends DetalleArticuloEntity{

    private Double precio;

    @ManyToOne //relacion unidireccional
    private ProveedorEntity proveedor;

    @ManyToOne 
    @JoinColumn(name="id_compra")
    private CompraEntity compra;

}
