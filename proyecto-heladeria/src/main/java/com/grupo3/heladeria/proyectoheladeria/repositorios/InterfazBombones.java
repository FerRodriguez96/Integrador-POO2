package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;

public interface InterfazBombones {

    List<Bombon> listar();

    void crear(Bombon bombon);

    boolean borrar(Sabores sabor);

    Bombon obtener(Sabores sabor);

    Bombon modificar(Bombon bombon);

}