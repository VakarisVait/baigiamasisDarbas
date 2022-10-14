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
                Locators.Zelando.Home.privacyAgreementPopup
        );
        Common.clickElement(
                Locators.Zelando.Home.geraiButton
        );
    }

    public static void clickPersonIcon() {
        Common.clickElement(
                Locators.Zelando.Home.personIconButton
        );
    }

    public static void clickPamirsoteSlaptazodiButton() {
        Common.clickElement(
                Locators.Zelando.Login.pamirsoteSlaptazodiButton
        );
    }

    public static void inputEmail(String email) {
        Common.sendKeysToElement(
                email,
                Locators.Zelando.Login.emailInputField
        );
    }

    public static void clickGautiNuorodaButton() {
        Common.clickElement(
                Locators.Zelando.Login.gautiNuorodaButton
        );
    }

    public static String readValueOfText() {
        return Common.getElementText(
                Locators.Zelando.Login.writtenTextForPasswordChange
        );
    }

}
