package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;

public interface InterfazBombones {

    List<Bombon> listar();

    void crear(Bombon bombon);

    boolean borrar(Integer integer);

    Bombon obtener(Integer integer);

    Bombon modificar(Bombon bombon);

}