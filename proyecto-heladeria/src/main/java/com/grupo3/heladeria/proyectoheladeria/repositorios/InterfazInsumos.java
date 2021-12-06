package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Insumo;

public interface InterfazInsumos {

    List<Insumo> listar();

    void crear(Insumo insumo);

    boolean borrar(int id);

    Insumo obtener(int id);

    Insumo modificar (Insumo insumo);

}