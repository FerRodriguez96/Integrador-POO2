package gg.jte.generated.ondemand;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {40,40,40,40,40,40,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!doctype html>\r\n<html lang=\"es\">\r\n    <head>\r\n        <meta charset=\"UTF-8\">\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n        <title>Heladeria</title>\r\n    </head>\r\n    <br>\r\n        <br>\r\n            <br>\r\n                <br>\r\n                    <br>\r\n                        <br>\r\n                            <br>\r\n                                <br>\r\n                                    <br>\r\n    <body>\r\n        <main role=\"main\" class=\"container my-auto\">\r\n            <div class=\"row\">\r\n                <div id=\"login\" class=\"col-lg-4 offset-lg-4 col-md-6 offset-md-3\r\n                    col-12\">\r\n                    <h5 class=\"text-center\">Bienvenido de nuevo</h5>\r\n                    <h2 class=\"text-center\">Ingrese en el sistema</h2>\r\n                    <form>\r\n                        <div class=\"form-group\">\r\n                            <label for=\"Nombre\">Nombre</label>\r\n                            <input id=\"Nombre\" name=\"Nombre\"\r\n                                class=\"form-control\" type=\"nombre\"\r\n                                placeholder=\"Nombre de usuario\">\r\n                        </div>\r\n                        <br>\r\n                            <div class=\"form-group\">\r\n                                <a href=\"/index\" class=\"btn btn-success\">Ingresar</a>\r\n                            </div>\r\n                        <br>\r\n                    </form>\r\n                </div>\r\n            </div>\r\n        </main>\r\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
