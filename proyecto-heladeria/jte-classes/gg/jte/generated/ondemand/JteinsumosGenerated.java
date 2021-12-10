package gg.jte.generated.ondemand;
public final class JteinsumosGenerated {
	public static final String JTE_NAME = "insumos.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,18,18,20,20,20,21,21,21,22,22,22,23,23,23,24,24,24,25,25,25,27,27,32,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <h2> Insumos </h2>\n    <a href=\"/index\" type=\"button\" class=\"btn btn-primary\"> Regresar </a>\n    <div class=\"table-responsive\">\n        <table class=\"table table-light\">\n            <thead class=\"thead-light\">\n                <tr>\n                    <th scope=\"col\">Id</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th scope=\"col\">Descripcion</th>\n                    <th scope=\"col\">Cantidad</th>\n                </tr>\n            </thead>\n\n            <tbody>\n                ");
		for (var insumo : modelo.insumos) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getNombre());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getDescripcion());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(insumo.getCantidad());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-warning\" href=\"/insumos/update/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent("\"> Editar </a></td>\n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(insumo.getIdInsumo());
			jteOutput.writeContent(")\"> Eliminar </button></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n        </table>\n    </div>\n<script src=\"js/insumos.js\"></script>\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos modelo = (com.grupo3.heladeria.proyectoheladeria.paginas.ModeloInsumos)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
