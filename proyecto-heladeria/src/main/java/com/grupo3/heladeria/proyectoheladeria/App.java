package com.grupo3.heladeria.proyectoheladeria;

import com.grupo3.heladeria.proyectoheladeria.controladores.*;
import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;
import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;
import com.grupo3.heladeria.proyectoheladeria.repositorios.*;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.staticfiles.Location;
import jakarta.persistence.*;

public class App {
    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("persistencia");

        // repositorios y controladores
        var repositorioClientes = new RepositorioClientes(emf);
        var controladorCliente = new ControladorCliente(repositorioClientes);

        var repositorioRepartidores = new RepositorioRepartidores(emf);
        var controladorRepartidores = new ControladorRepartidor(repositorioRepartidores);

        var repositorioJornaleros = new RepositorioJornaleros(emf);
        var controladorJornaleros = new ControladorJornalero(repositorioJornaleros);

        var repositorioPicoles = new RepositorioPicoles(emf);
        var controladorPicole = new ControladorPicole(repositorioPicoles);

        var repositorioBombones = new RepositorioBombones(emf);
        var controladorBombon = new ControladorBombon(repositorioBombones);

        var repositorioProductos = new RepositorioProductos(emf);
        var controladorProducto = new ControladorProducto(repositorioProductos);

        var repositorioPedidos = new RepositorioPedidos(emf);
        var controladorPedido = new ControladorPedidos(repositorioPedidos, repositorioClientes, repositorioProductos);

        var repositorioProveedores = new RepositorioProveedores(emf);
        var controladorProveedor = new ControladorProveedor(repositorioProveedores);

        var repositorioInsumos = new RepositorioInsumos(emf);
        var controladorInsumo = new ControladorInsumo(repositorioInsumos);

        // creacion de servidor
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).exception(Exception.class, (e, ctx) -> {
            ctx.status(404);
        }).start(7000);

        app.get("/", App::mostrarLogin); // muestra la pantalla de login
        app.get("/index", App::mostrarIndex); // muestra el index
        app.get("/tipoEmpleado", App::mostrarTipoEmpleado);
        app.get("/empleados", App::mostrarEmpleados);
        app.get("/tipoProducto", App::mostrarTipoProducto);
        app.get("/productos", App::mostrarProductos);

        // ==========================================================================
        // Pedidos
        app.get("/pedidos", controladorPedido::listar);
        app.get("/pedido/nuevo", controladorCliente::seleccionar);
        app.get("/productostest",controladorProducto::listar);
        app.get("/pedido/nuevo/{txtDni}", controladorPedido::nuevoPedido);
        app.get("/pedido/nuevo/{txtDni}/producto", controladorPedido::listarProductos);
        app.post("/pedido/nuevo/{txtDni}/producto", controladorPedido::agregarPedido);
        app.post("/pedido/nuevo/{txtDni}", controladorPedido::agregarPedido);
        //app.get("/pedido/nuevo/{txtDni}/producto/{txtIdProducto}", controladorProducto::listar);

        // ==========================================================================
        // clientes

        // muestra la pantalla de creacion de clientes
        app.get("/clientes/nuevo", controladorCliente::nuevoCliente);

        // muestra la lista de clientes guardados
        app.get("/clientes", controladorCliente::listar);

        // agrega como nuevo cliente los datos ingresados en el formulario
        app.post("/clientes", controladorCliente::agregarCliente);

        // muestra un formulario para editar clientes
        app.get("/clientes/update/{txtDni}", controladorCliente::editarCliente);

        // modifica el cliente
        app.post("/clientes/update/{txtDni}", controladorCliente::modificarCliente);

        // elimina un cliente
        app.delete("clientes/delete/{txtDni}", controladorCliente::eliminarCliente);

        // ==========================================================================
        // Jornaleros

        // muestra la pantalla de creacion de jornaleros
        app.get("/jornalero/nuevo", controladorJornaleros::nuevoJornalero);

        // muestra la lista de jornaleros guardados
        app.get("/jornaleros", controladorJornaleros::listar);

        // agrega como nuevo jornalero los datos ingresados en el formulario
        app.post("/jornaleros", controladorJornaleros::agregarJornalero);

        // muestra un formulario para editar jornaleros
        app.get("/jornaleros/update/{txtDni}", controladorJornaleros::editarJornalero);

        // modifica el jornalero
        app.post("/jornaleros/update/{txtDni}", controladorJornaleros::modificarJornalero);

        // elimina un jornalero
        app.delete("/jornaleros/delete/{txtDni}", controladorJornaleros::eliminarJornalero);

        // ==========================================================================
        // Repartidores

        // muestra la pantalla de creacion de repartidores
        app.get("/repartidor/nuevo", controladorRepartidores::nuevoRepartidor);

        // muestra la lista de repartidores guardados
        app.get("/repartidores", controladorRepartidores::listar);

        // agrega como nuevo repartidor los datos ingresados en el formulario
        app.post("/repartidores", controladorRepartidores::agregarRepartidor);

        // muestra un formulario para editar repartidores
        app.get("/repartidores/update/{txtDni}", controladorRepartidores::editarRepartidor);
        // modifica el repartidor
        app.post("/repartidores/update/{txtDni}", controladorRepartidores::modificarRepartidor);

        // elimina un repartidor
        app.delete("/repartidores/delete/{txtDni}", controladorRepartidores::eliminarRepartidor);

        // ==========================================================================
        // Picoles

        // muestra la pantalla de creacion de picoles
        app.get("/picole/nuevo", controladorPicole::nuevoPicole);

        // muestra la lista de picoles guardados
        app.get("/picoles", controladorPicole::listar);

        // agrega como nuevo picole los datos ingresados en el formulario
        app.post("/picoles", controladorPicole::agregarPicole);

        // muestra un formulario para editar picoles
        app.get("/picoles/update/{txtId}", controladorPicole::editarPicole);

        app.post("/picoles/update/{txtId}", controladorPicole::modificarPicole);

        // elimina un picole
        app.delete("/picoles/delete/{txtId}", controladorPicole::eliminarPicole);

        // ==========================================================================
        // Bombones

        // muestra la pantalla de creacion de bombones
        app.get("/bombon/nuevo", controladorBombon::nuevoBombon);

        // muestra la lista de picoles guardados
        app.get("/bombones", controladorBombon::listar);

        // agrega como nuevo bombon los datos ingresados en el formulario
        app.post("/bombones", controladorBombon::agregarBombon);

        // muestra un formulario para editar bombones
        app.get("/bombones/update/{txtId}", controladorBombon::editarBombon);

        app.post("/bombones/update/{txtId}", controladorBombon::modificarBombon);

        // elimina un bombon
        app.delete("/bombones/delete/{txtId}", controladorBombon::eliminarBombon);

        // ==========================================================================
        // Proveedores

        // muestra la pantalla de creacion de proveedores
        app.get("/proveedor/nuevo", controladorProveedor::nuevoProveedor);

        // muestra la lista de proveedores guardados
        app.get("/proveedores", controladorProveedor::listar);

        // agrega como nuevo proveedor los datos ingresados en el formulario
        app.post("/proveedores", controladorProveedor::agregarProveedor);

        // muestra un formulario para editar proveedores
        app.get("/proveedores/update/{txtId}", controladorProveedor::editarProveedor);

        app.post("/proveedores/update/{txtId}", controladorProveedor::modificarProveedor);

        // elimina un proveedor
        app.delete("/proveedores/delete/{txtId}", controladorProveedor::eliminarProveedor);

        // ==========================================================================
        // Insumos

        // muestra la pantalla de creacion de insumos
        app.get("/insumo/nuevo", controladorInsumo::nuevoInsumo);

        // muestra la lista de insumos guardados
        app.get("/insumos", controladorInsumo::listar);

        // agrega como nuevo insumo los datos ingresados en el formulario
        app.post("/insumos", controladorInsumo::agregarInsumo);

        // muestra un formulario para editar un insumo
        app.get("/insumos/update/{txtId}", controladorInsumo::editarInsumo);

        app.post("/insumos/update/{txtId}", controladorInsumo::modificarInsumo);

        // elimina un insumo
        app.delete("/insumos/delete/{txtId}", controladorInsumo::eliminarInsumo);

        //Prueba
        var picole = new Picole();
        picole.setCantidad(10);
        picole.setSabor(Sabores.Surtido);
        picole.setPrecio((float) 20.0);
        repositorioPicoles.crear(picole);
        var cliente = new Cliente(41303618, "Ruben", "Viera", "Escalada", 670, "3756508697");
        repositorioClientes.crear(cliente);
    }

    // Otras funciones
    private static void mostrarIndex(Context ctx) {
        ctx.render("index.jte");
    }

    private static void mostrarLogin(Context ctx) {
        ctx.render("login.jte");
    }

    private static void mostrarTipoEmpleado(Context ctx) {
        ctx.render("tipoEmpleado.jte");
    }

    private static void mostrarEmpleados(Context ctx) {
        ctx.render("empleados.jte");
    }

    private static void mostrarTipoProducto(Context ctx) {
        ctx.render("tipoProducto.jte");
    }

    private static void mostrarProductos(Context ctx) {
        ctx.render("productos.jte");
    }
}
