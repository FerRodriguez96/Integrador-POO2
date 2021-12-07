@tag.header()


    <br>
    <div class="card">
        <div class="card-header">
            Ingresar insumo
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del insumo</h5>
            <p class="card-text">
                <form action = "/insumos" method="post">

                    <div class="form-group">
                        <label for="txtNombre">Nombre:</label>
                        <input id="txtNombre" class="form-control" type="text" name="txtNombre">
                    </div>

                    <div class="form-group">
                        <label for="txtDescripcion">Descripcion:</label>
                        <input id="txtDescripcion" class="form-control" type="text" name="txtDescripcion">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCantidad">Cantidad:</label>
                        <input id="txtCantidad" class="form-control" type="text" name="txtCantidad">
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