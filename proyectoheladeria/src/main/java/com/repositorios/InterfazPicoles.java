package com.repositorios;

import java.util.List;

import com.modelo.Picole;
import com.modelo.Sabor;

public interface InterfazPicoles {

    List<Picole> listar();

    void crear(Picole Picole);

    boolean borrar(Sabor sabor);

    Picole obtener(Sabor sabor);

}