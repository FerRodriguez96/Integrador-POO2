package com.grupo3.heladeria.proyectoheladeria.modelo;

import java.io.Serializable;
import java.time.*;
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

    @Column(name="fecha")
    private LocalDate fecha;

    @Column(name="horario-de-inicio")
    private LocalTime horainicio;

    @Column(name = "preciofinal")
    private double preciofinal;

    @Column(name= "estado")
    private String estado;

    @Column(name= "horario-de-entrega")
    private LocalDateTime horaentrega;

    @OneToMany
    @JoinColumn(name = "Productos")
    private List<Producto>productos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="repartidor")
    private Repartidor repartidor;

    @OneToOne
    private Pago pago;


    public Pedido() {

    }

    public Pedido(LocalDate fecha, LocalTime horainicio, double preciofinal, List<Producto> productos) {
        this.fecha = LocalDate.now();
        this.horainicio = LocalTime.now();
        this.preciofinal = preciofinal;
        this.productos = productos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(LocalTime horainicio) {
        this.horainicio = horainicio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    public LocalDateTime getHoraentrega() {
        return horaentrega;
    }

    public void setHoraentrega(LocalDateTime horaentrega) {
        this.horaentrega = horaentrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", estado=" + estado + ", fecha=" + fecha + ", horaentrega=" + horaentrega
                + ", horainicio=" + horainicio + ", idPedido=" + idPedido + ", preciofinal=" + preciofinal
                + ", productos=" + productos + ", repartidor=" + repartidor + "]";
    }

    

 
}