@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo

@tag.header()

<h2> Seleccionar Repartidor</h2>
    <a href="/pedido/${modelo.pedido.getIdPedido()}/repartidor" type="button" class="btn btn-secondary"> Volver </a>
    <div class="card-body">
        <form action = "/pedido/${modelo.pedido.getIdPedido()}/repartidor/${modelo.repartidor.getDni()}" method="post" name="listaProducto">
            <select name="listaProducto">
                @for (var repartidor : modelo.repartidores)
                    <!--
                    <option value="${producto.getIdProducto()}">Tipo: ${producto.getTipoProducto()} Precio: ${producto.getPrecio()}</option>
                    -->
                @endfor
            </select>
        </form>
        <a type="button" class="btn btn-warning" href="/pedidos"> Añadir Repartidor </a>
    </div>
@tag.footer()