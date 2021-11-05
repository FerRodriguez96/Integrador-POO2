package com.grupo3.heladeria.proyectoheladeria.modelo;
import jakarta.persistence.*;

/**
 * Representa un jornalero
 */
@Entity
@DiscriminatorValue("Jornalero")
public class Jornalero extends Empleado {

    private int produccion;

    public Jornalero() {

    }

    /**
     * Crea un jornalero al que se le pasa datos de dni, nombre, apellido, telefono
     * y mail
     * 
     * @param dni      dni del jornalero
     * @param nombre   nombre del jornalero
     * @param apellido apellido del jornalero
     * @param telefono telefono del jornalero
     * @param mail     mail del jornalero
     */
    public Jornalero(int dni, String nombre, String apellido, String telefono, String mail) {
        super(dni, nombre, apellido, telefono, mail);
    }

    /**
     * Obtiene la producción del jornalero
     * 
     * @return int producción del jornalero
     */
    public int getProduccion() {
        return produccion;
    }

    /**
     * Establece la produccion del jornalero
     * 
     * @param produccion produccion del jornalero
     */
    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

}
