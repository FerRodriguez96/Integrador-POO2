package gg.jte.generated.ondemand;
public final class JtecrearPicoleGenerated {
	public static final String JTE_NAME = "crearPicole.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,37,37};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n\r\n    <br>\r\n    <div class=\"card\">\r\n        <div class=\"card-header\">\r\n            Ingresar picoles\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <h5 class=\"card-title\">Datos del picole</h5>\r\n            <p class=\"card-text\">\r\n                <form action = \"/picoles\" method=\"post\">\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtSabor\">Sabor:</label>\r\n                        <input id=\"txtSabor\" class=\"form-control\" type=\"sabores\" name=\"txtSabor\">\r\n                    </div>\r\n\r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtPrecio\">Precio:</label>\r\n                        <input id=\"txtPrecio\" class=\"form-control\" type=\"float\" name=\"txtPrecio\">\r\n                    </div>\r\n                    \r\n                    <div class=\"form-group\">\r\n                        <label for=\"txtCantidad\">Cantidad:</label>\r\n                        <input id=\"txtCantidad\" class=\"form-control\" type=\"integer\" name=\"txtCantidad\">\r\n                    </div>\r\n                    <br>\r\n                    <div class=\"form-group\">\r\n                        <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\">\r\n                        <a href=\"/\" class=\"btn btn-primary\">Regresar</a>\r\n                    </div>\r\n                </form>\r\n            </p>\r\n\r\n        </div>\r\n    </div>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
