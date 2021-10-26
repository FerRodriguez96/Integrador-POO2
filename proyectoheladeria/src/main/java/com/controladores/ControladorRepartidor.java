package com.controladores;

import com.modelo.Repartidor;
import com.persistencia.*;

public class ControladorRepartidor {

    Persistencia persistencia;

    public ControladorRepartidor(Persistencia p) {
        this.persistencia = p;
    }

    /**
     * @param dni
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail
     */
    public void agregarRepartidor(int dni, String nombre, String apellido, String telefono, String mail) {
        this.persistencia.iniciarTransaccion();
        Repartidor rep = new Repartidor(dni, nombre, apellido, telefono, mail);
        this.persistencia.insertar(rep);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param rep
     * @param dni
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail
     */
    public void editarRepartidor(Repartidor rep, int dni, String nombre, String apellido, String telefono,
            String mail) {
        this.persistencia.iniciarTransaccion();
        rep.setDni(dni);
        rep.setNombre(nombre);
        rep.setApellido(apellido);
        rep.setTelefono(telefono);
        rep.setMail(mail);
        this.persistencia.modificar(rep);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param rep
     */
    public void eliminarRepartidor(Repartidor rep) {
        this.persistencia.iniciarTransaccion();
        this.persistencia.eliminar(rep);
        this.persistencia.confirmarTransaccion();
    }
}
