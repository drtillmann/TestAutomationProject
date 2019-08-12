package Selenium

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait

class BrowserNavigation extends BaseSelenium {

    BrowserNavigation(){
        super()
    }

    void goToUrl(String sUrl){
        driver.navigate().to(sUrl)
    }

    WebElement findElement(String sSelector){
        return driver.findElement(By.cssSelector(sSelector))
    }

    boolean isElementDisplayed(String sSelector){
        WebElement element = findElement(sSelector)
        return element.isDisplayed()
    }

    String getUrl(){
        return driver.currentUrl
    }

    void waitForPageLoad(){
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        }
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}

