package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Jornalero")
public class Jornalero extends Empleados {

    private int produccion;

    public Jornalero(){
        super();
    }

    public Jornalero(int produccion) {
        this.produccion = produccion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    
    
}
