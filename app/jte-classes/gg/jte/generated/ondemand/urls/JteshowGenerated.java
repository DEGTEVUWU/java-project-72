package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.UrlPage;
import hexlet.code.utils.NamedRoutes;
public final class JteshowGenerated {
	public static final String JTE_NAME = "urls/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,5,5,10,10,12,13,14,15,16,17,18,18,18,25,25,25,33,33,33,41,41,42,42,42,43,43,50,50,50,50,50,50,50,50,54,54,78,78,82,82,82,85,85,85,88,88,88,91,91,91,94,94,94,97,97,97,101,101,103,103,105,105,105,105,108,108,108,112,112,112};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <main>\r\n");
				jteOutput.writeContent("\r\n");
				jteOutput.writeContent("\r\n");
				jteOutput.writeContent("\r\n");
				jteOutput.writeContent("\r\n");
				jteOutput.writeContent("\r\n");
				jteOutput.writeContent("\r\n        <h1>Сайт: ");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getUrl().getName());
				jteOutput.writeContent("</h1>\r\n        <table class=\"table table-bordered table-hover mt-3\">\r\n            <tr>\r\n                <td>\r\n                    ID\r\n                </td>\r\n                <td>\r\n                    ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUrl().getId());
				jteOutput.writeContent("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>\r\n                    Имя\r\n                </td>\r\n                <td>\r\n                    ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUrl().getName());
				jteOutput.writeContent("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>\r\n                    Дата создания\r\n                </td>\r\n                <td>\r\n                    ");
				if (page.getUrl().getCreatedAt() != null) {
					jteOutput.writeContent("\r\n                    ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(String.valueOf(page.getUrl().getCreatedAt()));
					jteOutput.writeContent("\r\n                        ");
				}
				jteOutput.writeContent("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n<br>\r\n        <h2>Проверки</h2>\r\n\r\n        <form");
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(NamedRoutes.urlPath(page.getUrl().getId()))) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(NamedRoutes.urlPath(page.getUrl().getId()));
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n            <button type=\"submit\" class=\"btn btn-primary\">Проверить</button>\r\n        </form>\r\n\r\n        ");
				if (page.getUrlChecks() != null) {
					jteOutput.writeContent("\r\n        <table class=\"table table-bordered table-hover mt-3\">\r\n            <thead>\r\n            <tr>\r\n                <td>\r\n                    ID\r\n                </td>\r\n                <td>\r\n                    Код ответа\r\n                </td>\r\n                <td>\r\n                    Title\r\n                </td>\r\n                <td>\r\n                    H1\r\n                </td>\r\n                <td>\r\n                    Description\r\n                </td>\r\n                <td>\r\n                    Дата проверки\r\n                </td>\r\n            </tr>\r\n            </thead>\r\n            ");
					for (var singlePage : page.getUrlChecks()) {
						jteOutput.writeContent("\r\n            <tbody>\r\n            <tr>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getUrlId());
						jteOutput.writeContent("\r\n                </td>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getStatusCode());
						jteOutput.writeContent("\r\n                </td>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getTitle());
						jteOutput.writeContent("\r\n                </td>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getH1());
						jteOutput.writeContent("\r\n                </td>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(singlePage.getDescription());
						jteOutput.writeContent("\r\n                </td>\r\n                <td>\r\n                    ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(String.valueOf(singlePage.getCreatedAt()));
						jteOutput.writeContent("\r\n                </td>\r\n            </tr>\r\n            </tbody>\r\n                ");
					}
					jteOutput.writeContent("\r\n        </table>\r\n        ");
				}
				jteOutput.writeContent("\r\n    </main>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"footer\">\r\n        <a>Спасибо, что посетили мой сайт! Особенно эту страницу с полной информацией про сайт №\r\n            ");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(page.getUrl().getId());
				jteOutput.writeContent(" Жду снова!</a>\r\n        <br>\r\n        <a href=\"https://github.com/DEGTEVUWU\">Дёгтев Иван - профиль на GitHub</a>\r\n    </div>\r\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlPage page = (UrlPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}