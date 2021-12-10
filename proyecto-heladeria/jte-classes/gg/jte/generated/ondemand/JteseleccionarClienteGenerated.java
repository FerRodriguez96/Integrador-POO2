package gg.jte.generated.ondemand;
public final class JteseleccionarClienteGenerated {
	public static final String JTE_NAME = "seleccionarCliente.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,1,1,17,17,19,19,19,20,20,20,21,21,21,22,22,22,23,23,23,24,24,24,25,25,25,27,27,31,31};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modelo) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n    <h2> Seleccionar Cliente </h2>\n    <a href=\"/index\" type=\"button\" class=\"btn btn-primary\"> Regresar </a>\n    <div class=\"table-responsive\">\n        <table class=\"table table-light\">\n            <thead class=\"thead-light\">\n                <tr>\n                    <th scope=\"col\">DNI</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th scope=\"col\">Apellido</th>\n                    <th scope=\"col\">Callle</th>\n                    <th scope=\"col\">Numero</th>\n                    <th scope=\"col\">Telefono</th>\n                </tr>\n            </thead>\n            <tbody>\n                ");
		for (var cliente : modelo.clientes) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getDni());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getNombre());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getApellido());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getCalle());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getNumero());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getTelefono());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/pedido/nuevo/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(cliente.getDni());
			jteOutput.writeContent("\"> Seleccionar </a></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent(" \n            </tbody>\n        </table>\n    </div>\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloClientes)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
