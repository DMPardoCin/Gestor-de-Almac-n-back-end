package com.example.gia.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table(name="Compra")
public class CompraEntity extends BaseEntity{
    private String obervaciones;
    private LocalDate fecha;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompraEntity>detalles=new ArrayList<>();

    @OneToMany
    @JoinColumn (name="id_solicitud_compra")
    private List<SolicitudCompraEntity>solicitudes=new ArrayList<>();
}
