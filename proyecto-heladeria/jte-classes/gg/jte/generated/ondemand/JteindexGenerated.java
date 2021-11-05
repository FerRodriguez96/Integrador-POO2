package gg.jte.generated.ondemand;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,33,33,34};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\t\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\n\t\t<div class=\"row justify-content-md-center\">\n\t\t    <div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/clientes/nuevo\" class=\"btn btn-success\">Crear Cliente</a>\n\t\t    </div>\n\t\t    <div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/tipoEmpleado\" class=\"btn btn-success\">Crear Empleado</a>\n\t\t    </div>\n\t\t</div>\n\t\t<br>\n\t\t<br>\n\t\t<br>\n\t\t<div class=\"row justify-content-md-center\">\n\t\t\t<div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/tipoEmpleado\" class=\"btn btn-success\">Crear Pedido</a>\n\t\t    </div>\n\t\t\t<div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/tipoProducto\" class=\"btn btn-success\">Crear Producto</a>\n\t\t    </div>\n\t  \t</div>\n\t\t  \n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
