package com.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Repartidor")
public class Repartidor extends Empleados {

    private List<String> repartidor_pedidos;

    public Repartidor(){
        super();
    }

    public Repartidor(List<String> repartidor_pedidos) {
        this.repartidor_pedidos = repartidor_pedidos;
    }

    public List<String> getRepartidor_pedidos() {
        return repartidor_pedidos;
    }

    public void setRepartidor_pedidos(List<String> repartidor_pedidos) {
        this.repartidor_pedidos = repartidor_pedidos;
    }

    


    
    
}
