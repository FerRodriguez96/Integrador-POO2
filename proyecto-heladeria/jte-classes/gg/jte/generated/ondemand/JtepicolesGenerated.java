package gg.jte.generated.ondemand;
public final class JtepicolesGenerated {
	public static final String JTE_NAME = "picoles.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,17,17,20,20,20,21,21,21,22,22,22,24,24,24,25,25,25,27,27,32,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n<h2> Picole </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-hover table-striped\">\r\n            <thead>\r\n                <tr>\r\n                    <th scope=\"col\">Sabor</th>\r\n                    <th scope=\"col\">Precio</th>\r\n                    <th scope=\"col\">Cantidad</th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n                ");
		for (var picole : modelo.picoles) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                    \r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(picole.getSabor());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(picole.getPrecio());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(picole.getCantidad());
			jteOutput.writeContent("</td>\r\n                        \r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info\" href=\"/picoles/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(picole.getSabor());
			jteOutput.writeContent("\"> Editar </a></td>                            \r\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(picole.getSabor());
			jteOutput.writeContent(")\"> Eliminar </button></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    </div>\r\n    <script src=\"js/picoles.js\"> </script>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloPicoles)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
