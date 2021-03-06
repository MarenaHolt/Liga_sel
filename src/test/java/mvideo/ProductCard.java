package mvideo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ProductCard {

        SelenideElement titleLineContainer;
        private SelenideElement priceLabel;
        private SelenideElement addToCartButton;
        private SelenideElement addToFavoritesButton;
        private SelenideElement addToComparisonButton;

        private final String XPATH_TITLE_LINE_CONTAINER = "//div[contains(@class, 'product-card__title-line-container')]";
        private final String XPATH_NESTED_NAME_LINK = "[mvid-plp-product-title[.//a[text() = ' %s ']]]";

        private ProductCard(String productName) {
            String titleContainerPath = String.format(XPATH_TITLE_LINE_CONTAINER + XPATH_NESTED_NAME_LINK, productName);
            titleLineContainer = Selenide.$x(titleContainerPath);
            priceLabel = Selenide.$x(titleContainerPath +
                    "/following-sibling::div[contains(@class, 'product-card__price-block-container')]" +
                    "//span[@class = 'price__main-value']");
            String followingSiblingProductCheckoutButtonsContainer = "/following-sibling::mvid-plp-product-checkout";
            addToCartButton = Selenide.$x(titleContainerPath +
                    followingSiblingProductCheckoutButtonsContainer + "//button[span[text() = 'В корзину']]");
            addToFavoritesButton = Selenide.$x(titleContainerPath +
                    followingSiblingProductCheckoutButtonsContainer + "//div[contains(@class, 'wishlist-button-block')]//button");
            addToComparisonButton = Selenide.$x(titleContainerPath +
                    followingSiblingProductCheckoutButtonsContainer + "//div[contains(@class, 'compare-button-block')]//button");
        }

        static ProductCard getProductCard(String productName) {
            return new ProductCard(productName);
        }

        public SelenideElement getProductTitle() {
        return titleLineContainer;
        }


}


