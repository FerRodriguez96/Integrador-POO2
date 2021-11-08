@tag.header()


    <br>
    <div class="card">
        <div class="card-header">
            Ingresar clientes
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del cliente</h5>
            <p class="card-text">
                <form action = "/clientes" method="post">
                    <div class="form-group">
                        <label for="txtDni">DNI:</label>
                        <input id="txtDni" class="form-control" type="text" name="txtDni">
                    </div>

                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input id="txtNombre" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" class="form-control" type="text" name="txtApellido">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCalle">Calle:</label>
                        <input id="txtCalle" class="form-control" type="text" name="txtCalle">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtNumero">Numero:</label>
                        <input id="txtNumero" class="form-control" type="text" name="txtNumero">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Agregar">
                        <a href="/" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>

@tag.footer()