package com.controladores;

import com.modelo.Jornalero;
import com.persistencia.Persistencia;

public class ControladorJornalero {

    public ControladorJornalero() {
        // TODO Auto-generated constructor stub
    }

    Persistencia persistencia;

    public ControladorJornalero(Persistencia p) {
        this.persistencia = p;
    }

    /**
     * @param dni
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail
     * @param produccion
     */
    public void agregarJornalero(int dni, String nombre, String apellido, String telefono, String mail,
            int produccion) {
        this.persistencia.iniciarTransaccion();
        Jornalero jor = new Jornalero(dni, nombre, apellido, telefono, mail);
        this.persistencia.insertar(jor);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param jor
     * @param dni
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail
     * @param produccion
     */
    public void editarRepartidor(Jornalero jor, int dni, String nombre, String apellido, String telefono, String mail,
            int produccion) {
        this.persistencia.iniciarTransaccion();
        jor.setDni(dni);
        jor.setNombre(nombre);
        jor.setApellido(apellido);
        jor.setTelefono(telefono);
        jor.setMail(mail);
        jor.setProduccion(produccion);
        this.persistencia.modificar(jor);
        this.persistencia.confirmarTransaccion();
    }

    /**
     * @param jor
     */
    public void eliminarRepartidor(Jornalero jor) {
        this.persistencia.iniciarTransaccion();
        this.persistencia.eliminar(jor);
        this.persistencia.confirmarTransaccion();
    }

}
