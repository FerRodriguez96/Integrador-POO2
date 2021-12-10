package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Picole")
public class Picole extends Producto {

    private static final long serialVersionUID = 1L;

    @Column(name = "SABORES")
    public Sabores sabor;
    @Column(name = "CANTIDAD")
    public int cantidad;

    public Picole() {

    }

    /**
     * Crea un Picole al que se le pasa los datos del precio, sabor y cantidad de
     * unidades del paquete picole
     * 
     * @param precio   Precio del Picole
     * @param sabor    Sabor del Picole
     * @param cantidad Cantidad de Picoles que vienen en un paquete
     */
    public Picole(float precio, Sabores sabor, int cantidad) {
        super(precio);
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el id del Picole
     * 
     * @return Integer id del picole
     */
    public Integer getId() {
        return super.getIdProducto();
    }

    /**
     * Establece el id del Picole
     * 
     * @param id
     */
    public void setId(Integer id) {
        super.setIdProducto(id);
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

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Picole [cantidad=" + cantidad + ", sabor=" + sabor + "]";
    }

}
