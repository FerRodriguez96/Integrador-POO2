package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;

public interface InterfazBombones {

    List<Bombon> listar();

    void crear(Bombon bombon);

    boolean borrar(String sabor);

    Bombon obtener(String sabor);

}