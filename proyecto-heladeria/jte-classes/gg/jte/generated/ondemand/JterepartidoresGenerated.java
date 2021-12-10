package gg.jte.generated.ondemand;
public final class JterepartidoresGenerated {
	public static final String JTE_NAME = "repartidores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,1,1,16,16,18,18,18,19,19,19,20,20,20,21,21,21,22,22,22,23,23,23,24,24,24,26,26,31,31};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidores modelo) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n<h2> Repartidores </h2>\n    <a href=\"/index\" type=\"button\" class=\"btn btn-primary\"> Regresar </a>\n    <div class=\"table-responsive\">\n        <table class=\"table table-hover table-striped\">\n            <thead>\n                <tr>\n                    <th scope=\"col\">DNI</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th scope=\"col\">Apellido</th>\n                    <th scope=\"col\">Telefono</th>\n                    <th scope=\"col\">Correo</th>\n                </tr>\n            </thead>\n            <tbody>\n                ");
		for (var repartidor : modelo.repartidores) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getDni());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getNombre());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getApellido());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getTelefono());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(repartidor.getCorreo());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/repartidores/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(repartidor.getDni());
			jteOutput.writeContent("\"> Editar </a></td>                            \n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(repartidor.getDni());
			jteOutput.writeContent(")\"> Eliminar </button></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n        </table>\n    </div>\n<script src=\"js/repartidores.js\"></script>\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidores modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloRepartidores)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
