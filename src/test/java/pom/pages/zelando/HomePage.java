package pom.pages.zelando;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementToAppear(
                Locators.Zelando.privacyAgreementPopup
        );
        Common.clickElement();
    }
}
