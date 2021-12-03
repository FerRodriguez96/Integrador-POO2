package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.grupo3.heladeria.proyectoheladeria.modelo.Proveedor;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProveedor;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProveedores;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazProveedores;

import io.javalin.http.Context;

public class ControladorProveedor {

    private final InterfazProveedores interfazProveedores;

    public ControladorProveedor(InterfazProveedores interfazProveedores) {
        this.interfazProveedores = interfazProveedores;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloProveedores();

        // Se pasan los datos a el metodo listar
        modelo.proveedores = interfazProveedores.listar();

        // Se imprime por consola la lista de proveedores
        System.out.println(modelo.proveedores);

        // Se muestra el template con la lista de proveedores
        ctx.render("proveedores.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoProveedor(Context ctx) throws SQLException {
        // el programa musetra el formulario para ingresar los datos de un nuevo proveedor
        ctx.render("crearProveedor.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarProveedor(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
        var empresa = ctx.formParamAsClass("txtEmpresa", String.class).get();
        var telefono = ctx.formParamAsClass("txtTelefono", String.class).get();

        // Se crea un nuevo objeto proveedor
        var proveedor = new Proveedor(nombre, apellido, empresa, telefono);

        // Se inicia el proceso de persistencia
        this.interfazProveedores.crear(proveedor);

        // Se redirige a la pagina que muestra la lista de proveedores
        ctx.redirect("/proveedores");
    }

    /**
     * @param context
     */
    public void editarProveedor(Context ctx) throws SQLException {
        // el programa muestra el template para editar proveedores
        var modelo = new ModeloProveedor();
        modelo.proveedor = this.interfazProveedores.obtener(ctx.pathParamAsClass("txtId", Integer.class).get());
        ctx.render("editarProveedor.jte", Collections.singletonMap("modelo", modelo));
    }

    public void modificarProveedor(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloProveedor();
        // se le pasa al proceso de persistencia el id del proveedor que se quiere editar
        modelo.proveedor = this.interfazProveedores.obtener((ctx.pathParamAsClass("txtId", Integer.class).get()));
        var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
        var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
        var empresa = ctx.formParamAsClass("txtEmpresa", String.class).get();
        var telefono = ctx.formParamAsClass("txtTelefono", String.class).get();

        var proveedormodificado = new Proveedor(nombre,apellido,empresa,telefono);
        this.interfazProveedores.modificar(proveedormodificado);
        ctx.redirect("/proveedores");
    }

    /**
     * @param context
     */
    public void eliminarProveedor(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el id del proveedor que se quiere eliminar
        this.interfazProveedores.borrar((ctx.pathParamAsClass("txtId", Integer.class).get()));
        ctx.redirect("/proveedores");

    }

}