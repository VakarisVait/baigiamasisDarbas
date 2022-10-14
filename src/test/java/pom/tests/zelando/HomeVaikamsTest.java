package pom.tests.zelando;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.zelando.HomeVaikamsPage;
import pom.tests.TestBase;

public class HomeVaikamsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomeVaikamsPage.open("https://www.zalando.lt/vaikams-drabuziai-laisvos-kelnes" +
                "/?q=Lined+pull+on+cod+kelnes+navy+blue");

        HomeVaikamsPage.acceptPrivacyConfirmation();
    }

    @Test
    public void optionToChangeClothingColor() {
        String expectedColor = "brown";
        String actualColor = "";

        HomeVaikamsPage.clickClothingPicture();
        HomeVaikamsPage.clickDifferentColorOptionPicture();

        actualColor = HomeVaikamsPage.readValueOfColorText();

        Assert.assertTrue(actualColor.contains(expectedColor));

        HomeVaikamsPage.sleep(3000);
    }
}
