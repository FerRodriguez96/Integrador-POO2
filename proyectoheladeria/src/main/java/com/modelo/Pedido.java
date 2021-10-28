package com.modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Pedidos")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdPedido")
    @SequenceGenerator(name = "sec_ped", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_ped", strategy = GenerationType.SEQUENCE)
    private int idPedido;

    @ManyToOne
    @Column(name = "Cliente")
    private Cliente cliente;

    @OneToMany
    @Column(name = "Productos")
    private Productos producto;

    @ManyToOne
    @Column(name = "Repartidor")
    private Repartidor repartidor;

    public Pedido() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Crea un pedido al que se le pasa el cliente que hizo el pedido, los
     * productos, y el repartidor que se va a encargar de el pedido.
     * 
     * @param cliente    datos del cliente
     * @param producto   productos del pedido
     * @param repartidor repartidor encargado del pedido
     */
    public Pedido(Cliente cliente, Productos producto, Repartidor repartidor) {
        this.cliente = cliente;
        this.producto = producto;
        this.repartidor = repartidor;
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
     * Obtiene el cliente del pedido
     * 
     * @return cliente del pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente del pedido
     * 
     * @param cliente cliente del pedido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el producto del pedido
     * 
     * @return producto del pedido
     */
    public Productos getProducto() {
        return producto;
    }

    /**
     * Establece los productos del pedido
     * 
     * @param producto producto del pedido
     */
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el reparidor del pedido
     * 
     * @return repartidor del pedido
     */
    public Repartidor getRepartidor() {
        return repartidor;
    }

    /**
     * Establece el repartidor del pedido
     * 
     * @param repartidor repartidor del pedido
     */
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }
}