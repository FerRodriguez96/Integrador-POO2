package com.modelo;

import javax.persistence.*;

public class Bombon extends Productos {

    @OneToOne
    @Column(name = "SABORES")
    public Sabores sabor;
    public int cantidad;

    public Bombon() {

    }

    /**
     * Crea un bombon al que se le pasa los datos del id, precio, sabor y cantidad
     * del bombon
     * 
     * @param idProducto Id del bombon
     * @param precio     Precio del bombon
     * @param sabor      Sabor del bombon
     * @param cantidad   Cantidad de bombones
     */
    public Bombon(int idProducto, float precio, Sabores sabor, int cantidad) {
        super(idProducto, precio);
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el sabor del bombon
     * 
     * @return String
     */
    public Sabores getSabor() {
        return sabor;
    }

    /**
     * Establece el sabor del bombon
     * 
     * @param sabor
     */
    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }

    /**
     * Obtiene la candidad de bombones
     * 
     * @return int cantidad de bombones
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de bombones
     * 
     * @param cantidad cantidad de bombones
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Bombon [cantidad=" + cantidad + ", sabor=" + sabor + "]";
    }

}
