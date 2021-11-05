package com.grupo3.heladeria.proyectoheladeria;

import com.grupo3.heladeria.proyectoheladeria.controladores.*;
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

        // creacion de servidor
        // Javalin app = Javalin.create().start(7000);

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).exception(Exception.class, (e, ctx) -> {
            ctx.status(404);
        }).start(7000);

        app.get("/", App::mostrarIndex); // muestra el index
        app.get("/tipoEmpleado", App::mostrarTipoEmpleado);
        app.get("/empleados", App::mostrarEmpleados);
        app.get("/tipoProducto", App::mostrarTipoProducto);
        app.get("/productos", App::mostrarProductos);

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
        app.get("/picoles/update/{txdSabor}", controladorPicole::editarPicole);

        app.post("/picole/update/{txtSabor}", controladorPicole::modificarPicole);

        // elimina un picole
        app.delete("/picoles/delete/{txtSabor}", controladorPicole::eliminarPicole);

        // ==========================================================================
        // Bombones

        // muestra la pantalla de creacion de bombones
        app.get("/bombon/nuevo", controladorBombon::nuevoBombon);

        // muestra la lista de picoles guardados
        app.get("/bombones", controladorBombon::listar);

        // agrega como nuevo bombon los datos ingresados en el formulario
        app.post("/bombon", controladorBombon::agregarBombon);

        // muestra un formulario para editar bombones
        app.get("/bombon/update/{txdSabor}", controladorBombon::editarBombon);

        app.post("/bombon/update/{txtSabor}", controladorBombon::modificarBombon);

        // elimina un picole
        app.delete("/bombon/delete/{txtSabor}", controladorBombon::eliminarBombon);
    }

    // Otras funciones
    private static void mostrarIndex(Context ctx) {
        ctx.render("index.jte");
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
