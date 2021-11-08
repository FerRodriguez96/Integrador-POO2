package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;

public interface InterfazPicoles {

    List<Picole> listar();

    void crear(Picole Picole);

    boolean borrar(Integer integer);

    Picole obtener(Integer integer);

    Picole modificar(Picole picole);

}