package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

public class Insumo {

    @Id
    @SequenceGenerator(name = "sec_prov", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_prov", strategy = GenerationType.SEQUENCE)
    @Column
    private int idInsumo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private int cantidad;
    
    public Insumo(){

    }

    public Insumo(String nombre, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Insumo [cantidad=" + cantidad + ", descripcion=" + descripcion + ", idInsumo=" + idInsumo + ", nombre="
                + nombre + "]";
    }

    
}
