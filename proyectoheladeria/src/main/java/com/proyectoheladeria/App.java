package com.proyectoheladeria;

import io.javalin.Javalin;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create().start(8080);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
