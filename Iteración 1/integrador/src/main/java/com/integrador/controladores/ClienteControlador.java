package com.integrador.controladores;

import java.sql.SQLException;
import java.util.Collections;

import com.integrador.paginas.ModeloClientes;
import io.javalin.http.Context;
import repositorio.ClientesRepositorio;

public class ClienteControlador {

    private ClientesRepositorio clientesRepositorio;

    public void ClientesControlador(ClientesRepositorio clientesRepositorio) {
        this.clientesRepositorio = clientesRepositorio;
    }

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloClientes();
        modelo.clientes = clientesRepositorio.listar();
        ctx.render("clientes.jte", Collections.singletonMap("modelo", modelo));
    }

}
