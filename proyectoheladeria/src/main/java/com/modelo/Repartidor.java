package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Repartidor")
public class Repartidor extends Empleados {

    public Repartidor(int dni, int idEmpleado, String nombre, String apellido, String telefono, String mail) {
        super(dni, idEmpleado, nombre, apellido, telefono, mail);
    }

}
