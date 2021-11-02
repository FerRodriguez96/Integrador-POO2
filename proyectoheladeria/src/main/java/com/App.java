package com;

import java.util.List;

import com.controladores.ControladorCliente;
import com.repositorios.RepositorioClientes;
import com.modelo.*;
import io.javalin.Javalin;
import io.javalin.http.Context;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        // var em = emf.createEntityManager();
        // repositorios y controladores
        var repositorioClientes = new RepositorioClientes(emf);
        var controladorCliente = new ControladorCliente(repositorioClientes);

        // creacion de servidor
        Javalin app = Javalin.create().start(7000);

        app.get("/", App::mostrarIndex); // muestra el index
        app.get("/crearCliente", App::mostrarCrearCliente);
        app.post("/clientes", controladorCliente::listar);

        app.get("/tipoEmpleado", App::mostrarTipoEmpleado);
        app.get("/crearJornalero", App::mostrarCrearJornalero);
        app.get("/crearRepartidor", App::mostrarCrearRepartidor);
        app.get("/tipoProducto", App::mostrarTipoProducto);
        app.get("/crearBombon", App::mostrarCrearBombon);
        app.get("/crearPicole", App::mostrarCrearPicole);

    }

    private static void mostrarIndex(Context ctx) {
        ctx.render("index.jte");
    }

    private static void mostrarTipoEmpleado(Context ctx) {
        ctx.render("tipoEmpleado.jte");
    }

    private static void mostrarCrearJornalero(Context ctx) {
        ctx.render("crearJornalero.jte");
    }

    private static void mostrarCrearRepartidor(Context ctx) {
        ctx.render("crearRepartidor.jte");
    }

    private static void mostrarCrearCliente(Context ctx) {
        ctx.render("crearCliente.jte");
    }

    private static void mostrarTipoProducto(Context ctx) {
        ctx.render("tipoProducto.jte");
    }

    private static void mostrarCrearBombon(Context ctx) {
        ctx.render("crearBombon.jte");
    }

    private static void mostrarCrearPicole(Context ctx) {
        ctx.render("crearPicole.jte");
    }
}
