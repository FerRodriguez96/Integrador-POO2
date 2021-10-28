package com.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
public abstract class Productos implements Serializable {
    @Id
    @SequenceGenerator(name = "sec_prod", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_prod", strategy = GenerationType.SEQUENCE)
    @Column(name = "IDPRODUCTO")
    private int idProducto;

    @Column(name = "PRECIO")
    private float precio;

    public Productos() {

    }

    /**
     * Crea un producto al que se le pasa datos del id del producto y el precio
     * 
     * @param idProducto
     * @param precio
     */
    public Productos(int idProducto, float precio) {
        this.idProducto = idProducto;
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

    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idProducto;
        result = prime * result + Float.floatToIntBits(precio);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Productos other = (Productos) obj;
        if (idProducto != other.idProducto)
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }

}
