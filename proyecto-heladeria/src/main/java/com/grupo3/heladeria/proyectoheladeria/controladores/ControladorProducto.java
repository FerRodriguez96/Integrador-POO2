package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;


import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazProductos;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProductos;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProducto;

import io.javalin.http.Context;

public class ControladorProducto {

    private final InterfazProductos interfazProductos;

    public ControladorProducto(InterfazProductos interfazProductos) {
        this.interfazProductos = interfazProductos;
    }
    /**
     * @param ctx
     */
    public void seleccionar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modeloProducto = new ModeloProductos();

        // Se pasan los datos a el metodo listar
        modeloProducto.productos = interfazProductos.listar();

        // Se imprime por consola la lista de productos
        System.out.println(modeloProducto.productos);

        // Se muestra el template con la lista de productos
        ctx.render("seleccionarProducto.jte", Collections.singletonMap("modelo", modeloProducto));
    }
    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modeloProducto = new ModeloProductos();

        // Se pasan los datos a el metodo listar
        modeloProducto.productos = interfazProductos.listar();

        // Se imprime por consola la lista de productos
        System.out.println(modeloProducto.productos);

        // Se muestra el template con la lista de productos
        ctx.render("seleccionarProducto.jte", Collections.singletonMap("modelo", modeloProducto));
    }

    /**
     * @param ctx
     */
    public void nuevoProducto(Context ctx) throws SQLException {
        // el programa muestra el formulario para ingresar los datos de un nuevo producto
        ctx.render("crearproducto.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarProducto(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var precio = ctx.formParamAsClass("txtPrecio", Float.class).get();
        //var producto = new Producto();
        /*
        // Por algún motivo no funciona swicht aquí
        switch (sabor) {
        case 1:
            producto = new producto(precio, Sabores.Frutilla, cantidad);
            break;
        case 2:
            producto = new producto(precio, Sabores.Vainilla, cantidad);
            break;
        case 3:
            producto = new producto(precio, Sabores.Dulce_de_leche, cantidad);
            break;
        case 4:
            producto = new producto(precio, Sabores.Chantilly, cantidad);
            break;
        default:
            producto = new producto(precio, Sabores.Surtido, cantidad);
            break;
        }*/

        // Se crea un nuevo objeto producto
        // var producto = new producto(precio, sabor, cantidad);

        // Se inicia el proceso de persistencia
        //this.InterfazProductos.crear(producto);

        // Se redirige a la pagina que muestra la lista de productos
        ctx.redirect("/productos");

    }

    /**
     * @param context
     */
    public void editarProducto(Context ctx) throws SQLException {

        var modelo = new ModeloProducto();
        modelo.producto = this.interfazProductos.obtener(ctx.pathParamAsClass("txtId", Integer.class).get());
        ctx.render("editarProducto.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param context
     */
    public void modificarProducto(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloProducto();
        // se le pasa al proceso de persistencia el sabor del producto que se quiere
        // editar
        modelo.producto = this.interfazProductos.obtener((ctx.pathParamAsClass("txtId", Integer.class).get()));
        var id = ctx.formParamAsClass("txtId", Integer.class).get();
        var precio = ctx.formParamAsClass("txtPrecio", float.class).get();

        //var productoModificado = new Producto();
        //productoModificado.setIdProducto(id);
        //this.interfazProductos.modificar(productoModificado);
        ctx.redirect("/productos");
    }

    /**
     * @param context
     */
    public void eliminarproducto(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el sabor del producto que se quiere
        // eliminar
        this.interfazProductos.borrar(ctx.pathParamAsClass("txtId", Integer.class).get());

    }

}