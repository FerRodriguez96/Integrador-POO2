package gg.jte.generated.ondemand;
public final class JtecrearRepartidorGenerated {
	public static final String JTE_NAME = "crearRepartidor.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,42,42};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n    <br>\n    <div class=\"card\">\n        <div class=\"card-header\">\n            Ingresar repartidores\n        </div>\n        <div class=\"card-body\">\n            <h5 class=\"card-title\">Datos del repartidor</h5>\n            <p class=\"card-text\">\n\n                <div class=\"form-group\">\n                    <label for=\"txtDni\">DNI:</label>\n                    <input id=\"txtDni\" class=\"form-control\" type=\"text\" name=\"textDni\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtNombre\">Nombre:</label>\n                    <input id=\"txtNombre\" class=\"form-control\" type=\"text\" name=\"txtNombre\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtApellido\">Apellido:</label>\n                    <input id=\"txtApellido\" class=\"form-control\" type=\"text\" name=\"txtApellido\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtTelefono\">Telefono:</label>\n                    <input id=\"txtTelefono\" class=\"form-control\" type=\"text\" name=\"txtTelefono\">\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"txtCorreo\">Correo:</label>\n                    <input id=\"txtCorreo\" class=\"form-control\" type=\"text\" name=\"txtCorreo\">\n                </div>\n                <br>\n                <div class=\"form-group\">\n                    <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\n                    <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\n                </div>\n            </p>\n        </div>\n    </div>\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
