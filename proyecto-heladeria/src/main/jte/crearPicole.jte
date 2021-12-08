@tag.header()


    <br>
    <div class="card">
        <div class="card-header">
            Ingresar picoles
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del picole</h5>
            <p class="card-text">
                <form action = "/picoles" method="post">
                    <div class="form-group">
                        <label for="txtSabor" type="hidden">Sabor: Surtido</label>
                        <input id="txtSabor" class="form-control" name="txtSabor" type="hidden" value="1">
                    </div>

                    <div class="form-group">
                        <label for="txtPrecio">Precio:</label>
                        <input id="txtPrecio" class="form-control" type="float" name="txtPrecio">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCantidad">Cantidad:</label>
                        <input id="txtCantidad" class="form-control" type="integer" name="txtCantidad">
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