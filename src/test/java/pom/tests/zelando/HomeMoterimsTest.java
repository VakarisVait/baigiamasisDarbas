package pom.tests.zelando;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.zelando.HomeMoterimsPage;
import pom.tests.TestBase;
import pom.utils.TestListener;

@Listeners(TestListener.class)
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
        String expectedText = "testas14@gmail.com";
        String actualText = "";

        HomeMoterimsPage.clickPersonIcon();
        HomeMoterimsPage.clickPamirsoteSlaptazodiButton();
        HomeMoterimsPage.inputEmail("testas14@gmail.com");
        HomeMoterimsPage.clickGautiNuorodaButton();
        HomeMoterimsPage.sleep(3000);

        actualText = HomeMoterimsPage.readValueOfText();

        Assert.assertTrue(actualText.contains(expectedText));

        HomeMoterimsPage.sleep(3000);
    }



}
