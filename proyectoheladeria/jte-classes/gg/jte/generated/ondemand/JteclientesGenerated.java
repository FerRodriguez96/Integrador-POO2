package gg.jte.generated.ondemand;
public final class JteclientesGenerated {
	public static final String JTE_NAME = "clientes.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,24,24,26,26,26,27,27,27,28,28,28,29,29,29,30,30,30,31,31,31,32,32,32,34,34,41,41};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.paginas.ModeloClientes modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n    <h2> Clientes </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-hover table-striped\">\r\n            <thead>\r\n                <tr>\r\n                    <th scope=\"col\">DNI</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">Apellido</th>\r\n                    <th scope=\"col\">callle</th>\r\n                    <th scope=\"col\">numero</th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n                ");
		for (var cliente : modelo.clientes) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getDni());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getNombre());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getApellido());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getCalle());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(cliente.getNumero());
			jteOutput.writeContent("</td>\r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info\" href=\"clientes/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(cliente.getDni());
			jteOutput.writeContent("\"> Editar </a></td>                            \r\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(cliente.getDni());
			jteOutput.writeContent(")\"> Borrar </button></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    </div>\r\n\r\n    <script src=\"/js/clientes.js\"></script>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.paginas.ModeloClientes modelo = (com.paginas.ModeloClientes)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
