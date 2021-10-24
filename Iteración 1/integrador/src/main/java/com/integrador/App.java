package com.integrador;

import io.javalin.*;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("test");
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.render("index.jte"));
        app.get("/clientes", ctx -> ctx.render("clientes.jte"));
        app.get("/clientes/agregar", ctx -> ctx.render("clientes.jte"));
    }
}
