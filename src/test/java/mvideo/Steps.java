package mvideo;

import com.codeborne.selenide.Selenide;
import mvideo.ListingPage;

public class Steps {

    private ListingPage listingPage;

    public Steps() {
        ListingPage listingPage = Selenide.page(new ListingPage());
       }


 }

