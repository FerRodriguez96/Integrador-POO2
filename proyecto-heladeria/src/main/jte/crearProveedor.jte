@tag.header()


    <br>
    <div class="card">
        <div class="card-header">
            Ingresar nuevo proveedor
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del proveedor</h5>
            <p class="card-text">
                <form action = "/proveedores" method="post">

                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input id="txtNombre" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" class="form-control" type="text" name="txtApellido">
                    </div>

                    <div class="form-group">
                        <label for="txtEmpresa">Empresa:</label>
                        <input id="txtEmpresa" class="form-control" type="text" name="txtEmpresa">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" class="form-control" type="text" name="txtTelefono">
                    </div>
                    
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Agregar">
                        <a href="/index" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>

@tag.footer()