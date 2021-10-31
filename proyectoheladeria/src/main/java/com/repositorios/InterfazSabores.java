package com.repositorios;

import java.util.List;

import com.modelo.Sabor;

public interface InterfazSabores {
	
	List<Sabor> listar();
    void crear (Sabor sabor);
    boolean borrar (int id);
    Sabor obtener (int id);
	
}
