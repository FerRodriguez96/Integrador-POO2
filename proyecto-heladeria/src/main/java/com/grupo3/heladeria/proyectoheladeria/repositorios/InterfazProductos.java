package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Producto;

public interface InterfazProductos {

    List<Producto> listar();

    void crear(Producto producto);

    boolean borrar(Integer integer);

    Producto obtener(Integer integer);

    Producto modificar(Producto producto);

}