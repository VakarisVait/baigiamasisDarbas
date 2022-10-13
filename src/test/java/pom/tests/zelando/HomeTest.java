package pom.tests.zelando;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.zelando.HomePage;
import pom.tests.TestBase;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.zalando.lt/moterims-home/");
        HomePage.acceptPrivacyConfirmation();
    }

    @Test
    public void test1(){
        HomePage.sleep(10000);
    }

}
