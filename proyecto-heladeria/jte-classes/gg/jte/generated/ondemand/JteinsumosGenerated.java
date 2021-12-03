package gg.jte.generated.ondemand;
public final class JteinsumosGenerated {
	public static final String JTE_NAME = "insumos.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,18,18,20,20,20,21,21,21,22,22,22,23,23,23,24,24,24,25,25,25,27,27,32,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos modelo) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n    <h2> Insumos </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-light\">\r\n            <thead class=\"thead-light\">\r\n                <tr>\r\n                    <th scope=\"col\">Id</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">Descripcion</th>\r\n                    <th scope=\"col\">Cantidad</th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n                ");
		for (var insumo : modelo.insumos) {
			jteOutput.writeContent("\r\n                    <tr>\r\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getNombre());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getDescripcion());
			jteOutput.writeContent("</td>\r\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getCantidad());
			jteOutput.writeContent("</td>\r\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/insumos/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent("\"> Editar </a></td>\r\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent(")\"> Eliminar </button></td>\r\n                    </tr>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    </div>\r\n<script src=\"js/insumos.js\"></script>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
