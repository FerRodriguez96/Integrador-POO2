@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProveedores modelo

@tag.header()

    <a href="/index" type="button" class="btn btn-primary"> Regresar </a>
    <h2> Proveedores </h2>
    <div class="table-responsive">
        <table class="table table-light">
            <thead class="thead-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Empresa</th>
                    <th scope="col">Telefono</th>
                </tr>
            </thead>

            <tbody>
                @for (var proveedor : modelo.proveedores)
                    <tr>
                        <td scope="row">${proveedor.getIdProveedor()}</td>
                        <td>${proveedor.getNombre()}</td>
                        <td>${proveedor.getApellido()}</td>
                        <td>${proveedor.getEmpresa()}</td>
                        <td>${proveedor.getTelefono()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/proveedores/update/${proveedor.getIdProveedor()}"> Editar </a></td>
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${proveedor.getIdProveedor()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
<script src="js/proveedores.js"></script>
@tag.footer()