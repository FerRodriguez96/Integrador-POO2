@tag.header()
    <br>
    <div class="card">
        <div class="card-header">
            Ingresar bombones
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del bombon</h5>
            <p class="card-text">
                <form action = "/bombones" method="post">
                    <div class="form-group">
                        <label for="txtSabor">Sabor:</label>
                        <!--
                        <input id="txtSabor" class="form-control" type="text" name="txtSabor">
                        -->

                        <select name="txtSabor">
                            <option value="1">Frutilla</option> 
                            <option value="2">Vainilla</option> 
                            <option value="3">Dulce_de_leche</option>
                            <option value="4">Chantilly</option> 
                            <option value="5">Surtido</option> 
                        </select>
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
                        <a href="/index" class="btn btn-primary">Regresar</a>
                    </div>
                </form>
            </p>

        </div>
    </div>

@tag.footer()
