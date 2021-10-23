package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Jornalero")
public class Jornalero extends Empleados {

    private int produccion;
    
    public Jornalero(){
    	
    }

    public Jornalero(int dni, int idEmpleado, String nombre, String apellido, String telefono, String mail,
            int produccion) {
        super(dni, idEmpleado, nombre, apellido, telefono, mail);
        this.produccion = produccion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    
    
}
