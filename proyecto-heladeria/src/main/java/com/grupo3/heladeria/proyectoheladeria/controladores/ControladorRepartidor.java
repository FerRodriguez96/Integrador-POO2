package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidor;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidores;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazRepartidores;

import io.javalin.http.Context;

public class ControladorRepartidor {

    private final InterfazRepartidores interfazRepartidores;

    public ControladorRepartidor(InterfazRepartidores interfazRepartidores) {
        this.interfazRepartidores = interfazRepartidores;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloRepartidores();

        // Se pasan los datos a el metodo listar
        modelo.repartidores = interfazRepartidores.listar();

        // Se imprime por consola la lista de repartidores
        System.out.println(modelo.repartidores);

        // Se muestra el template con la lista de repartidores
        ctx.render("repartidores.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoRepartidor(Context ctx) throws SQLException {
        // el programa musetra el formulario para ingresar los datos de un nuevo
        // repartidor
        ctx.render("crearRepartidor.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarRepartidor(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var dni = ctx.formParamAsClass("txtDni", Integer.class).get();
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
        var telefono = ctx.formParamAsClass("txtTelefono", String.class).get();
        var mail = ctx.formParamAsClass("txtCorreo", String.class).get();

        // Se crea un nuevo objeto repartidores
        var repartidor = new Repartidor(dni, nombre, apellido, telefono, mail);

        // Se inicia el proceso de persistencia
        this.interfazRepartidores.crear(repartidor);

        // Se redirige a la pagina que muestra la lista de repartidores
        ctx.redirect("/repartidores");
    }

    /**
     * @param context
     */
    public void editarRepartidor(Context ctx) throws SQLException {

        // se traen los datos de la clase
        var modelo = new ModeloRepartidor();

        // se le pasa al proceso de persistencia el dni del repartidor que se quiere
        // editar
        modelo.repartidor = this.interfazRepartidores.obtener(ctx.pathParamAsClass("txtDni", Integer.class).get());

        // el programa muestra el template para editar repartidores
        ctx.render("editarRepartidor.jte", Collections.singletonMap("modelo", modelo));
    }

    
    /** 
     * @param ctx
     * @throws SQLException
     */
    public void modificarRepartidor(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloRepartidor();
        // se le pasa al proceso de persistencia el dni del repartidor que se quiere
        // editar
        modelo.repartidor = this.interfazRepartidores.obtener((ctx.pathParamAsClass("txtDni", Integer.class).get()));
        var dni = ctx.formParamAsClass("txtDni", Integer.class).get();
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
        var telefono = ctx.formParamAsClass("txtTelefono", String.class).get();
        var mail = ctx.formParamAsClass("txtCorreo", String.class).get();

        var repartidormodificado = new Repartidor(dni, nombre, apellido, telefono, mail);
        this.interfazRepartidores.modificar(repartidormodificado);
        ctx.redirect("/repartidores");
    }

    /**
     * @param context
     */
    public void eliminarRepartidor(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el dni del jornalero que se quiere
        // eliminar
        this.interfazRepartidores.borrar(ctx.pathParamAsClass("txtDni", Integer.class).get());
        ctx.redirect("/repartidores");
    }

}