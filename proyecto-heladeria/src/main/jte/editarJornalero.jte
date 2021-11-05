@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornalero modelo

@tag.header()

    <div class="card">
        <div class="card-header">
            Modificar jornalero
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del jornalero</h5>
            <p class="card-text">
                <form action = "/jornaleros/update/${modelo.jornalero.getDni()}" method="post">
                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input type="hidden" class="form-control" value = "${modelo.jornalero.getDni()}" type="text" name= "txtDni">
                        <input id="txtNombre" value= "${modelo.jornalero.getNombre()}" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" value= "${modelo.jornalero.getApellido()}" class="form-control" type="text" name="txtApellido">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" value= "${modelo.jornalero.getTelefono()}" class="form-control" type="text" name="txtTelefono">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCorreo">Correo:</label>
                        <input id="txtCorreo" value= "${modelo.jornalero.getCorreo()}" class="form-control" type="text" name="txtCorreo">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Modificar">
                        <a href="/" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>


@tag.footer()