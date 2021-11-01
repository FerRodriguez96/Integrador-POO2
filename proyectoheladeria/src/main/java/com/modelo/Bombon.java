package com.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Bombon")
public class Bombon extends Productos {

    private static final long serialVersionUID = 1L;

    @OneToOne
    @Column(name = "SABORES")
    public Sabor sabor;
    @Column(name = "CANTIDAD")
    public int cantidad;

    public Bombon() {

    }

    /**
     * Crea un bombon al que se le pasa los datos del precio, sabor y cantidad de
     * unidades del paquete de bombon
     * 
     * @param precio   Precio del bombon
     * @param sabor    Sabor del bombon
     * @param cantidad Cantidad de bombones
     */
    public Bombon(float precio, Sabor sabor, int cantidad) {
        super(precio);
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el sabor del bombon
     * 
     * @return String
     */
    public Sabor getSabor() {
        return sabor;
    }

    /**
     * Establece el sabor del bombon
     * 
     * @param sabor
     */
    public void setSabor(Sabor sabor) {
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