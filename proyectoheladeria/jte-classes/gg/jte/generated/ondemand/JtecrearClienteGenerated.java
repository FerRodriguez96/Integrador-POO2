package gg.jte.generated.ondemand;
public final class JtecrearClienteGenerated {
	public static final String JTE_NAME = "crearCliente.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,45,45};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n\r\n    <br>\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Ingresar clientes\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del cliente</h5>\r\n            <p class=\"card-text\">\r\n\r\n                <div class=\"form-group\">\r\n                    <label for=\"txtNombre\">DNI:</label>\r\n                    <input id=\"txtNombre\" class=\"form-control\" type=\"text\" name=\"textNombre\">\r\n                </div>\r\n\r\n                <div class=\"form-group\">\r\n                    <label for=\"txtFoto\">Nombre:</label>\r\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\r\n                </div>\r\n\r\n                <div class=\"form-group\">\r\n                    <label for=\"txtFoto\">Apellido:</label>\r\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\r\n                </div>\r\n                \r\n                <div class=\"form-group\">\r\n                    <label for=\"txtFoto\">Calle:</label>\r\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\r\n                </div>\r\n                \r\n                <div class=\"form-group\">\r\n                    <label for=\"txtFoto\">Numero:</label>\r\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\r\n                </div>\r\n                <br>\r\n                <div class=\"form-group\">\r\n                    <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\r\n                    <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                </div>\r\n            </p>\r\n        </div>\r\n    </div>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
