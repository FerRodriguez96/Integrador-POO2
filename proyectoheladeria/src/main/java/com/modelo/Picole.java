package com.modelo;

import javax.persistence.*;

public class Picole extends Productos {

    @OneToMany
    @Column(name = "SABORES")
    public Sabores sabor;
    public int cantidad;

    public Picole() {

    }

    /**
     * Crea un Picole al que se le pasa los datos del id, precio, sabor y cantidad
     * del picole
     * 
     * @param idProducto Id del Picole
     * @param precio     Precio del Picole
     * @param sabor      Sabor del Picole
     * @param cantidad   Cantidad de Picoles
     */
    public Picole(int idProducto, float precio, Sabores sabor, int cantidad) {
        super(idProducto, precio);
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el sabor del Picole
     * 
     * @return String
     */
    public Sabores getSabor() {
        return sabor;
    }

    /**
     * Establece el sabor del Picole
     * 
     * @param sabor
     */
    public void setSabor(Sabores sabor) {
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
