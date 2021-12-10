@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornaleros modelo

@tag.header()

<h2> Jornaleros </h2>
    <a href="/empleados" type="button" class="btn btn-primary"> Regresar </a>
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
                @for (var jornalero : modelo.jornaleros)
                    <tr>
                        <td scope="row">${jornalero.getDni()}</td>
                        <td>${jornalero.getNombre()}</td>
                        <td>${jornalero.getApellido()}</td>
                        <td>${jornalero.getTelefono()}</td>
                        <td>${jornalero.getCorreo()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-warning" href="/jornaleros/update/${jornalero.getDni()}"> Editar </a></td>                            
                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${jornalero.getDni()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
<script src="js/jornaleros.js"></script>
@tag.footer()