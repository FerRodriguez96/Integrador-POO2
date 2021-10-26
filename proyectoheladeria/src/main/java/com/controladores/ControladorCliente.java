package com.controladores;

import com.modelo.Cliente;
import com.persistencia.*;

public class ControladorCliente {

    Persistencia persistencia;

    /**
     * @param p
     */
    public void ClientesControlador(Persistencia p) {
        this.persistencia = p;
    }

    /**
     * @param dni
     * @param nombre
     * @param apellido
     * @param calle
     * @param numero
     */
    public void agregarCliente(int dni, String nombre, String apellido, String calle, int numero) {
        this.persistencia.iniciarTransaccion();
        Cliente clt = new Cliente(dni, nombre, apellido, calle, numero);
        this.persistencia.insertar(clt);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param clt
     * @param dni
     * @param nombre
     * @param apellido
     * @param calle
     * @param numero
     */
    public void editarCliente(Cliente clt, int dni, String nombre, String apellido, String calle, int numero) {
        this.persistencia.iniciarTransaccion();
        clt.setDni(dni);
        clt.setNombre(nombre);
        clt.setApellido(apellido);
        clt.setCalle(calle);
        clt.setNumero(numero);
        this.persistencia.modificar(clt);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param clt
     */
    public void eliminarCliente(Cliente clt) {
        this.persistencia.iniciarTransaccion();
        this.persistencia.eliminar(clt);
        this.persistencia.confirmarTransaccion();
    }
}
