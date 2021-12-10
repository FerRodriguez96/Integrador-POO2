package gg.jte.generated.ondemand;
public final class JtecrearPedidoGenerated {
	public static final String JTE_NAME = "crearPedido.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,3,3,13,13,13,17,17,17,17,17,17,17,19,19,19,21,21,21,23,23,23,25,25,25,27,27,27,31,31,33,33,33,33,33,33,33,33,33,33,33,33,33,35,35,44,44,45};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modeloCliente, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProducto modeloProducto) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    <br>\r\n    <div class=\"card\">\r\n\r\n        <div class=\"card-header\">\r\n            Ingresar pedido\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del pedido</h5>\r\n        </div>\r\n        <form action = \"/pedido/nuevo/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(modelo.cliente.getDni());
		jteOutput.writeContent("\" method=\"post\">\r\n            <div class=\"card-body\">\r\n                <h6 class=\"card-title\">Datos del cliente</h6>\r\n                <div class=\"form-group\">\r\n                    <input type=\"hidden\" class=\"form-control\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.cliente.getDni())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.cliente.getDni());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" type=\"integer\" name= \"txtDni\">\r\n                </div>\r\n                <label for=\"txtNombre\">Nombre: ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(modelo.cliente.getNombre());
		jteOutput.writeContent("</label>\r\n                <br>\r\n                <label for=\"txtApellido\">Apellido: ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(modelo.cliente.getApellido());
		jteOutput.writeContent("</label>\r\n                <br>\r\n                <label for=\"txtCalle\">Calle: ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(modelo.cliente.getCalle());
		jteOutput.writeContent("</label>\r\n                <br>\r\n                <label for=\"txtNumero\">Numero: ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(modelo.cliente.getNumero());
		jteOutput.writeContent("</label>\r\n                <br>\r\n                <label for=\"txtTelefono\">Telefono: ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(modelo.cliente.getTelefono());
		jteOutput.writeContent("</label>\r\n                <br>\r\n                \r\n                <select name=\"listaProducto\">\r\n                    ");
		for (var producto : modelo.productos) {
			jteOutput.writeContent("\r\n                        if(producto.productos != null){\r\n                            <option");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(producto.getIdProducto())) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(producto.getIdProducto());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">Tipo: ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(producto.getTipoProducto());
			jteOutput.writeContent(" Precio: ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(producto.getPrecio());
			jteOutput.writeContent("</option>\r\n                        }\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </select>\r\n            </div>\r\n            <div class=\"form-group\">\r\n                <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\r\n                <a href=\"/index\" class=\"btn btn-primary\">Regresar</a>\r\n            </div>\r\n        </form>\r\n        \r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido)params.get("modelo");
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modeloCliente = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes)params.get("modeloCliente");
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProducto modeloProducto = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloProducto)params.get("modeloProducto");
		render(jteOutput, jteHtmlInterceptor, modelo, modeloCliente, modeloProducto);
	}
}
