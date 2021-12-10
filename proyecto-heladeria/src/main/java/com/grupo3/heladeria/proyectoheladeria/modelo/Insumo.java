package com.grupo3.heladeria.proyectoheladeria.modelo;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="INSUMO")
public class Insumo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "sec_insu", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_insu", strategy = GenerationType.SEQUENCE)
    private int idInsumo;
    
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private int cantidad;
    
    public Insumo(){

    }

    /**
     * Crea un insumo al que se le pasan datos de nombre, descripcion, cantidad
     * 
     * @param nombre        nombre del insumo
     * @param descripcion   descripcion del insumo
     * @param cantidad      cantidad del insumo
     */
    public Insumo(String nombre, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el id del insumo
     * 
     * @return id del insumo
     */
    public int getIdInsumo() {
        return idInsumo;
    }

    /**
     * Establece el id del insumo
     * 
     * @param idInsumo id del insumo
     */
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    /**
     * Obtiene el nombre del insumo
     * 
     * @return nombre del insumo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del insumo
     * 
     * @param nombre nombre del insumo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripcion del insumo
     * 
     * @return descripcion del insumo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del insumo
     * 
     * @param descripcion descripcion del insumo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad del insumo
     * 
     * @return cantidad del insumo
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece el cantidad del insumo
     * 
     * @param cantidad cantidad del insumo
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Insumo [cantidad=" + cantidad + ", descripcion=" + descripcion + ", idInsumo=" + idInsumo + ", nombre="
                + nombre + "]";
    }

    
}
