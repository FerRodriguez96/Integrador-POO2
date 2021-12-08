@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumo modelo

@tag.header()

    <div class="card">
        <div class="card-header">
            Modificar insumo
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del insumo</h5>
            <p class="card-text">
                <form action = "/insumos/update/${modelo.insumo.getIdInsumo()}" method="post">
                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input type="hidden" class="form-control" value = "${modelo.insumo.getIdInsumo()}" type="integer" name="txtId">
                        <input id="txtNombre" value= "${modelo.insumo.getNombre()}" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtDescripcion">Descripcion:</label>
                        <input id="txtDescripcion" value= "${modelo.insumo.getDescripcion()}" class="form-control" type="text" name="txtDescripcion">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCantidad">Cantidad:</label>
                        <input id="txtCantidad" value= "${modelo.insumo.getCantidad()}" class="form-control" type="integer" name="txtCantidad">
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Modificar">
                        <a href="/index" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>


@tag.footer()