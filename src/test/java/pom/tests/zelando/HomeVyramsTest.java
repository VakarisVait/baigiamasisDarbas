package pom.tests.zelando;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.zelando.HomeVyramsPage;
import pom.tests.TestBase;

public class HomeVyramsTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomeVyramsPage.open("https://www.zalando.lt/vyrams-home/");
        HomeVyramsPage.acceptPrivacyConfirmation();
    }

    @Test
    public void productFilteringOption(){
        String expectedFilterText = "Padai ir vidpadiniai įdėklai vyrams";
        String actualFilterText = "";

        HomeVyramsPage.clickAvalyneButton();
        HomeVyramsPage.clickAvalynesAksesuaraiButton();
        HomeVyramsPage.clickPadaiIrVidpadiniaiIdeklaiButton();
        HomeVyramsPage.sleep(2000);
        actualFilterText = HomeVyramsPage.readValueOfText();

        Assert.assertEquals(actualFilterText, expectedFilterText);

        HomeVyramsPage.sleep(2000);
    }
}
