import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @Test
    public void userCanLoginByUsername() {
        open("https://google.com");
        $(By.xpath("//*[@title=\"Поиск\"]")).setValue("johny");
        $(By.xpath("//*[@value=\"Поиск в Google\"]")).click();
        $(By.xpath("//*[@id=\"result-stats\"]")).shouldHave(text("Результатов: примерно"));
    }
}
