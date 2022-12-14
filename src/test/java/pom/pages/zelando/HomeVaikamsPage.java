package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class HomeVaikamsPage {
    public static void open(String url) {Common.openUrl(url);}

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementToAppear(
                Locators.Zelando.HomeMoterims.popupPrivacyAgreement
        );
        Common.clickElement(
                Locators.Zelando.HomeMoterims.buttonGerai
        );
    }


    public static void clickClothingPicture() {
        Common.clickElement(
                Locators.Zelando.HomeVaikams.clothingPicture
        );
    }

    public static void clickDifferentColorOptionPicture() {
        Common.clickElement(
                Locators.Zelando.HomeVaikams.differentColorOptionPicture
        );
    }

    public static String readValueOfColorText() {
        return Common.getElementText(
                Locators.Zelando.HomeVaikams.valueOfColorText
        );
    }
}
