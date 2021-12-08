@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo

@tag.header()

<h2> Seleccionar Productos</h2>
    <a href="/pedido/nuevo/${modelo.cliente.getDni()}/producto" type="button" class="btn btn-secondary"> Volver </a>
    <div class="card-body">
        <!--
        <form action = "/pedido/nuevo/${modelo.cliente.getDni()}/producto" method="post" name="listaProducto">
            @for (var producto : modelo.productos)
                <input type="checkbox" id="${producto.getIdProducto()}" name="${producto.getTipoProducto()}">
                <label for="${producto.getIdProducto()}"> ${producto.getTipoProducto()} ${producto.getPrecio()}</label><br>
            @endfor
        
        </form>
        -->
        <form action = "/pedido/nuevo/${modelo.cliente.getDni()}/producto" method="post" name="listaProducto">
            <select name="listaProducto">
                @for (var producto : modelo.productos)
                    <option value="${producto.getIdProducto()}">Tipo: ${producto.getTipoProducto()} Precio: ${producto.getPrecio()}</option>
                @endfor
            </select>
        </form>
        <a type="button" class="btn btn-warning" href="/pedidos"> Añadir Productos </a>
    </div>
@tag.footer()