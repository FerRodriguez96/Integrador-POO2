package gg.jte.generated.ondemand;
public final class JteeditarJornaleroGenerated {
	public static final String JTE_NAME = "editarJornalero.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,11,11,11,14,14,14,14,14,14,14,15,15,15,15,15,15,15,20,20,20,20,20,20,20,25,25,25,25,25,25,25,30,30,30,30,30,30,30,44,44};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornalero modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Modificar jornalero\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del jornalero</h5>\r\n            <p class=\"card-text\">\r\n                <form action = \"/jornaleros/update/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(modelo.jornalero.getDni());
		jteOutput.writeContent("\" method=\"post\">\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtNombre\">Nombre:</label>\r\n                        <input type=\"hidden\" class=\"form-control\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.jornalero.getDni())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.jornalero.getDni());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" type=\"text\" name= \"txtDni\">\r\n                        <input id=\"txtNombre\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.jornalero.getNombre())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.jornalero.getNombre());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtNombre\">\r\n                    </div>\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtApellido\">Apellido:</label>\r\n                        <input id=\"txtApellido\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.jornalero.getApellido())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.jornalero.getApellido());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtApellido\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtTelefono\">Telefono:</label>\r\n                        <input id=\"txtTelefono\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.jornalero.getTelefono())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.jornalero.getTelefono());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtTelefono\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtCorreo\">Correo:</label>\r\n                        <input id=\"txtCorreo\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.jornalero.getCorreo())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.jornalero.getCorreo());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"text\" name=\"txtCorreo\">\r\n                    </div>\r\n                    <br>\r\n                    <div class=\"form-group\">\r\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Modificar\">\r\n                        <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                    </div>\r\n                </form>\r\n            </p>\r\n\r\n        </div>\r\n    </div>\r\n\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornalero modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornalero)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
