package com.repositorios;

import java.util.List;

import com.modelo.Cliente;

public interface InterfazClientes {
	
	List<Cliente> listar();
    void crear (Cliente cliente);
    boolean borrar (int dni);
    Cliente obtener (int dni);
	
}
