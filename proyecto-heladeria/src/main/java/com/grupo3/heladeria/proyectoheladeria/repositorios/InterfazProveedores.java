package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Proveedor;

public interface InterfazProveedores {

    List<Proveedor> listar();

    void crear(Proveedor proveedor);

    boolean borrar(int id);

    Proveedor obtener(int id);

    Proveedor modificar (Proveedor proveedor);

}