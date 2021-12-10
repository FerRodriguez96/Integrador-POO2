@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidor modelo
@tag.header()
    <div class="card">
        <div class="card-header">
            Modificar repartidor
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del repartidor</h5>
            <p class="card-text">
                <form action = "/repartidores/update/${modelo.repartidor.getDni()}" method="post">
                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input type="hidden" class="form-control" value = "${modelo.repartidor.getDni()}" type="text" name= "txtDni">
                        <input id="txtNombre" value= "${modelo.repartidor.getNombre()}" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtApellido">Apellido:</label>
                        <input id="txtApellido" value= "${modelo.repartidor.getApellido()}" class="form-control" type="text" name="txtApellido">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefono">Telefono:</label>
                        <input id="txtTelefono" value= "${modelo.repartidor.getTelefono()}" class="form-control" type="text" name="txtTelefono">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCorreo">Correo:</label>
                        <input id="txtCorreo" value= "${modelo.repartidor.getCorreo()}" class="form-control" type="text" name="txtCorreo">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Modificar">
                        <a href="/repartidores" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>


@tag.footer()