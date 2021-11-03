package gg.jte.generated.ondemand;
public final class JteeditarClienteGenerated {
	public static final String JTE_NAME = "editarCliente.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,14,14};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.paginas.ModeloCliente modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n<h2> Datos del cliente </h2>\r\n\r\n<p> DNI ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.cliente.getDni());
		jteOutput.writeContent("</p>\r\n<p> Nombre ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.cliente.getNombre());
		jteOutput.writeContent("</p>\r\n<p> Apellido ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.cliente.getApellido());
		jteOutput.writeContent("</p>\r\n<p> Calle ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.cliente.getCalle());
		jteOutput.writeContent("</p>\r\n<p> Numero ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.cliente.getNumero());
		jteOutput.writeContent("</p>\r\n\r\n<a href=\"/clientes\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.paginas.ModeloCliente modelo = (com.paginas.ModeloCliente)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
