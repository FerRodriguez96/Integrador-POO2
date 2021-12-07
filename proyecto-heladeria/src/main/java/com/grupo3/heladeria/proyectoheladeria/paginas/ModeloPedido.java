package com.grupo3.heladeria.proyectoheladeria.paginas;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;
import com.grupo3.heladeria.proyectoheladeria.modelo.Pedido;
import com.grupo3.heladeria.proyectoheladeria.modelo.Producto;

public class ModeloPedido {

    public Pedido pedido;
    public Cliente cliente;
    public List<Producto> productos = new ArrayList<>();
}