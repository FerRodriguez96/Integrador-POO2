@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modelo

@tag.header()

    <h2> Clientes </h2>
    <a href="/index" type="button" class="btn btn-primary"> Regresar </a>
    <div class="table-responsive">
        <table class="table table-light">
            <thead class="thead-light">
                <tr>
                    <th scope="col">DNI</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Callle</th>
                    <th scope="col">Numero</th>
                    <th scope="col">Telefono</th>
                </tr>
            </thead>

            <tbody>
                @for (var cliente : modelo.clientes)
                    <tr>
                        <td scope="row">${cliente.getDni()}</td>
                        <td>${cliente.getNombre()}</td>
                        <td>${cliente.getApellido()}</td>
                        <td>${cliente.getCalle()}</td>
                        <td>${cliente.getNumero()}</td>
                        <td>${cliente.getTelefono()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/clientes/update/${cliente.getDni()}"> Editar </a></td>
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${cliente.getDni()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
<script src="js/clientes.js"></script>
@tag.footer()