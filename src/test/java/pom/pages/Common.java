package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;

import java.time.Duration;

public class Common {

    public static void setupDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToAppear(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }
}