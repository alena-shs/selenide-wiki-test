package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubEnterprisePageContentTest {
    @Test
    void shouldFindCorrectPageHeader() {
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div.application-main").shouldHave(text("Build like the best"));
    }
}