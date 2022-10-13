package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.pages.Common;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        Common.setupDriver();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}