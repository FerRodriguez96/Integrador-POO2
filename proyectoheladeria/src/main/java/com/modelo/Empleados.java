package com.modelo;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_empleado")
public abstract class Empleados {

    @Id
    protected int dni;

    protected int idEmpleado;

    protected String nombre;

    protected String apellido;

    protected String telefono;

    protected String mail;

    protected Empleados(){

    }

    protected Empleados(int dni, int idEmpleado, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Empleados [apellido=" + apellido + ", dni=" + dni + ", idEmpleado=" + idEmpleado + ", mail=" + mail
                + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    
    
    
}
