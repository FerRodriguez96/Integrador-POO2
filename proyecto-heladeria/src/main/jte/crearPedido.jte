@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo
@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modeloCliente
@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProducto modeloProducto
@tag.header()
    <br>
    <div class="card">

        <div class="card-header">
            Ingresar pedido
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del pedido</h5>
        </div>
        <form action = "/pedido/nuevo/${modelo.cliente.getDni()}" method="post">
            <div class="card-body">
                <h6 class="card-title">Datos del cliente</h6>
                <div class="form-group">
                    <input type="hidden" class="form-control" value = "${modelo.cliente.getDni()}" type="integer" name= "txtDni">
                </div>
                <label for="txtNombre">Nombre: ${modelo.cliente.getNombre()}</label>
                <br>
                <label for="txtApellido">Apellido: ${modelo.cliente.getApellido()}</label>
                <br>
                <label for="txtCalle">Calle: ${modelo.cliente.getCalle()}</label>
                <br>
                <label for="txtNumero">Numero: ${modelo.cliente.getNumero()}</label>
                <br>
                <label for="txtTelefono">Telefono: ${modelo.cliente.getTelefono()}</label>
                <br>
                
                <select name="listaProducto">
                    @for (var producto : modelo.productos)
                        if(producto.productos != null){
                            <option value="${producto.getIdProducto()}">Tipo: ${producto.getTipoProducto()} Precio: ${producto.getPrecio()}</option>
                        }
                    @endfor
                </select>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-success" value="Agregar">
                <a href="/index" class="btn btn-primary">Regresar</a>
            </div>
        </form>
        
@tag.footer()
