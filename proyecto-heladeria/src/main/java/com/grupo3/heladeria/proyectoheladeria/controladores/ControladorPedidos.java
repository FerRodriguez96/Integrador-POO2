package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazPedidos;

import io.javalin.http.Context;

public class ControladorPedidos {

	private final InterfazPedidos interfazPedidos;

	public ControladorPedidos(){
		this.interfazPedidos = null;
	}

	public ControladorPedidos(InterfazPedidos interfazPedidos) {
		this.interfazPedidos = interfazPedidos;
	}

	/**
	 * @param ctx
	 */
	public void listar(Context ctx) throws SQLException {
		// Se obtienen los datos de la clase
		var modelo = new ModeloPedidos();

		// Se pasan los datos a el metodo listar
		modelo.pedidos = interfazPedidos.listar();

		// Se imprime por consola la lista de pedidos
		System.out.println(modelo.pedidos);

		// Se muestra el template con la lista de pedidos
		ctx.render("pedidos.jte", Collections.singletonMap("modelo", modelo));
	}
	
	/**
	 * @param ctx
	 */
	public void nuevoPedido(Context ctx) throws SQLException {
		// el programa muestra el formulario para ingresar los datos de un nuevo pedido
		ctx.render("crearPedido.jte", Collections.singletonMap("modelo", null));
	}

	/**
	 * @param ctx
	 */
	public void agregarPedido(Context ctx) throws SQLException {

		// Se obtienen los datos del formulario
		//List<Productos> producto = ctx.formParamAsClass("listaProducto", List.class).get();

		//List<Productos> listaproductos = new ArrayList<>().addAll(ctx.formParamAsClass("listaProducto", List.class).get());
		// Se crea un nuevo objeto pedido
		//var pedido = new Pedido(listaproducto);

		// Se inicia el proceso de persistencia
		//this.interfazPedidos.crear(pedido);

		// Se redirige a la pagina que muestra la lista de pedidos
		//ctx.redirect("/Pedidos");
	}

	/**
	 * @param context
	 */
	public void editarPedido(Context ctx) throws SQLException {

		// se traen los datos de la clase
		var modelo = new ModeloPedido();

		// se le pasa al proceso de persistencia el id del pedido que se quiere editar
		modelo.pedido = this.interfazPedidos.obtener(ctx.pathParamAsClass("idPedido", Integer.class).get());

		// el programa muestra el template para editar jornaleros
		ctx.render("editarPedido.jte", Collections.singletonMap("modelo", modelo));
	}

	/**
	 * @param context
	 */
	public void eliminarPedido(Context ctx) throws SQLException {
		// se le pasa al proceso de persistencia el id del pedido que se quiere eliminar
		this.interfazPedidos.borrar(ctx.pathParamAsClass("idPedido", Integer.class).get());

	}

}