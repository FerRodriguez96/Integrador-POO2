@tag.header()
    <br>
    <div class="card">
        <div class="card-header">
            Ingresar jornaleros
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del jornalero</h5>
            <p class="card-text">
                <form action = "/jornaleros" method="post">
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
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" class="form-control" type="text" name="txtTelefono">
                    </div>

                    <div class="form-group">
                        <label for="txtCorreo">Correo:</label>
                        <input id="txtCorreo" class="form-control" type="text" name="txtCorreo">
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