package mvideo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$$x;

public class Pagination {

    @FindBy (xpath = "//ul[contains(@class, 'pagination')]")
    private SelenideElement allLinePagination;

    private static ElementsCollection anyPagePagination = $$x("//li[contains(@class, 'page-item')]");


}
