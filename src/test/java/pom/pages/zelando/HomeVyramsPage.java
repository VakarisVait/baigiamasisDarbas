package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class HomeVyramsPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

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


    public static void clickAvalyneButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.buttonAvalyne
        );
    }

    public static void clickAvalynesAksesuaraiButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.buttonAvalynesAksesuarai
        );
    }

    public static void clickPadaiIrVidpadiniaiIdeklaiButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.buttonPadaiIrVidpadiniaiIdeklai
        );
    }

    public static String readValueOfText() {
        return Common.getElementText(
                Locators.Zelando.HomeVyrams.valueOfFilteredText
        );
    }

    public static void inputEmailAddress(String email) {
        Common.sendKeysToElement(
                email,
                Locators.Zelando.HomeVyrams.emailInputInSubscriptionInput
        );
    }

    public static void clickVyruMadaButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.buttonVyruMadaCheck
        );
    }

    public static void clickUzregistruokiteManeButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.buttonUzregistruokiteMane
        );
    }

    public static String readValueOfSubscibtionText() {
        return Common.getElementText(
                Locators.Zelando.HomeVyrams.valueOfAfterSubscriptionText
        );
    }
}
