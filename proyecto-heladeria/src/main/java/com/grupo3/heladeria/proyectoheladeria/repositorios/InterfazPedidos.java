package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;
import com.grupo3.heladeria.proyectoheladeria.modelo.Pedido;

public interface InterfazPedidos {

    List<Pedido> listar();

    void crear(Pedido pedido);

    boolean borrar(int id);

    Pedido obtener(int id);

}