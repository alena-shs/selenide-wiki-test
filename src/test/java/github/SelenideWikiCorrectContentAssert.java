package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiCorrectContentAssert {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
    }
    @Test
    void findJUnit5InWiki() {
        open("/selenide/selenide");
        
        $("#wiki-tab").click();

        $("#wiki-pages-filter").setValue("SoftAssertions");
        $$("#wiki-pages-box a").findBy(visible).shouldHave(text("SoftAssertions"));

        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}
