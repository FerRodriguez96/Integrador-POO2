package gg.jte.generated.ondemand.tag;
public final class JtefooterGenerated {
	public static final String JTE_NAME = "tag/footer.jte";
	public static final int[] JTE_LINE_INFO = {4,4,4,4,4,4,10};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("        \r\n        <script src=\"/Bootstrap/js/jquery-3.0.0.slim.min.js\"></script>\r\n        <script src=\"/Bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n        \r\n        ");
		jteOutput.writeContent("\r\n    </body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
