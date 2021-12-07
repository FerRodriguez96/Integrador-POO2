package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;
import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazBombones;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombones;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombon;

import io.javalin.http.Context;

public class ControladorBombon {

    private final InterfazBombones interfazBombones;

    public ControladorBombon(InterfazBombones interfazBombones) {
        this.interfazBombones = interfazBombones;
    }

    /**
     * @param ctx
     */
    public void listar(Context ctx) throws SQLException {
        // Se obtienen los datos de la clase
        var modelo = new ModeloBombones();

        // Se pasan los datos a el metodo listar
        modelo.bombones = interfazBombones.listar();

        // Se imprime por consola la lista de bombones
        System.out.println(modelo.bombones);

        // Se muestra el template con la lista de productos
        ctx.render("bombones.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param ctx
     */
    public void nuevoBombon(Context ctx) throws SQLException {
        // el programa muestra el formulario para ingresar los datos de un nuevo bombon
        ctx.render("crearBombon.jte", Collections.singletonMap("modelo", null));
    }

    /**
     * @param ctx
     */
    public void agregarBombon(Context ctx) throws SQLException {

        // Se obtienen los datos del formulario
        var sabor = ctx.formParamAsClass("txtSabor", Integer.class).get();
        var precio = ctx.formParamAsClass("txtPrecio", Float.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();
        var bombon = new Bombon();
        
        
        switch (sabor) {
        case 1:
            bombon = new Bombon(precio, Sabores.Frutilla, cantidad);
            break;
        case 2:
            bombon = new Bombon(precio, Sabores.Vainilla, cantidad);
            break;
        case 3:
            bombon = new Bombon(precio, Sabores.Dulce_de_leche, cantidad);
            break;
        case 4:
            bombon = new Bombon(precio, Sabores.Chantilly, cantidad);
            break;
        default:
            bombon = new Bombon(precio, Sabores.Surtido, cantidad);
            break;
        }

        // Se crea un nuevo objeto bombon
        // var bombon = new Bombon(precio, sabor, cantidad);

        // Se inicia el proceso de persistencia
        this.interfazBombones.crear(bombon);

        // Se redirige a la pagina que muestra la lista de productos
        ctx.redirect("/productos");

    }

    /**
     * @param context
     */
    public void editarBombon(Context ctx) throws SQLException {

        var modelo = new ModeloBombon();
        modelo.bombon = this.interfazBombones.obtener(ctx.pathParamAsClass("txtId", Integer.class).get());
        ctx.render("editarBombon.jte", Collections.singletonMap("modelo", modelo));
    }

    /**
     * @param context
     */
    public void modificarBombon(Context ctx) throws SQLException {
        // se traen los datos de la clase
        var modelo = new ModeloBombon();
        // se le pasa al proceso de persistencia el sabor del bombon que se quiere
        // editar
        modelo.bombon = this.interfazBombones.obtener((ctx.pathParamAsClass("txtId", Integer.class).get()));
        var id = ctx.formParamAsClass("txtId", Integer.class).get();
        var varsabor = ctx.formParamAsClass("txtSabor", Integer.class).get();
        var precio = ctx.formParamAsClass("txtPrecio", float.class).get();
        var cantidad = ctx.formParamAsClass("txtCantidad", Integer.class).get();
        switch (varsabor) {
            case 1:
                modelo.bombon.setSabor(Sabores.Frutilla);
                break;
            case 2:
                modelo.bombon.setSabor(Sabores.Vainilla);
                
                break;
            case 3:
                modelo.bombon.setSabor(Sabores.Dulce_de_leche);
                
                break;
            case 4:
                modelo.bombon.setSabor(Sabores.Chantilly);
                break;
            default:
                modelo.bombon.setSabor(Sabores.Surtido);
                break;
        }
        var bombonModificado = new Bombon(precio, modelo.bombon.getSabor(), cantidad);
        bombonModificado.setIdProducto(id);
        this.interfazBombones.modificar(bombonModificado);
        ctx.redirect("/bombones");
    }

    /**
     * @param context
     */
    public void eliminarBombon(Context ctx) throws SQLException {
        // se le pasa al proceso de persistencia el sabor del bombon que se quiere
        // eliminar
        this.interfazBombones.borrar(ctx.pathParamAsClass("txtId", Integer.class).get());

    }

}