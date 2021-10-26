@param edu.unam.jte.paginas.ModeloClientes modelo

@tag.header()

    <h2> Clientes </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">DNI</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                </tr>
            </thead>

            <tbody>
                @for (var cliente : modelo.clientes)
                    <tr>
                        <td scope="row">${cliente.getDNI()}</td>
                        <td>${cliente.getNombre()}</td>
                        <td>${cliente.getApellido()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="clientes/${clientes.getDNI()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${cliente.getDNI()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>

@tag.footer()