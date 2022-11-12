package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class HomeMoterimsPage {
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


    public static void clickPersonIcon() {
        Common.clickElement(
                Locators.Zelando.HomeMoterims.buttonPersonIcon
        );
    }

    public static void clickPamirsoteSlaptazodiButton() {
        Common.clickElement(
                Locators.Zelando.HomeMoterims.buttonPamirsoteSlaptazodi
        );
    }

    public static void inputEmail(String email) {
        Common.sendKeysToElement(
                email,
                Locators.Zelando.HomeMoterims.emailInputField
        );
    }

    public static void clickGautiNuorodaButton() {
        Common.clickElement(
                Locators.Zelando.HomeMoterims.buttonGautiNuoroda
        );
    }

    public static String readValueOfText() {
        return Common.getElementText(
                Locators.Zelando.HomeMoterims.writtenTextForPasswordChange
        );
    }
}
