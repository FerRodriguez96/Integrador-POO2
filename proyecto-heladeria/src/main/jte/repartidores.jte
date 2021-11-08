@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidores modelo

@tag.header()

<h2> Repartidores </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">DNI</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Correo</th>
                </tr>
            </thead>

            <tbody>
                @for (var repartidor : modelo.repartidores)
                    <tr>
                        <td scope="row">${repartidor.getDni()}</td>
                        <td>${repartidor.getNombre()}</td>
                        <td>${repartidor.getApellido()}</td>
                        <td>${repartidor.getTelefono()}</td>
                        <td>${repartidor.getCorreo()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info" href="/repartidores/update/${repartidor.getDni()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${repartidor.getDni()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
<script src="js/repartidores.js"></script>
@tag.footer()