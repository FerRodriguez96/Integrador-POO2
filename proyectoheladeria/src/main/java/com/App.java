package com;

import io.javalin.*;
import io.javalin.http.Context;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("test");
        Javalin app = Javalin.create().start(7000);
        app.get("/", App::mostrarIndex); // muestra el index
        app.get("/crearCliente", App::mostrarCrearCliente);
        app.get("/tipoEmpleado", App::mostrarTipoEmpleado);
        app.get("/crearJornalero", App::mostrarCrearJornalero);
        app.get("/crearRepartidor", App::mostrarCrearRepartidor);
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

}
