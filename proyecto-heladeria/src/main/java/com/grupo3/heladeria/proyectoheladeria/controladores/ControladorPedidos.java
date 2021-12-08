package com.grupo3.heladeria.proyectoheladeria.controladores;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.grupo3.heladeria.proyectoheladeria.modelo.Pedido;
import com.grupo3.heladeria.proyectoheladeria.modelo.Producto;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos;
import com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProductos;
import com.grupo3.heladeria.proyectoheladeria.repositorios.InterfazPedidos;
import com.grupo3.heladeria.proyectoheladeria.repositorios.RepositorioClientes;
import com.grupo3.heladeria.proyectoheladeria.repositorios.RepositorioProductos;

import io.javalin.http.Context;

public class ControladorPedidos {

	private final InterfazPedidos interfazPedidos;
	private final RepositorioClientes repositorioCliente;
	private final RepositorioProductos repositorioProductos;

	public ControladorPedidos() {
		this.interfazPedidos = null;
		this.repositorioCliente = null;
		this.repositorioProductos = null;
	}

	public ControladorPedidos(InterfazPedidos interfazPedidos, RepositorioClientes repositorioCliente,
			RepositorioProductos repositorioProductos) {
		this.interfazPedidos = interfazPedidos;
		this.repositorioCliente = repositorioCliente;
		this.repositorioProductos = repositorioProductos;
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
	public void listarProductos(Context ctx) throws SQLException {
		// Se obtienen los datos de la clase
		var modelo = new ModeloPedido();
		
		var dniCliente = ctx.pathParamAsClass("txtDni", Integer.class).get();
		modelo.cliente = repositorioCliente.obtener(dniCliente);
		
		// Se pasan los datos a el metodo listar
		modelo.productos = repositorioProductos.listar();

		// Se imprime por consola la lista de pedidos
		System.out.println(modelo.productos);

		// Se muestra el template con la lista de pedidos
		ctx.render("seleccionarProducto.jte", Collections.singletonMap("modelo", modelo));
	}

	/**
	 * @param ctx
	 */
	public void nuevoPedido(Context ctx) throws SQLException {
		var dniCliente = ctx.pathParamAsClass("txtDni", Integer.class).get();

		var modelo = new ModeloPedido();
		modelo.cliente = repositorioCliente.obtener(dniCliente);
		//parte de productos
		//var modeloProducto = new ModeloProductos();
		//modeloProducto.productos = repositorioProductos.listar();
		// var producto = repositorioProductos.obtener(idProducto);
		// modelo.productos.add(producto);
		// el programa muestra el formulario para ingresar los datos de un nuevo pedido
		ctx.render("crearPedido.jte", Collections.singletonMap("modelo", modelo));
		
		//ctx.render("crearPedido.jte",Map.of("modelo", modelo, "modeloProducto", modeloProducto)); // no funciona
		
	}

	/**
	 * @param ctx
	 */
	public void agregarPedido(Context ctx) throws SQLException {

		// Se obtienen los datos del formulario

		var dniCliente = ctx.pathParamAsClass("txtDni", Integer.class).get();
		//List <Producto> productos = ctx.formParamAsClass("listaProducto", List.class).get();

		var modelo = new ModeloPedido();
		modelo.cliente = repositorioCliente.obtener(dniCliente);
		var pedido = new Pedido();
		pedido.setCliente(modelo.cliente);

		this.interfazPedidos.crear(pedido);
		System.out.println(pedido);
		// Se redirige a la pagina que muestra la lista de pedidos
		ctx.redirect("/pedidos");
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