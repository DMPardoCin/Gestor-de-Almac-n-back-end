package com.example.gia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table(name="Detalle_solicitud_compra")
public class DetalleSolicitudCompraEntity extends BaseEntity{
    
    @ManyToOne 
    @JoinColumn(name="id_solicitud_compra")
    private SolicitudCompraEntity solicitudCompra;

}
