package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;

public interface InterfazPicoles {

    List<Picole> listar();

    void crear(Picole Picole);

    boolean borrar(String string);

    Picole obtener(String sabor);

}