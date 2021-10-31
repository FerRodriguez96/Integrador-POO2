package com.modelo;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Representa un repartidor
 */
@Entity
@DiscriminatorValue("Repartidor")
public class Repartidor extends Empleados {
	
	@OneToMany
	@Column(name="pedidos")
	private ArrayList<Pedido> pedidos;

    public Repartidor() {

    }

    /**
     * Crea un repartidor al que se le pasa datos de dni, nombre, apellido, telefono
     * y mail
     * 
     * @param dni      dni del repartidor
     * @param nombre   nombre del repartidor
     * @param apellido apellido del repartidor
     * @param telefono telefono del repartidor
     * @param mail     mail del repartidor
     */
    public Repartidor(int dni, String nombre, String apellido, String telefono, String mail) {
        super(dni, nombre, apellido, telefono, mail);
    }

    /**
     * Obtiene los pedidos
     * 
     * @return pedidos del empleado
     */
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	 /**
     * Establece un pedido
     * 
     * @param pedidos del repartidor
     */
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
    
    

}
