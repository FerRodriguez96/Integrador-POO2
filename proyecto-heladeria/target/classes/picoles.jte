@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles modelo

@tag.header()

<h2> Picole </h2>
    <a href="/index" type="button" class="btn btn-primary"> Regresar </a>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">Sabor</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Cantidad</th>
                </tr>
            </thead>

            <tbody>
                @for (var picole : modelo.picoles)
                    <tr>
                        <td>${picole.getSabor()}</td>
                        <td>${picole.getPrecio()}</td>
                        <td>${picole.getCantidad()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/picoles/update/${picole.getId()}"> Editar </a></td>                        
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${picole.getId()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
    <script src="js/picoles.js"> </script>
@tag.footer()