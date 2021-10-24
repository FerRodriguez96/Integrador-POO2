package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Repartidor")
public class Repartidor extends Empleados {
	
	public Repartidor(){
		
	}

    public Repartidor(int dni, String nombre, String apellido, String telefono, String mail) {
        super(dni, nombre, apellido, telefono, mail);
    }

}
