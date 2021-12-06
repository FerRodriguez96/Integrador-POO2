@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo
@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modeloCliente
@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProductos modeloProducto
@tag.header()
    <br>
    <div class="card">

        <div class="card-header">
            Ingresar pedido
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del pedido</h5>
        </div>

        <div class="card-body">
            <h6 class="card-title">Datos del cliente</h6>
            <label for="txtNombre">Nombre: ${modelo.cliente.getNombre()}</label>
            <br>
            <label for="txtApellido">Apellido: ${modelo.cliente.getApellido()}</label>
            <br>
            <label for="txtCalle">Calle: ${modelo.cliente.getCalle()}</label>
            <br>
            <label for="txtNumero">Numero: ${modelo.cliente.getNumero()}</label>
            <br>
            <label for="txtTelefono">Telefono: ${modelo.cliente.getTelefono()}</label>
        </div>

        <!--
        <div class="card-body">
            <h6 class="card-title">Datos del producto</h6>
            <label for="txtId">ID producto: ${modelo.producto.getId()}</label>
            <br>
            <label for="txtPrecio">Precio: ${modelo.producto.getPrecio()}</label>
        </div>
        -->
        

        <div class="card-body">
            <h5 class="card-title">Productos</h5>
            <select name="txtIdProducto">
                @for (var producto : modeloProducto.productos)
                    <option value="${producto.getIdProducto()}">Tipo: ${producto.getTipoProducto()} Precio: ${producto.getPrecio()}</option>              
                @endfor
            </select>
        </div>

@tag.footer()
