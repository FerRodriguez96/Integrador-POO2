package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicole;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazPicoles;

import io.javalin.http.Context;

public class ControladorPicole {

    private final InterfazPicoles interfazPicoles;

    public ControladorPicole(InterfazPicoles interfazPicoles) {
        this.interfazPicoles = interfazPicoles;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloPicoles();

        // Se pasan los datos al metodo listar
        modelo.picoles = interfazPicoles.listar();

        // Se imprime por consola la lista de Picoles
        System.out.println(modelo.picoles);

        // Se muestra el template con la lista de productos
        ctx.render("picoles.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoPicole(Context ctx) throws SQLException {
        // el programa muestra el formulario para ingresar los datos de un nuevo Picole
        ctx.render("crearPicole.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarPicole(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var sabor = ctx.formParamAsClass("txtSabor", Integer.class).get();
        var precio = ctx.formParamAsClass("txtPrecio", Float.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();
        var Picole = new Picole();
        if (sabor == 1) {
            Picole = new Picole(precio, Sabores.Surtido, cantidad);
        } else {
            Picole = new Picole(precio, Sabores.Surtido, cantidad);
        }
        // Se inicia el proceso de persistencia
        this.interfazPicoles.crear(Picole);

        // Se redirige a la pagina que muestra la lista de productos
        ctx.redirect("/productos");
    }

    /**
     * @param context
     */
    public void editarPicole(Context ctx) throws SQLException {

        // se traen los datos de la clase
        var modelo = new ModeloPicole();

        // se le pasa al proceso de persistencia el id del paquete de Picole que se
        // quiere editar
        modelo.picole = this.interfazPicoles.obtener(ctx.pathParamAsClass("txtId", Integer.class).get());

        // el programa muestra el template para editar un paquete de Picole
        ctx.render("editarPicole.jte", Collections.singletonMap("modelo", modelo));
    }

    public void modificarPicole(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloPicole();
        // se le pasa al proceso de persistencia el sabor del picole que se quiere
        // editar
        modelo.picole = this.interfazPicoles.obtener((ctx.pathParamAsClass("txtId", Integer.class).get()));
        var id = ctx.formParamAsClass("txtId", Integer.class).get();
        var sabor = ctx.formParamAsClass("txtSabor", Integer.class).get();
        var precio = ctx.formParamAsClass("txtPrecio", float.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();
        var picoleModificado = new Picole();
        if (sabor == 1) {
            picoleModificado = new Picole(precio, Sabores.Surtido, cantidad);
        } else {
            picoleModificado = new Picole(precio, Sabores.Surtido, cantidad);
        }
        picoleModificado.setId(id);
        //picoleModificado = new Picole(precio, Sabores.Surtido, cantidad);
        this.interfazPicoles.modificar(picoleModificado);
        ctx.redirect("/picoles");
    }

    /**
     * @param context
     */
    public void eliminarPicole(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el sabor del Picole que se quiere
        // eliminar
        this.interfazPicoles.borrar(ctx.pathParamAsClass("txtId", Integer.class).get());
    }

}