package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;

public interface InterfazSabores {

    List<Sabor> listar();

    void crear(Sabor sabor);

    boolean borrar(int id);

    Sabor obtener(int id);

}