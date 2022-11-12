package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class VyramsClothingInnerPage {
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


    public static void clickPridetiIKrepseliButton() {
        Common.clickElement(
                Locators.Zelando.VyramsClothingInner.buttonPridetiIKrepseli
        );
    }

    public static void clickBagIconButton() {
        Common.clickElement(
                Locators.Zelando.VyramsClothingInner.butttonBagIcon
        );
    }

    public static String readValueOfItemInsideBagText() {
        return Common.getElementText(
                Locators.Zelando.VyramsClothingInner.valueOfItemInsideBagText
        );
    }

    public static void clickButtonPasalinti() {
        Common.clickElement(
                Locators.Zelando.VyramsClothingInner.buttonPasalintiFromBag
        );
    }

    public static String readValueOfAfterPasalintiText() {
        return Common.getElementText(
                Locators.Zelando.VyramsClothingInner.valueOfAfterPasalintiText
        );
    }
}
