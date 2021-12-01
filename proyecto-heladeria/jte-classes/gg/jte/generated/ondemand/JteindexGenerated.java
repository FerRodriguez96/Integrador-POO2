package gg.jte.generated.ondemand;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,38,38,39};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\t\r\n\t<br>\r\n\t<br>\r\n\t<br>\r\n\t<br>\r\n\t<br>\r\n\t\t<div class=\"row justify-content-md-center\">\r\n\t\t    <div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/clientes/nuevo\" class=\"btn btn-success\">Crear Cliente</a>\r\n\t\t    </div>\r\n\t\t    <div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/tipoEmpleado\" class=\"btn btn-success\">Crear Empleado</a>\r\n\t\t    </div>\r\n\t\t</div>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<div class=\"row justify-content-md-center\">\r\n\t\t\t<div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/\" class=\"btn btn-success\">Crear Pedido</a>\r\n\t\t    </div>\r\n\t\t\t<div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/tipoProducto\" class=\"btn btn-success\">Crear Producto</a>\r\n\t\t    </div>\r\n\t  \t</div>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<div class=\"row justify-content-md-center\">\r\n\t\t\t<div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/proveedor/nuevo\" class=\"btn btn-success\">Crear Proveedor</a>\r\n\t\t    </div>\r\n\t\t\t<div class=\"col-md-2 col-xs-6\">\r\n\t\t      <a href=\"/insumo/nuevo\" class=\"btn btn-success\">Crear Insumo</a>\r\n\t\t    </div>\r\n\t  \t</div>\r\n\t\t  \r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
