package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class VyramsClothingInnerPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementToAppear(
                Locators.Zelando.HomeMoterims.privacyAgreementPopup
        );
        Common.clickElement(
                Locators.Zelando.HomeMoterims.geraiButton
        );
    }

    public static void clickPridetiIKrepseliButton() {
        Common.clickElement(
                Locators.Zelando.VyramsClothingInner.pridetiIKrepseliButton
        );
    }

    public static void clickBagIconButton() {
        Common.clickElement(
                Locators.Zelando.VyramsClothingInner.bagIconButton
        );
    }

    public static String readValueOfItemInsideBagText() {
        return Common.getElementText(
                Locators.Zelando.VyramsClothingInner.valueOfItemInsideBagText
        );
    }
}
