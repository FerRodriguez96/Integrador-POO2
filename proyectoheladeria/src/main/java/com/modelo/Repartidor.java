package com.modelo;

import java.util.List;

public class Repartidor extends Empleados {

    private List<String> repartidor_pedidos;

    public Repartidor(){

    }

    public Repartidor(int dni, int idEmpleado, String nombre, String apellido, String telefono, String mail,
            List<String> repartidor_pedidos) {
        super(dni, idEmpleado, nombre, apellido, telefono, mail);
        this.repartidor_pedidos = repartidor_pedidos;
    }

    public List<String> getRepartidor_pedidos() {
        return repartidor_pedidos;
    }

    public void setRepartidor_pedidos(List<String> repartidor_pedidos) {
        this.repartidor_pedidos = repartidor_pedidos;
    }

    


    
    
}
