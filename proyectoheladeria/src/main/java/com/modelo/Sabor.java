package com.modelo;

import java.io.Serializable;

import jakarta.persistence.*;

public class Sabor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "sec_sab", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_sab", strategy = GenerationType.SEQUENCE)
    @Column(name = "IDSABOR")
    private int idSabor;
    @Column(name = "sabor")
    private String nombre;

    public Sabor() {
    }

    /**
     * Crea un sabor al que se le pasa el nombre del mismo
     * 
     * @param nombre
     */
    public Sabor(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el id del sabor
     * 
     * @return int id del sabor
     */
    public int getIdSabor() {
        return idSabor;
    }

    /**
     * Establece el id del sabor
     * 
     * @param idSabor id del sabor
     */
    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    /**
     * Obtiene el nombre del sabor
     * 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del sabor
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sabores [idSabor=" + idSabor + ", nombre=" + nombre + "]";
    }
}