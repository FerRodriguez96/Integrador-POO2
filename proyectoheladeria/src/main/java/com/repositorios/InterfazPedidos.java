package com.repositorios;

import java.util.List;
import com.modelo.Pedido;

public interface InterfazPedidos {

    List<Pedido> listar();

    void crear(Pedido pedido);

    boolean borrar(int id);

    Pedido obtener(int id);

}