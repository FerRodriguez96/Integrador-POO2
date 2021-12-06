@param com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProductos modelo

@tag.header()

<h2> Producto </h2>
    <a href="/" type="button" class="btn btn-secondary"> Volver </a>
    
    <div class="card-body">
        <h5 class="card-title">Productos</h5>
        <select name="txtIdProducto">
            @for (var producto : modelo.productos)
                <option value="${producto.getIdProducto()}">Tipo: ${producto.getTipoProducto()} Precio: ${producto.getPrecio()}</option>
            @endfor
        </select>
        <a type="button" class="btn btn-warning" href="/producto/${producto.getIdProducto()}"> Seleccionar </a>
    </div>
    
@tag.footer()