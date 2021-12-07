@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos modelo

@tag.header()

    <h2> Insumos </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
    <div class="table-responsive">
        <table class="table table-light">
            <thead class="thead-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Cantidad</th>
                </tr>
            </thead>

            <tbody>
                @for (var insumo : modelo.insumos)
                    <tr>
                        <td scope="row">${insumo.getIdInsumo()}</td>
                        <td>${insumo.getNombre()}</td>
                        <td>${insumo.getDescripcion()}</td>
                        <td>${insumo.getCantidad()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/insumos/update/${insumo.getIdInsumo()}"> Editar </a></td>
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${insumo.getIdInsumo()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
<script src="js/insumos.js"></script>
@tag.footer()