package gg.jte.generated.ondemand;
public final class JterepartidoresGenerated {
	public static final String JTE_NAME = "repartidores.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,2,2,2,30,30};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n\r\n    <h2> Repartidores </h2>\r\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\r\n    <div class=\"table-responsive\">\r\n        <table class=\"table table-hover table-striped\">\r\n            <thead>\r\n                <tr>\r\n                    <th scope=\"col\">DNI</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">Apellido</th>\r\n                    <th scope=\"col\">Telefono</th>\r\n                    <th scope=\"col\">Correo</th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                    <th class=\"col-1\" scope=\"col\"> </th>\r\n                </tr>\r\n            </thead>\r\n\r\n            <tbody>\r\n\r\n            </tbody>\r\n\r\n        </table>\r\n    </div>\r\n\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
