@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProveedor modelo
@tag.header()
    <div class="card">
        <div class="card-header">
            Modificar proveedor
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del proveedor</h5>
            <p class="card-text">
                <form action = "/proveedores/update/${modelo.proveedor.getIdProveedor()}" method="post">
                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input type="hidden" class="form-control" value = "${modelo.proveedor.getIdProveedor()}" type="integer" name="txtId">
                        <input id="txtNombre" value= "${modelo.proveedor.getNombre()}" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" value= "${modelo.proveedor.getApellido()}" class="form-control" type="text" name="txtApellido">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtEmpresa">Empresa:</label>
                        <input id="txtEmpresa" value= "${modelo.proveedor.getEmpresa()}" class="form-control" type="text" name="txtEmpresa">
                    </div>

                    <div class="form-group">
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" value= "${modelo.proveedor.getTelefono()}" class="form-control" type="text" name="txtTelefono">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Modificar">
                        <a href="/proveedores" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>


@tag.footer()