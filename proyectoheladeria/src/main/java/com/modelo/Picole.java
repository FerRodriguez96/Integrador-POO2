package com.modelo;

import jakarta.persistence.*;

public class Picole extends Productos {

    @OneToMany
    @Column(name = "SABORES")
    public Sabor sabor;
    public int cantidad;

    public Picole() {

    }

    /**
     * Crea un Picole al que se le pasa los datos del precio, sabor y cantidad del
     * picole
     * 
     * @param precio   Precio del Picole
     * @param sabor    Sabor del Picole
     * @param cantidad Cantidad de Picoles
     */
    public Picole(float precio, Sabor sabor, int cantidad) {
        super(precio);
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el sabor del Picole
     * 
     * @return String
     */
    public Sabor getSabor() {
        return sabor;
    }

    /**
     * Establece el sabor del Picole
     * 
     * @param sabor
     */
    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    /**
     * Obtiene la candidad de Picoles
     * 
     * @return int cantidad de Picoles
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de Picoles
     * 
     * @param cantidad cantidad de Picoles
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Picole [cantidad=" + cantidad + ", sabor=" + sabor + "]";
    }

}
