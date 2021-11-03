package com.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedidos")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdPedido")
    @SequenceGenerator(name = "sec_ped", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_ped", strategy = GenerationType.SEQUENCE)
    private int idPedido;

    @OneToMany
    @Column(name = "Productos")
    private List<Productos>productos = new ArrayList<>();

    @Column(name = "preciofinal")
    private double preciofinal;

    public Pedido() {

    }

    /**
     * Crea un pedido al que se le pasa el cliente que hizo el pedido, los
     * productos, y el repartidor que se va a encargar de el pedido.
     * 
     * @param producto   productos del pedido
     */
    public Pedido(List<Productos> productos) {
        this.productos = productos;
    }


    /**
     * Obtiene el id del pedido
     * 
     * @return idPedido del pedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Establece el id del pedido
     * 
     * @param idPedido id del pedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Obtiene la lista de productos del pedido
     * 
     * @return productos del pedido
     */
    public List<Productos> getProductos() {
        return productos;
    }

    /**
     * Establece la lista de productos del pedido
     * 
     * @param productos productos del pedido
     */
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    /**
     * Obtiene el precio final del pedido
     * 
     * @return preciofinal del pedido
     */
    public double getPreciofinal() {
        return preciofinal;
    }

    /**
     * Establece el preciofinal del pedido
     * 
     * @param preciofinal preciofinal del pedido
     */
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    


  


}