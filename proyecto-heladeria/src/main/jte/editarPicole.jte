@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles modelo

@tag.header()

    <div class="card">
        <div class="card-header">
            Modificar picole
        </div>
        <div class="card-body">
            <h5 class="card-title">Datos del picole</h5>
            <p class="card-text">
                <form action = "/picoles/update/${modelo.picole.getId()}" method="post">
                    <div class="form-group">
                        <label for="txtSabor">Sabor:</label>
                        <input type="hidden" class="form-control" value = "${modelo.picole.getId()}" type="integer" name= "txtId">
                        <input id="txtSabor" value= "${modelo.picole.getSabor()}" class="form-control" type="text" name="txtSabor">
                    </div>

                    <div class="form-group">
                        <label for="txtPrecio">Precio:</label>
                        <input id="txtPrecio" value= "${modelo.picole.getPrecio()}" class="form-control" type="float" name="txtPrecio">
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCantidad">Cantidad:</label>
                        <input id="txtCantidad" value= "${modelo.picole.getCantidad()}" class="form-control" type="integer" name="txtCantidad">
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