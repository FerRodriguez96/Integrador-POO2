package gg.jte.generated.ondemand;
public final class JteseleccionarRepartidorGenerated {
	public static final String JTE_NAME = "seleccionarRepartidor.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,1,1,15,15,17,17,17,18,18,18,19,19,19,20,20,20,21,21,21,21,21,21,23,23,27,27};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    <h2> Seleccionar Repartidor </h2>\r\n    <a href=\"/pedidos\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-light\">\r\n            <thead class=\"thead-light\">\r\n                <tr>\r\n                    <th scope=\"col\">DNI</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">Apellido</th>\r\n                    <th scope=\"col\">Telefono</th>\r\n                </tr>\r\n            </thead>\r\n            <tbody>\r\n                ");
		for (var repartidor : modelo.repartidores) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getDni());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getNombre());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getApellido());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getTelefono());
			jteOutput.writeContent("</td>\r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-success\" href=\"/pedido/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(modelo.pedido.getIdPedido());
			jteOutput.writeContent("/repartidor/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(repartidor.getDni());
			jteOutput.writeContent("\"> Seleccionar </a></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent(" \r\n            </tbody>\r\n        </table>\r\n    </div>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedido)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
