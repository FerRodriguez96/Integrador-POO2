package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.grupo3.heladeria.proyectoheladeria.modelo.Insumo;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumo;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazInsumos;

import io.javalin.http.Context;

public class ControladorInsumo {

    private final InterfazInsumos interfazInsumos;

    public ControladorInsumo(InterfazInsumos interfazInsumos) {
        this.interfazInsumos = interfazInsumos;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloInsumos();

        // Se pasan los datos a el metodo listar
        modelo.insumos = interfazInsumos.listar();

        // Se imprime por consola la lista de insumos
        System.out.println(modelo.insumos);

        // Se muestra el template con la lista de insumos
        ctx.render("insumos.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoInsumo(Context ctx) throws SQLException {
        // el programa muestra el formulario para ingresar los datos de un nuevo insumo
        ctx.render("crearInsumo.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarInsumo(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var descripcion = ctx.formParamAsClass("txtDescripcion", String.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();

        // Se crea un nuevo objeto insumo
        var insumo = new Insumo(nombre, descripcion, cantidad);

        // Se inicia el proceso de persistencia
        this.interfazInsumos.crear(insumo);

        // Se redirige a la pagina que muestra la lista de insumos
        ctx.redirect("/insumos");
    }

    /**
     * @param context
     */
    public void editarInsumo(Context ctx) throws SQLException {
        // el programa muestra la pagina para editar insumos
        var modelo = new ModeloInsumo();
        modelo.insumo = this.interfazInsumos.obtener(ctx.pathParamAsClass("txtId", Integer.class).get());
        ctx.render("editarInsumo.jte", Collections.singletonMap("modelo", modelo));
    }

    
    /** 
     * @param ctx
     * @throws SQLException
     */
    public void modificarInsumo(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloInsumo();
        // se le pasa al proceso de persistencia el id del insumo que se quiere editar
        modelo.insumo = this.interfazInsumos.obtener((ctx.pathParamAsClass("txtId", Integer.class).get()));
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var descripcion = ctx.formParamAsClass("txtDescripcion", String.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();

        var insumomodificado = new Insumo(nombre,descripcion,cantidad);
        insumomodificado.setIdInsumo(modelo.insumo.getIdInsumo());
        this.interfazInsumos.modificar(insumomodificado);
        ctx.redirect("/insumos");
    }

    /**
     * @param context
     */
    public void eliminarInsumo(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el id del insumo que se quiere eliminar
        this.interfazInsumos.borrar((ctx.pathParamAsClass("txtId", Integer.class).get()));
        ctx.redirect("/insumos");

    }

}