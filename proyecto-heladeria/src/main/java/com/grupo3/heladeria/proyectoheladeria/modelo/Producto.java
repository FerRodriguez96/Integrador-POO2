package com.grupo3.heladeria.proyectoheladeria.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
/**
 * Representa un producto
 */
@Entity
@Table(name = "PRODUCTO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_producto", discriminatorType = DiscriminatorType.STRING)
public abstract class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "sec_prod", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_prod", strategy = GenerationType.SEQUENCE)
    @Column(name = "IDPRODUCTO")
    protected int idProducto;

    @Column(name = "PRECIO")
    protected float precio;

    protected Producto() {

    }

    /**
     * Crea un producto al que se le pasa datos del id del producto y el precio
     * 
     * @param idProducto
     * @param precio
     */
    public Producto(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el id del producto
     * 
     * @return int
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el id del producto
     * 
     * @param idProducto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene el precio del producto
     * 
     * @return float
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     * 
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", precio=" + precio + "]";
    }

    
    /** 
     * @return String
     */
    // Devuelve el tipo de producto
    @Transient
    public String getTipoProducto() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }
}