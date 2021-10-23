package gg.jte.generated.ondemand.tag;
public final class JteheaderGenerated {
	public static final String JTE_NAME = "tag/header.jte";
	public static final int[] JTE_LINE_INFO = {28,28,28,28,28,28};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n    <title>Heladeria</title>\r\n</head>\r\n<body>\r\n    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n        <a class=\"navbar-brand\">Heladeria</a>\r\n        <button class=\"navbar-toggler\" data-target=\"#my-nav\" data-toggle=\"collapse\" aria-controls=\"my-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n            <span class=\"navbar-toggler-icon\"></span>\r\n        </button>\r\n        <div id=\"my-nav\" class=\"collapse navbar-collapse\">\r\n            <ul class=\"navbar-nav mr-auto\">\r\n                <li class=\"nav-item active\">\r\n                    <a class=\"nav-link\" href=\"{{url_for('index')}}\">Inicio<span class=\"sr-only\"></span></a>\r\n                </li>\r\n                <li>\r\n                    <a class=\"nav-link\" href=\"{{url_for('index')}}\">Clientes<span class=\"sr-only\"></span></a>\r\n                </li>\r\n                <li>\r\n                    <a class=\"nav-link\" href=\"{{url_for('index')}}\">Empleados<span class=\"sr-only\"></span></a>\r\n                </li>\r\n            </ul>\r\n        </div>\r\n    </nav>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
