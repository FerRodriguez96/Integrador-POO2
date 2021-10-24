package com;

import io.javalin.*;
import io.javalin.http.Context;

public class App 
{
    public static void main( String[] args )
    {

        Javalin app = Javalin.create().start(7000);
        app.get("/", App::mostrarIndex); // muestra el index
    }
    
    private static void mostrarIndex(Context ctx) {
        ctx.render("index.jte");
    }
}
