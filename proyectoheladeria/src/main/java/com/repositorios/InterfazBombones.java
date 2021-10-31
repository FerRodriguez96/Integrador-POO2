package com.repositorios;

import java.util.List;

import com.modelo.Bombon;
import com.modelo.Sabor;

public interface InterfazBombones {

	List<Bombon> listar();
    void crear (Bombon bombon);
    boolean borrar (Sabor sabor);
    Bombon obtener (Sabor sabor);
	
}
