package gg.jte.generated.ondemand;
public final class JteeditarRepartidorGenerated {
	public static final String JTE_NAME = "editarRepartidor.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,11,11,11,14,14,14,14,14,14,14,15,15,15,15,15,15,15,20,20,20,20,20,20,20,25,25,25,25,25,25,25,30,30,30,30,30,30,30,44,44};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidor modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <div class=\"card\">\n        <div class=\"card-header\">\n            Modificar repartidor\n        </div>\n        <div class=\"card-body\">\n            <h5 class=\"card-title\">Datos del repartidor</h5>\n            <p class=\"card-text\">\n                <form action = \"/repartidores/update/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(modelo.repartidor.getDni());
		jteOutput.writeContent("\" method=\"post\">\n                    <div class=\"form-group\">\n                        <label for=\"txtNombre\">Nombre:</label>\n                        <input type=\"hidden\" class=\"form-control\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.repartidor.getDni())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.repartidor.getDni());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" type=\"text\" name= \"txtDni\">\n                        <input id=\"txtNombre\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.repartidor.getNombre())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.repartidor.getNombre());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtNombre\">\n                    </div>\n\n                    <div class=\"form-group\">\n                        <label for=\"txtApellido\">Apellido:</label>\n                        <input id=\"txtApellido\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.repartidor.getApellido())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.repartidor.getApellido());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtApellido\">\n                    </div>\n                    \n                    <div class=\"form-group\">\n                        <label for=\"txtTelefono\">Telefono:</label>\n                        <input id=\"txtTelefono\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.repartidor.getTelefono())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.repartidor.getTelefono());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtTelefono\">\n                    </div>\n                    \n                    <div class=\"form-group\">\n                        <label for=\"txtCorreo\">Correo:</label>\n                        <input id=\"txtCorreo\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.repartidor.getCorreo())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.repartidor.getCorreo());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtCorreo\">\n                    </div>\n                    <br>\n                    <div class=\"form-group\">\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Modificar\">\n                        <a href=\"/repartidores\" class=\"btn btn-primary\">Regresar</a>\n                    </div>\n                </form>\n            </p>\n\n        </div>\n    </div>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidor modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidor)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
