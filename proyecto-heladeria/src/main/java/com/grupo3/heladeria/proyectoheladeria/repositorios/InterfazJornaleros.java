package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Jornalero;

public interface InterfazJornaleros {

    List<Jornalero> listar();

    void crear(Jornalero jornalero);

    boolean borrar(int dni);

    Jornalero obtener(int dni);

    Jornalero modificar(Jornalero jornalero);

}