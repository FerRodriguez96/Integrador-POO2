@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo

@tag.header()

    <h2> Seleccionar Repartidor </h2>
    <a href="/pedidos" type="button" class="btn btn-secondary"> Volver </a>
    <div class="table-responsive">
        <table class="table table-light">
            <thead class="thead-light">
                <tr>
                    <th scope="col">DNI</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Telefono</th>
                </tr>
            </thead>
            <tbody>
                @for (var repartidor : modelo.repartidores)
                    <tr>
                        <td scope="row">${repartidor.getDni()}</td>
                        <td>${repartidor.getNombre()}</td>
                        <td>${repartidor.getApellido()}</td>
                        <td>${repartidor.getTelefono()}</td>

                        
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/pedido/${modelo.pedido.getIdPedido()}/repartidor/${repartidor.getDni()}"> Seleccionar </a></td>
                        <!--
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/pedido/${modelo.pedido.getIdPedido()}/repartidor"> Seleccionar </a></td>
                        -->
                    </tr>
                @endfor 
            </tbody>
        </table>
    </div>
@tag.footer()