package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Zelando {

        public static By privacyAgreementPopup = By.xpath("//span[@id='uc-full-optin-description']");
        public static By geraiButton = By.xpath("//button[@id='uc-btn-accept-banner']");
    }
}
