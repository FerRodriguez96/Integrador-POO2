@param com.paginas.ModeloClientes modelo

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
                    <th scope="col">callle</th>
                    <th scope="col">numero</th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
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
                        <td class="col-1"> <a type="button" class="btn btn-info" href="clientes/${cliente.getDni()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger" onClick="borrar(${cliente.getDni()})"> Borrar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>

    <script src="/js/clientes.js"></script>

@tag.footer()