@param com.paginas.ModeloCliente modelo

@tag.header()

<h2> Datos del cliente </h2>

<p> DNI ${modelo.cliente.getDni()}</p>
<p> Nombre ${modelo.cliente.getNombre()}</p>
<p> Apellido ${modelo.cliente.getApellido()}</p>
<p> Calle ${modelo.cliente.getCalle()}</p>
<p> Numero ${modelo.cliente.getNumero()}</p>

<a href="/clientes" type="button" class="btn btn-secondary"> Volver </a>

@tag.footer()