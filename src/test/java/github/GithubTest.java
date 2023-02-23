package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        $$("ul.repo-list li a").first().click();
        sleep(5000);
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


    }

}
