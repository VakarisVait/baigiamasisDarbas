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
                Locators.Zelando.HomeMoterims.privacyAgreementPopup
        );
        Common.clickElement(
                Locators.Zelando.HomeMoterims.geraiButton
        );
    }

    public static void clickAvalyneButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.avalyneButton
        );
    }

    public static void clickAvalynesAksesuaraiButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.avalynesAksesuaraiButton
        );
    }

    public static void clickPadaiIrVidpadiniaiIdeklaiButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.padaiIrVidpadiniaiIdeklaiButton
        );
    }

    public static String readValueOfText() {
        return Common.getElementText(
                Locators.Zelando.HomeVyrams.readValueOfFilteredText
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
                Locators.Zelando.HomeVyrams.vyruMadaCheckButton
        );
    }

    public static void clickUzregistruokiteManeButton() {
        Common.clickElement(
                Locators.Zelando.HomeVyrams.uzregistruokiteManeButton
        );
    }

    public static String readValueOfSubscibtionText() {
        return Common.getElementText(
                Locators.Zelando.HomeVyrams.readValueOfAfterSubscriptionText
        );
    }

}
