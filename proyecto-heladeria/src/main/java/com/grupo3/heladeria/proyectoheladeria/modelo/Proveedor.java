package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

@Entity
@Table (name="PROVEEDOR")
public class Proveedor {

    @Id
    @SequenceGenerator(name = "sec_prov", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_prov", strategy = GenerationType.SEQUENCE)
    @Column(name="idproveedor")
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

    public Proveedor(String nombre, String apellido, String empresa, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor [apellido=" + apellido + ", empresa=" + empresa + ", idProveedor=" + idProveedor + ", nombre="
                + nombre + ", telefono=" + telefono + "]";
    }

    
}
