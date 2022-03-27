package mvideo;

import com.codeborne.selenide.*;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;


public class FilterCheckboxList {


    //выбирает все блоки на странице слева. для выбора определенного блока вместо '%' - подставить номер нужного
    private final String XPATH_CONTAINER = "//div/main//mvid-accordion['%']";
    private final String XPATH_SLIDER = "//div/div['%']/mvid-switcher";

    //любой блок
    @FindBy(xpath = XPATH_CONTAINER)
    private SelenideElement anyContainer;

    //заголовок блока
    @FindBy(xpath = XPATH_CONTAINER + "//label[contains(@class, 'accordion__title')]")
    private SelenideElement titleAnyContainer;

    //выбирает field в блоке, если он есть, не работает с ценой
    @FindBy(xpath = XPATH_CONTAINER + "//input[contains(@class, 'input__field')]")
    private SelenideElement searchField;

    //элементы фильтра в блоке
    @FindBy(xpath = XPATH_CONTAINER + "//div[contains(@class, 'checkbox-wrap')]" + "//a")
    private SelenideElement checkboxFilterElement;

    @FindBy(xpath = XPATH_SLIDER)
    private SelenideElement slider;

    private final String XPATH_BUTTON = "mvid-button[contains(@class, 'button--list')]/button";
    @FindBy(xpath = XPATH_BUTTON)
    private SelenideElement buttonSwitchLeft;


    //ищем по филду
    public void setFilter(String str) {
        searchField.setValue(str);
        checkboxFilterElement.shouldHave(text(str)).click();
    }


    //чек
    public void switchButton() {
        slider.click();
    }

    //переключает вид
    public void getSwitchButton() {
        if (buttonSwitchLeft.exists()) {
            buttonSwitchLeft.click();
        }
    }



}


















