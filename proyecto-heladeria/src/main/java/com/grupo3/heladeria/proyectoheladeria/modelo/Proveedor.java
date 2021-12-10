package com.grupo3.heladeria.proyectoheladeria.modelo;

import java.io.Serializable;

import jakarta.persistence.*;
/**
 * Representa un proveedor
 */
@Entity
@Table (name="PROVEEDOR")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "sec_prov", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_prov", strategy = GenerationType.SEQUENCE)
    private int idProveedor;

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String empresa;
    @Column
    private String telefono;

    public Proveedor(){

    }

    /**
     * Crea un proveedor al que se le pasan datos de nombre, apellido, empresa y telefono
     * 
     * @param nombre        nombre del proveedor
     * @param apellido      apellido del proveedor
     * @param empresa       empresa del proveedor
     * @param telefono      telefono del proveedor
     */
    public Proveedor(String nombre, String apellido, String empresa, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    /**
     * Obtiene el id del proveedor
     * 
     * @return id del proveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * Establece el id del proveedor
     * 
     * @param idProveedor id del proveedor
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Obtiene el nombre del proveedor
     * 
     * @return nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor
     * 
     * @param nombre nombre del proveedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del proveedor
     * 
     * @return apellido del proveedor
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del proveedor
     * 
     * @param apellido apellido del proveedor
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la empresa del proveedor
     * 
     * @return empresa del proveedor
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Establece la empresa del proveedor
     * 
     * @param empresa empresa del proveedor
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtiene el telefono del proveedor
     * 
     * @return telefono del proveedor
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del proveedor
     * 
     * @param telefono telefono del proveedor
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Proveedor [apellido=" + apellido + ", empresa=" + empresa + ", idProveedor=" + idProveedor + ", nombre="
                + nombre + ", telefono=" + telefono + "]";
    }

    
}
