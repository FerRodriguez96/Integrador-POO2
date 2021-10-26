package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Jornalero")
public class Jornalero extends Empleados {

    private int produccion;
    
    public Jornalero(){
    	
    }

    public Jornalero(int dni, String nombre, String apellido, String telefono, String mail) {
        super(dni, nombre, apellido, telefono, mail);
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    
    
}
