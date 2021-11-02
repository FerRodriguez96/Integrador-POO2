package com.repositorios;

import java.util.List;

import com.modelo.Jornalero;

public interface InterfazJornaleros {

    List<Jornalero> listar();

    void crear(Jornalero jornalero);

    boolean borrar(int dni);

    Jornalero obtener(int dni);

}