package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;

public interface InterfazRepartidores {

    List<Repartidor> listar();

    void crear(Repartidor repartidor);

    boolean borrar(int dni);

    Repartidor obtener(int dni);

    Repartidor modificar(Repartidor repartidor);

}