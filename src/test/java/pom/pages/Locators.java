package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Zelando {

        public static class HomeMoterims {

            public static By privacyAgreementPopup = By.xpath("//span[@id='uc-full-optin-description']");

            public static By geraiButton = By.xpath("//button[@id='uc-btn-accept-banner']");

            public static By personIconButton = By.xpath(
                    "//div[@class='z-navicat-header_navToolItem z-navicat-header_navToolItem-profile']");

            public static By pamirsoteSlaptazodiButton = By.xpath("//span[text()=" +
                    "'Pamiršote slaptažodį?']");

            public static By emailInputField = By.xpath("//input[@id='forgotpassword.email']");

            public static By gautiNuorodaButton = By.xpath("//button[@class='DJxzzA u9KIT8 uEg2FS" +
                    " U_OhzR ZkIJC- Vn-7c- FCIprz heWLCX JIgPn9 LyRfpJ pxpHHp Md_Vex NN8L-8 GTG2H9 MfX1a0 WCjo-q" +
                    " EKabf7 aX2-iv r9BRio mo6ZnF E6Km4r']");

            public static By writtenTextForPasswordChange = By.xpath("//div[@class='yqrcoC JCuRr_']");

        }

        public static class HomeVyrams {

            public static By avalyneButton = By.xpath("(//span[text()='Avalynė'])[1]");

            public static By avalynesAksesuaraiButton = By.xpath("(//span[text()=" +
                    "'Avalynės aksesuarai'])[2]");

            public static By padaiIrVidpadiniaiIdeklaiButton = By.xpath("(//span[text()='Padai ir" +
                    " vidpadiniai įdėklai'])[2]");

            public static By valueOfFilteredText = By.xpath("//span[@class='_0Qm8W1 CbogcV" +
                    " FxZV-M pVrzNP UTtITa']");

            public static By emailInputInSubscriptionInput = By.xpath("//input[@class='cDRR43 WOeOAB" +
                    " _0Qm8W1 _7Cm1F9 FxZV-M bsVOrE mo6ZnF dUMFv9 K82if3 LyRfpJ pVrzNP NN8L-8 QGmTh2 Vn-7c-']");

            public static By vyruMadaCheckButton = By.xpath("(//label[@class='Vm2aBa _0Qm8W1 _7Cm1F9" +
                    " FxZV-M JT3_zV _5Yd-hZ pVrzNP RKlRH1'])[2]");

            public static By uzregistruokiteManeButton = By.xpath("//button[@class='DJxzzA u9KIT8" +
                    " uEg2FS U_OhzR ZkIJC- Vn-7c- FCIprz heWLCX JIgPn9 LyRfpJ pxpHHp Md_Vex NN8L-8 GTG2H9 MfX1a0" +
                    " WCjo-q EKabf7 aX2-iv r9BRio  E6Km4r']");

            public static By valueOfAfterSubscriptionText = By.xpath("//h4[text()='Beveik baigta!']");
        }

        public static class HomeVaikams {

            public static By clothingPictureClick = By.xpath("(//div[@class='KVKCn3 u-C3dd" +
                    " jDGwVr mo6ZnF KLaowZ'])[1]");

            public static By differentColorOptionPicture = By.xpath("(//div[@class='JT3_zV mo6ZnF'])[4]");

            public static By valueOfColorText = By.xpath("//p[@class='_0Qm8W1 u-6V88 dgII7d pVrzNP zN9KaA']");
        }

        public static class VyramsClothingInner {

            public static By pridetiIKrepseliButton = By.xpath("");

            public static By bagIconButton = By.xpath("");

            public static By valueOfItemInsideBagText = By.xpath("");
        }
    }
}
