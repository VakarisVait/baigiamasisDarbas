package pom.tests.zelando;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.zelando.HomeMoterimsPage;
import pom.tests.TestBase;

public class HomeMoterimsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomeMoterimsPage.open("https://www.zalando.lt/moterims-home/");
        HomeMoterimsPage.acceptPrivacyConfirmation();
    }

    @Test
    public void ChangePassword() {
        String expectedText = "vakaris.vaitu@gmail.com";
        String actualText = "";

        HomeMoterimsPage.clickPersonIcon();
        HomeMoterimsPage.clickPamirsoteSlaptazodiButton();
        HomeMoterimsPage.inputEmail("vakaris.vaitu@gmail.com");
        HomeMoterimsPage.clickGautiNuorodaButton();

        actualText = HomeMoterimsPage.readValueOfText();

        Assert.assertTrue(actualText.contains(expectedText));

        HomeMoterimsPage.sleep(3000);
    }



}
