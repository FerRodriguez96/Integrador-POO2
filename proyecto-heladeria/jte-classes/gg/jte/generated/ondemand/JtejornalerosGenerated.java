package gg.jte.generated.ondemand;
public final class JtejornalerosGenerated {
	public static final String JTE_NAME = "jornaleros.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,19,19,21,21,21,22,22,22,23,23,23,24,24,24,25,25,25,26,26,26,27,27,27,29,29,34,34};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornaleros modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n<h2> Jornaleros </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-hover table-striped\">\r\n            <thead>\r\n                <tr>\r\n                    <th scope=\"col\">DNI</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">Apellido</th>\r\n                    <th scope=\"col\">Telefono</th>\r\n                    <th scope=\"col\">Correo</th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n                ");
		for (var jornalero : modelo.jornaleros) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(jornalero.getDni());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(jornalero.getNombre());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(jornalero.getApellido());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(jornalero.getTelefono());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(jornalero.getCorreo());
			jteOutput.writeContent("</td>\r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info\" href=\"/jornaleros/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(jornalero.getDni());
			jteOutput.writeContent("\"> Editar </a></td>                            \r\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(jornalero.getDni());
			jteOutput.writeContent(")\"> Eliminar </button></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    </div>\r\n<script src=\"js/jornaleros.js\"></script>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornaleros modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloJornaleros)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
