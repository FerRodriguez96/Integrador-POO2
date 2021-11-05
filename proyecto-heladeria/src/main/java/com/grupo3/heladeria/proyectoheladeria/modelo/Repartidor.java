package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

/**
 * Representa un repartidor
 */
@Entity
@DiscriminatorValue("Repartidor")
public class Repartidor extends Empleado {

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
     * @param correo     mail del repartidor
     */
    public Repartidor(int dni, String nombre, String apellido, String telefono, String correo) {
        super(dni, nombre, apellido, telefono, correo);
    }

}