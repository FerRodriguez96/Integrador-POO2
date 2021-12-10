package gg.jte.generated.ondemand;
public final class JteempleadosGenerated {
	public static final String JTE_NAME = "empleados.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,26,26,27};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\t\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\t<br>\n\n        <br>\n\t\t<div class=\"row justify-content-md-center\">\n\t\t    <div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/jornaleros\" class=\"btn btn-success\">Jornaleros</a>\n\t\t    </div>\n\t\t    <div class=\"col-md-2 col-xs-6\">\n\t\t      <a href=\"/repartidores\" class=\"btn btn-success\">Repartidores</a>\n\t\t    </div>\n\t  \t</div>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
