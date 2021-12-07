package com.grupo3.heladeria.proyectoheladeria.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "PAGOS")
public class Pago {
    @Id
    @SequenceGenerator(name = "sec_pago", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_pago", strategy = GenerationType.SEQUENCE)
    @Column(name = "IDPAGO")
    protected int idPago;
    private Pedido pedido;
    private double total;
    private EstadoPago estado;

    public Pago() {
    }

    /**
     * Crea un pago al que se le pasa un pedido
     * 
     * @param pedido info del pedido
     */

    public Pago(Pedido pedido) {
        this.pedido = pedido;
        this.estado = EstadoPago.PENDIENTE;
        this.total = pedido.getPreciofinal();
    }

    /**
     * Obtiene el id del pago
     * 
     * @return int
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * Establece el id del pago
     * 
     * @param idPago
     */
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    /**
     * Obtiene el pedido
     * 
     * @return Pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Establece el pedido
     * 
     * @param pedido
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * Obtiene el total del pago
     * 
     * @return Float
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Establece el total del pago
     * 
     * @param total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Obtiene el estado del pago
     * 
     * @return Estado_Pago
     */
    public EstadoPago getEstado() {
        return estado;
    }

    /**
     * Establece el estado del pago
     * 
     * @param estado
     */
    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

}
