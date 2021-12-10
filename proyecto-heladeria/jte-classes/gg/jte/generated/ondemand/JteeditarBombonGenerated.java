package gg.jte.generated.ondemand;
public final class JteeditarBombonGenerated {
	public static final String JTE_NAME = "editarBombon.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,11,11,11,16,16,16,16,16,16,16,17,32,32,32,32,32,32,32,37,37,37,37,37,37,37,51,51};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombon modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Modificar bombon\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del bombon</h5>\r\n            <p class=\"card-text\">\r\n                <form action = \"/bombones/update/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(modelo.bombon.getId());
		jteOutput.writeContent("\" method=\"post\">\r\n                    <div class=\"form-group\">\r\n                        \r\n                        <label for=\"txtSabor\">Sabor:</label>\r\n                        \r\n                        <input type=\"hidden\" class=\"form-control\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.bombon.getId())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.bombon.getId());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" type=\"integer\" name=\"txtId\">\r\n                        ");
		jteOutput.writeContent("\r\n                        <select name=\"txtSabor\">\r\n                            <option value=\"1\">Frutilla</option> \r\n                            <option value=\"2\">Vainilla</option> \r\n                            <option value=\"3\">Dulce_de_leche</option>\r\n                            <option value=\"4\">Chantilly</option> \r\n                            <option value=\"5\">Surtido</option> \r\n                        </select>\r\n                        \r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtPrecio\">Precio:</label>\r\n                        <input id=\"txtPrecio\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.bombon.getPrecio())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.bombon.getPrecio());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"float\" name=\"txtPrecio\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtCantidad\">Cantidad:</label>\r\n                        <input id=\"txtCantidad\"");
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(modelo.bombon.getCantidad())) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(modelo.bombon.getCantidad());
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"form-control\" type=\"integer\" name=\"txtCantidad\">\r\n                    </div>\r\n                    <br>\r\n                    <div class=\"form-group\">\r\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Modificar\">\r\n                        <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                    </div>\r\n                </form>\r\n            </p>\r\n\r\n        </div>\r\n    </div>\r\n\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombon modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombon)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
