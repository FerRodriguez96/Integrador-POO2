package com.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.modelo.Cliente;
import com.paginas.ModeloCliente;
import com.paginas.ModeloClientes;
import com.repositorios.InterfazClientes;

import io.javalin.http.Context;

public class ControladorCliente {

	private final InterfazClientes interfazClientes;

	public ControladorCliente(InterfazClientes interfazClientes) {
		this.interfazClientes = interfazClientes;
	}

	/**
	 * @param ctx
	 */
	public void listar(Context ctx) throws SQLException {
		//Se obtienen los datos de la clase
		var modelo = new ModeloClientes();
		
		//Se pasan los datos a el metodo listar
		modelo.clientes = interfazClientes.listar();
		
		//Se imprime por consola la lista de clientes
		System.out.println(modelo.clientes);
		
		//Se muestra el template con la lista de clientes
		ctx.render("clientes.jte", Collections.singletonMap("modelo", modelo));
	}

	/**
	 * @param ctx
	 */
	public void nuevoCliente(Context ctx) throws SQLException {
		// el programa musetra el formulario para ingresar los datos de un nuevo cliente
		ctx.render("crearCliente.jte", Collections.singletonMap("modelo", null));
	}

	/**
	 * @param ctx
	 */
	public void agregarCliente(Context ctx) throws SQLException {

		// Se obtienen los datos del formulario
		var dni = ctx.formParamAsClass("txtDni", Integer.class).get();
		var nombre = ctx.formParamAsClass("txtNombre", String.class).get();
		var apellido = ctx.formParamAsClass("txtApellido", String.class).get();
		var calle = ctx.formParamAsClass("txtCalle", String.class).get();
		var numero = ctx.formParamAsClass("txtNumero", Integer.class).get();

		// Se crea un nuevo objeto cliente
		var cliente = new Cliente(dni, nombre, apellido, calle, numero);

		// Se inicia el proceso de persistencia
		this.interfazClientes.crear(cliente);

		// Se redirige a la pagina que muestra la lista de clientes
		ctx.redirect("/clientes");
	}

	/**
	 * @param context
	 */
	public void editarJornalero(Context ctx) throws SQLException {

		// se traen los datos de la clase
		var modelo = new ModeloCliente();

		// se le pasa al proceso de persistencia el dni del cliente que se quiere editar
		modelo.cliente = this.interfazClientes.obtener(ctx.pathParamAsClass("txtDni", Integer.class).get());

		// el programa muestra el template para editar clientes
		ctx.render("editarCliente.jte", Collections.singletonMap("modelo", modelo));
	}

	/**
	 * @param context
	 */
	public void eliminarJornalero(Context ctx) throws SQLException {
		// se le pasa al proceso de persistencia el dni del cliente que se quiere eliminar
		this.interfazClientes.borrar(ctx.pathParamAsClass("txtDni", Integer.class).get());

	}

}
