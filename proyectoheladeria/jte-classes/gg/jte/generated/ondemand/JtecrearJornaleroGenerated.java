package gg.jte.generated.ondemand;
public final class JtecrearJornaleroGenerated {
	public static final String JTE_NAME = "crearJornalero.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,44,44};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <br>\n    <div class=\"card\">\n        <div class=\"card-header\">\n            Ingresar jornaleros\n        </div>\n        <div class=\"card-body\">\n            <h5 class=\"card-title\">Datos del jornalero</h5>\n            <p class=\"card-text\">\n\n                <div class=\"form-group\">\n                    <label for=\"txtNombre\">DNI:</label>\n                    <input id=\"txtNombre\" class=\"form-control\" type=\"text\" name=\"textNombre\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtCorreo\">Nombre:</label>\n                    <input id=\"txtCorreo\" class=\"form-control\" type=\"text\" name=\"txtCorreo\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtFoto\">Apellido:</label>\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\n                </div>\n                \n                <div class=\"form-group\">\n                    <label for=\"txtFoto\">Telefono:</label>\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\n                </div>\n                \n                <div class=\"form-group\">\n                    <label for=\"txtFoto\">Correo:</label>\n                    <input id=\"txtFoto\" class=\"form-control\" type=\"text\" name=\"txtFoto\">\n                </div>\n                <br>\n                <div class=\"form-group\">\n                    <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\n                    <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\n                </div>\n            </p>\n        </div>\n    </div>\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
