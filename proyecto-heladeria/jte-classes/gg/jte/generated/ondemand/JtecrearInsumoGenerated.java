package gg.jte.generated.ondemand;
public final class JtecrearInsumoGenerated {
	public static final String JTE_NAME = "crearInsumo.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,39,39};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n\r\n    <br>\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Ingresar insumo\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del insumo</h5>\r\n            <p class=\"card-text\">\r\n                <form action = \"/insumos\" method=\"post\">\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtNombre\">Nombre:</label>\r\n                        <input id=\"txtNombre\" class=\"form-control\" type=\"text\" name=\"txtNombre\">\r\n                    </div>\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtDescripcion\">Descripcion:</label>\r\n                        <input id=\"txtDescripcion\" class=\"form-control\" type=\"text\" name=\"txtDescripcion\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtCantidad\">Cantidad:</label>\r\n                        <input id=\"txtCantidad\" class=\"form-control\" type=\"text\" name=\"txtCantidad\">\r\n                    </div>\r\n                    \r\n                    <br>\r\n                    <div class=\"form-group\">\r\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\r\n                        <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                    </div>\r\n                </form>\r\n            </p>\r\n\r\n        </div>\r\n    </div>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
