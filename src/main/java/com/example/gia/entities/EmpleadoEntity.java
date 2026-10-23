package com.example.gia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="Empleado")
public class EmpleadoEntity extends PersonaEntity{
    private CargoEmpleado cargo;
    
    @OneToMany (mappedBy = "empleado")
    private List<PrestamoHerramientaEntity>prestamos=new ArrayList<>();
}
