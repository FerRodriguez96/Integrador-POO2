package gg.jte.generated.ondemand;
public final class JtecrearProveedorGenerated {
	public static final String JTE_NAME = "crearProveedor.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,44,44};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n\r\n    <br>\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Ingresar nuevo proveedor\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del proveedor</h5>\r\n            <p class=\"card-text\">\r\n                <form action = \"/proveedores\" method=\"post\">\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtNombre\">Nombre:</label>\r\n                        <input id=\"txtNombre\" class=\"form-control\" type=\"text\" name=\"txtNombre\">\r\n                    </div>\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtApellido\">Apellido:</label>\r\n                        <input id=\"txtApellido\" class=\"form-control\" type=\"text\" name=\"txtApellido\">\r\n                    </div>\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtEmpresa\">Empresa:</label>\r\n                        <input id=\"txtEmpresa\" class=\"form-control\" type=\"text\" name=\"txtEmpresa\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtTelefono\">Telefono:</label>\r\n                        <input id=\"txtTelefono\" class=\"form-control\" type=\"text\" name=\"txtTelefono\">\r\n                    </div>\r\n                    \r\n                    <br>\r\n                    <div class=\"form-group\">\r\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\r\n                        <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                    </div>\r\n                </form>\r\n            </p>\r\n\r\n        </div>\r\n    </div>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
