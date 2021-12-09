@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos modelo

@tag.header()

    <h2> Pedidos </h2>
    <a href="/index" type="button" class="btn btn-secondary"> Volver </a>
    
    <div class="table-responsive">
        <table class="table table-light">
            <thead class="thead-light">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Fecha</th>
                    <th scope="col">Repartidor</th>
                </tr>
            </thead>

            <tbody>
                @for (var pedido : modelo.pedidos)
                    <tr>
                        <td scope="row">${pedido.getIdPedido()}</td>
                        <td scope="row">${pedido.getCliente().getNombre()}</td>
                        <td scope="row">${pedido.getCliente().getApellido()}</td>
                        <td scope="row">${pedido.getEstado()}</td>
                        <td scope="row">${pedido.getFecha().toString()}</td>
                        
                        @if(pedido.getRepartidor() == null)
                            <td scope="row">NO</td>
                        @else
                            <td scope="row">${pedido.getRepartidor().getNombre()}</td>
                        @endif
                        
                        <!--
                        <td scope="row">
                            <select name="txtProductos">
                                <option>404</option>
                                @for (var producto : modelo.productos)
                                    <input type="checkbox" id="${producto.getIdProducto()}" name="${producto.getTipoProducto()}">
                                    <label for="${producto.getIdProducto()}"> ${producto.getTipoProducto()} ${producto.getPrecio()}</label><br>
                                @endfor 
                            </select>
                        </td>
                        -->
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/pedidos/update/${pedido.getIdPedido()}"> Editar </a></td>
                        
                            <td class="col-1"> <a type="button" class="btn btn-warning" href="/pedido/${pedido.getIdPedido()}/repartidor"> Asignar repartidor </a></td>

                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
@tag.footer()