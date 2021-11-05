package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

/**
 * Representa un Empleado
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_empleado")
public abstract class Empleado {

    @Id
    protected int dni;

    @SequenceGenerator(name = "sec_emp", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_emp", strategy = GenerationType.SEQUENCE)
    protected int idEmpleado;

    protected String nombre;

    protected String apellido;

    protected String telefono;

    protected String correo;

    protected Empleado() {

    }

    /**
     * Crea un empleado al que se le pasa datos de dni, nombre, apellido, telefono y
     * mail
     * 
     * @param dni      dni del empleado
     * @param nombre   nombre del empleado
     * @param apellido apellido del empleado
     * @param telefono telefono del empleado
     * @param correo     mail del empleado
     */
    protected Empleado(int dni, String nombre, String apellido, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Obtiene el dni del empleado
     * 
     * @return dni del empleado
     */
    public int getDni() {
        return dni;
    }

    /**
     * Establece el dni del empleado
     * 
     * @param dni dni del empleado
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el id del empleado
     * 
     * @return id del empleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el id del empleado
     * 
     * @param idEmpleado
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el nombre del empleado
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado
     * 
     * @param nombre nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del empleado
     * 
     * @return apellido del empleado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del empleado
     * 
     * @param apellido apellido del empleado
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el telefono del empleado
     * 
     * @return telefono del empleado
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del empleado
     * 
     * @param telefono telefono del empleado
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el mail del empleado
     * 
     * @return String mail del empleado
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el mail del empleado
     * 
     * @param mail mail del empleado
     */
    public void setMail(String correo) {
        this.correo = correo;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Empleados [apellido=" + apellido + ", dni=" + dni + ", idEmpleado=" + idEmpleado + ", correo=" + correo
                + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

}
