package com.repositorios;

import java.util.List;

import com.modelo.Repartidor;

public interface InterfazRepartidores {

    List<Repartidor> listar();

    void crear(Repartidor repartidor);

    boolean borrar(int dni);

    Repartidor obtener(int dni);

}