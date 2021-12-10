package gg.jte.generated.ondemand;
public final class JtepedidosGenerated {
	public static final String JTE_NAME = "pedidos.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,21,21,23,23,23,24,24,24,25,25,25,26,26,26,27,27,27,29,29,31,31,32,32,32,33,33,35,46,46,46,47,47,47,49,49,53,53};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <h2> Pedidos </h2>\n    <a href=\"/index\" type=\"button\" class=\"btn btn-primary\"> Regresar </a>\n    \n    <div class=\"table-responsive\">\n        <table class=\"table table-light\">\n            <thead class=\"thead-light\">\n                <tr>\n                    <th scope=\"col\">ID</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th scope=\"col\">Apellido</th>\n                    <th scope=\"col\">Estado</th>\n                    <th scope=\"col\">Fecha</th>\n                    <th scope=\"col\">Repartidor</th>\n                </tr>\n            </thead>\n\n            <tbody>\n                ");
		for (var pedido : modelo.pedidos) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(pedido.getIdPedido());
			jteOutput.writeContent("</td>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(pedido.getCliente().getNombre());
			jteOutput.writeContent("</td>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(pedido.getCliente().getApellido());
			jteOutput.writeContent("</td>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(pedido.getEstado());
			jteOutput.writeContent("</td>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(pedido.getFecha().toString());
			jteOutput.writeContent("</td>\n                        \n                        ");
			if (pedido.getRepartidor() == null) {
				jteOutput.writeContent("\n                            <td scope=\"row\">NO</td>\n                        ");
			} else {
				jteOutput.writeContent("\n                            <td scope=\"row\">");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(pedido.getRepartidor().getNombre());
				jteOutput.writeContent("</td>\n                        ");
			}
			jteOutput.writeContent("\n                        \n                        ");
			jteOutput.writeContent("\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/pedidos/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(pedido.getIdPedido());
			jteOutput.writeContent("\"> Editar </a></td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/pedido/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(pedido.getIdPedido());
			jteOutput.writeContent("/repartidor\"> Asignar repartidor </a></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n        </table>\n    </div>\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPedidos)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
