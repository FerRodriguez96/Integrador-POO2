@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombones modelo

@tag.header()

<h2> Bombon </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
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
                @for (var bombon : modelo.bombones)
                    <tr>
                        <td>${bombon.getSabor()}</td>
                        <td>${bombon.getPrecio()}</td>
                        <td>${bombon.getCantidad()}</td>
                        <!--
                        <td class="col-1"> <a type="button" class="btn btn-info" href="/bombones/update/${bombon.getId()}"> Editar </a></td>
                        -->
                        <td class="col-1"> <a type="button" class="btn btn-info"> Editar </a></td>

                        <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${bombon.getId()})"> Eliminar </button></td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>
    <script src="js/bombones.js"> </script>
@tag.footer()