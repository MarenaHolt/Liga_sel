package mvideo;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;



public class Tests {

    /**
     * * это класс со степами
     */
   //   private Steps steps = new Steps();

        @Test
        public void test() {
            open("https://www.mvideo.ru/holodilniki-i-morozilniki-2687/holodilniki-i-morozilnye-kamery-159");
   //     Selenide.open("https://www.mvideo.ru/stiralnye-i-sushilnye-mashiny-2427/stiralnye-mashiny-89");
            FilterCheckboxList one = Selenide.page(new FilterCheckboxList());
            one.switchButton();
        }

    }



