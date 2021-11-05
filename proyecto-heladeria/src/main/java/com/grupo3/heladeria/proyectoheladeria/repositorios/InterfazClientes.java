package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;

public interface InterfazClientes {

    List<Cliente> listar();

    void crear(Cliente cliente);

    boolean borrar(int dni);

    Cliente obtener(int dni);

    Cliente modificar (Cliente cliente);

}