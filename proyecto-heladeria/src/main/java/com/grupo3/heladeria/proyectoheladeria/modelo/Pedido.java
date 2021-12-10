package com.grupo3.heladeria.proyectoheladeria.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "PEDIDOS")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IDPEDIDO")
    @SequenceGenerator(name = "sec_ped", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_ped", strategy = GenerationType.SEQUENCE)
    private int idPedido;

    @ManyToOne
    @JoinColumn(name = "REPARTIDOR")
    private Repartidor repartidor;

    @Column(name = "FECHA")
    private LocalDate fecha;

    @Column(name = "HORAINICIO")
    private LocalDateTime horainicio;

    @OneToMany
    @JoinColumn(name = "PRODUCTOS")
    private List<Producto> productos = new ArrayList<>();

    @Column(name = "PRECIOFINAL")
    private double preciofinal;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "HORAENTREGA")
    private LocalDateTime horaentrega;

    @ManyToOne
    @JoinColumn(name = "CLIENTE")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "PAGO")
    private Pago pago;

    public Pedido() {

    }

    /**
     * Obtiene el id del pedido
     * 
     * @return id del pedido
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
     * Obtiene el repartidor del pedido
     * 
     * @return repartidor del pedido
     */
    public Repartidor getRepartidor() {
        return repartidor;
    }

    /**
     * Establece el repartidor a cargo del pedido
     * 
     * @param repartidor repartidor del pedido
     */
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    /**
     * Obtiene la fecha del pedido
     * 
     * @return fecha del pedido
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del pedido
     * 
     * @param fecha fecha del pedido
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora de inicio del pedido
     * 
     * @return hora de inicio del pedido
     */
    public LocalDateTime getHorainicio() {
        return horainicio;
    }

    /**
     * Establece la hora de inicio del pedido
     * 
     * @param horainicio horainicio del pedido
     */
    public void setHorainicio(LocalDateTime horainicio) {
        this.horainicio = horainicio;
    }

    /**
     * Obtiene la lista de productos del pedido
     * 
     * @return productos del pedido
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Añade un nuevo producto al pedido
     * 
     * @param producto producto del pedido
     */
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    
    /**
     * Establece productos en el pedido
     * 
     * @param productos productos del pedido
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Obtiene el precio final del pedido
     * 
     * @return precio final del pedido
     */
    public double getPreciofinal() {
        return preciofinal;
    }

    /**
     * Establece el precio final del pedido
     * 
     * @param preciofinal preciofinal del pedido
     */
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    /**
     * Obtiene la hora de entrega del pedido
     * 
     * @return hora de entrega del pedio
     */
    public LocalDateTime getHoraentrega() {
        return horaentrega;
    }

    /**
     * Establece la hora de entrega del pedido
     * 
     * @param horaentrega horaentrega del pedido
     */
    public void setHoraentrega(LocalDateTime horaentrega) {
        this.horaentrega = horaentrega;
    }

    /**
     * Obtiene el cliente que hizo el pedido
     * 
     * @return cliente del pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente que hizo el pedido
     * 
     * @param cliente cliente del pedido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el estado del pedido
     * 
     * @return estado del pedido
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del pedido
     * 
     * @param estado estado del pedido
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el pago del pedido
     * 
     * @return pago del pedido
     */
    public Pago getPago() {
        return pago;
    }

    /**
     * Establece el pago del pedido
     * 
     * @param pago pago del pedido
     */
    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + " ,\n estado=" + estado + ", fecha=" + fecha + ", horaentrega=" + horaentrega
                + ", horainicio=" + horainicio + ", idPedido=" + idPedido + ", preciofinal=" + preciofinal
                + ",\n productos=" + productos + ",\n repartidor=" + repartidor + "]";
    }

}