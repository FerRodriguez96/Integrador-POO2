package com.modelo;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Representa un cliente
 */
@Entity
@Table(name = "CLIENTE")

public class Cliente implements Serializable {

    @Id
    @Column(name = "DNI")
    private int dni;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUMERO")
    private int numero;

    public Cliente() {

    }

    /**
     * Crea un cliente al que se le pasa datos de dni, nombre, apellido, nombre de
     * la calle y numero de la calle
     * 
     * @param dni      dni del cliente
     * @param nombre   nombre del cliente
     * @param apellido apellido del cliente
     * @param calle    nombre de la calle del cliente
     * @param numero   numero de la calle del cliente
     */
    public Cliente(int dni, String nombre, String apellido, String calle, int numero) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * Obtiene el dni del cliente
     * 
     * @return dni del cliente
     */
    public int getDni() {
        return dni;
    }

    /**
     * Establece el dni del cliente
     * 
     * @param dni dni del cliente
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del cliente
     * 
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     * 
     * @param nombre nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente
     * 
     * @return apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente
     * 
     * @param apellido apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el domicilio/calle del cliente
     * 
     * @return calle del cliente
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle del cliente
     * 
     * @param calle calle del cliente
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el numero de la calle del cliente
     * 
     * @return numero de la calle del cliente
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el numero de la calle del cliente
     * 
     * @param numero numero de la calle del cliente
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}