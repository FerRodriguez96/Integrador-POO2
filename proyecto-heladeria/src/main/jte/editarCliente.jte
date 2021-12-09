@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloCliente modelo

@tag.header()

    <div class="card">
        <div class="card-header">
            Modificar cliente
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del cliente</h5>
            <p class="card-text">
                <form action = "/clientes/update/${modelo.cliente.getDni()}" method="post">
                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input type="hidden" class="form-control" value = "${modelo.cliente.getDni()}" type="text" name= "txtDni">
                        <input id="txtNombre" value= "${modelo.cliente.getNombre()}" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" value= "${modelo.cliente.getApellido()}" class="form-control" type="text" name="txtApellido">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCalle">Calle:</label>
                        <input id="txtCalle" value= "${modelo.cliente.getCalle()}" class="form-control" type="text" name="txtCalle">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtNumero">Numero:</label>
                        <input id="txtNumero" value= "${modelo.cliente.getNumero()}" class="form-control" type="text" name="txtNumero">
                    </div>
                    <div class="form-group">
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" value= "${modelo.cliente.getTelefono()}" class="form-control" type="text" name="txtTelefono">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Modificar">
                        <a href="/clientes" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>


@tag.footer()