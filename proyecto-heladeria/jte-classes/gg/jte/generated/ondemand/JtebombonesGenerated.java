package gg.jte.generated.ondemand;
public final class JtebombonesGenerated {
	public static final String JTE_NAME = "bombones.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,18,18,20,20,20,21,21,21,22,22,22,23,28,28,28,30,30,35,35};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombones modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n<h2> Bombon </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-hover table-striped\">\r\n            <thead>\r\n                <tr>\r\n                    \r\n                    <th scope=\"col\">Sabor</th>\r\n                    <th scope=\"col\">Precio</th>\r\n                    <th scope=\"col\">Cantidad</th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n                ");
		for (var bombon : modelo.bombones) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(bombon.getSabor());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(bombon.getPrecio());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(bombon.getCantidad());
			jteOutput.writeContent("</td>\r\n                        ");
			jteOutput.writeContent("\r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info\"> Editar </a></td>\r\n\r\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(bombon.getId());
			jteOutput.writeContent(")\"> Eliminar </button></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    </div>\r\n    <script src=\"js/bombones.js\"> </script>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombones modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloBombones)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
