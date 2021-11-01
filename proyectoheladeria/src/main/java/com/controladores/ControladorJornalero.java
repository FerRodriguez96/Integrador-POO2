package com.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.modelo.Jornalero;
import com.paginas.ModeloJornalero;
import com.paginas.ModeloJornaleros;
import com.repositorios.InterfazJornaleros;

import io.javalin.http.Context;

public class ControladorJornalero {

    private final InterfazJornaleros interfazJornaleros;

    public ControladorJornalero(InterfazJornaleros interfazJornaleros) {
        this.interfazJornaleros = interfazJornaleros;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloJornaleros();

        // Se pasan los datos a el metodo listar
        modelo.jornaleros = interfazJornaleros.listar();

        // Se imprime por consola la lista de jornaleros
        System.out.println(modelo.jornaleros);

        // Se muestra el template con la lista de jornaleros
        ctx.render("jornaleros.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoJornalero(Context ctx) throws SQLException {
        // el programa musetra el formulario para ingresar los datos de un nuevo
        // jornalero
        ctx.render("crearJornalero.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarJornalero(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var dni = ctx.formParamAsClass("txtDni", Integer.class).get();
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
        var telefono = ctx.formParamAsClass("txtTelefono", String.class).get();
        var mail = ctx.formParamAsClass("txtCorreo", String.class).get();

        // Se crea un nuevo objeto jornalero
        var jornalero = new Jornalero(dni, nombre, apellido, telefono, mail);

        // Se inicia el proceso de persistencia
        this.interfazJornaleros.crear(jornalero);

        // Se redirige a la pagina que muestra la lista de jornaleros
        ctx.redirect("/jornaleros");
    }

    /**
     * @param context
     */
    public void editarJornalero(Context ctx) throws SQLException {

        // se traen los datos de la clase
        var modelo = new ModeloJornalero();

        // se le pasa al proceso de persistencia el dni del jornalero que se quiere
        // editar
        modelo.jornalero = this.interfazJornaleros.obtener(ctx.pathParamAsClass("txtDni", Integer.class).get());

        // el programa muestra el template para editar jornaleros
        ctx.render("editarJornalero.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param context
     */
    public void eliminarJornalero(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el dni del jornalero que se quiere
        // eliminar
        this.interfazJornaleros.borrar(ctx.pathParamAsClass("txtDni", Integer.class).get());

    }

}