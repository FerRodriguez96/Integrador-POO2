package com.integrador.modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")

public class Cliente implements Serializable {

    @Id
    @SequenceGenerator(name = "sec_cli", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_cli", strategy = GenerationType.SEQUENCE)
    @Column(name = "COD_CLIENTE")
    private long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUMERO")
    private int numero;

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", calle=" + calle + ", id=" + id + ", nombre=" + nombre + ", numero="
                + numero + "]";
    }

    public Cliente(long id, String nombre, String apellido, String calle, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}