package com.example.gia.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="Prestamo_herramienta")
public class PrestamoHerramientaEntity extends BaseEntity{

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String observaciones;

    @ManyToOne 
    @JoinColumn(name="id_empleado")
    private EmpleadoEntity empleado;
    @ManyToOne 
    @JoinColumn(name="id_herramienta")
    private HerramientaEntity herramienta;


}
