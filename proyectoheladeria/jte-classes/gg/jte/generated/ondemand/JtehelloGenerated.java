package gg.jte.generated.ondemand;
public final class JtehelloGenerated {
	public static final String JTE_NAME = "hello.jte";
	public static final int[] JTE_LINE_INFO = {1,1,1,1,1,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("Hello jte!\r\nThe current timestamp is ");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(System.currentTimeMillis());
		jteOutput.writeContent(".");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
