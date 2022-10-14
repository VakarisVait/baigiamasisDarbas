package pom.tests.zelando;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.zelando.HomeVyramsPage;
import pom.pages.zelando.VyramsClothingInnerPage;
import pom.tests.TestBase;
import pom.utils.TestListener;

@Listeners(TestListener.class)
public class VyramsClothingInnerTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        VyramsClothingInnerPage.open("https://www.zalando.lt/versace-jeans-couture-unisex-" +
                "kepuraite-blackgold-vei54q010-q11.html");
        VyramsClothingInnerPage.acceptPrivacyConfirmation();
    }

    @Test
    public void addItemToBag() {
        String expectedText = "Versace Jeans Couture";
        String actualText = "";

        VyramsClothingInnerPage.clickPridetiIKrepseliButton();
        VyramsClothingInnerPage.clickBagIconButton();
        HomeVyramsPage.sleep(2000);
        actualText = VyramsClothingInnerPage.readValueOfItemInsideBagText();

        Assert.assertTrue(actualText.contains(expectedText));

        HomeVyramsPage.sleep(3000);
    }

    @Test
    public void removeFromBag() {
        String expectedText = "Eikite. Eikite ir užpildykite jį visomis savo mados viltimis ir svajonėmis.";
        String actualText = "";

        VyramsClothingInnerPage.clickPridetiIKrepseliButton();
        VyramsClothingInnerPage.clickBagIconButton();

        VyramsClothingInnerPage.clickButtonPasalinti();
        HomeVyramsPage.sleep(3000);
        actualText = VyramsClothingInnerPage.readValueOfAfterPasalintiText();

        Assert.assertEquals(actualText, expectedText);

        HomeVyramsPage.sleep(3000);
    }
}
