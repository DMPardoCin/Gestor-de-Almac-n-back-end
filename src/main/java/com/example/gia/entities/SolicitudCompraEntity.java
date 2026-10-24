package com.example.gia.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table(name="Solicitud_compra")
public class SolicitudCompraEntity extends BaseEntity{

    private LocalDate fecha;

    @OneToMany (mappedBy = "solicitudCompra")
    private List<DetalleSolicitudCompraEntity>detalles=new ArrayList<>();

    
}
