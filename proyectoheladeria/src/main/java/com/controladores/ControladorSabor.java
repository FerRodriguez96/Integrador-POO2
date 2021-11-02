package com.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.modelo.Sabor;
import com.paginas.ModeloSabor;
import com.paginas.ModeloSabores;
import com.repositorios.InterfazSabores;

import io.javalin.http.Context;

public class ControladorSabor {

    private final InterfazSabores interfazSabores;

    public ControladorSabor(InterfazSabores interfazSabores) {
        this.interfazSabores = interfazSabores;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloSabores();

        // Se pasan los datos a el metodo listar
        modelo.sabores = interfazSabores.listar();

        // Se imprime por consola la lista de sabores
        System.out.println(modelo.sabores);

        // Se muestra el template con la lista de sabores
        ctx.render("sabores.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoSabor(Context ctx) throws SQLException {
        // el programa muestra el formulario para ingresar los datos de un nuevo sabor
        ctx.render("crearSabor.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarSabor(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();

        // Se crea un nuevo objeto sabor
        var sabor = new Sabor(nombre);

        // Se inicia el proceso de persistencia
        this.interfazSabores.crear(sabor);

        // Se redirige a la pagina que muestra la lista de sabores
        ctx.redirect("/sabores");
    }

    /**
     * @param context
     */
    public void editarSabor(Context ctx) throws SQLException {

        // se traen los datos de la clase
        var modelo = new ModeloSabor();

        // se le pasa al proceso de persistencia el id del sabor que se quiere editar
        modelo.sabor = this.interfazSabores.obtener(ctx.pathParamAsClass("idSabor", Integer.class).get());

        // el programa muestra el template para editar sabores
        ctx.render("editarSabor.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param context
     */
    public void eliminarSabor(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el id del sabor que se quiere eliminar
        this.interfazSabores.borrar(ctx.pathParamAsClass("idSabor", Integer.class).get());

    }

}