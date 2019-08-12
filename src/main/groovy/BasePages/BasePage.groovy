package BasePages

import Selenium.BrowserNavigation
import org.openqa.selenium.WebElement

class BasePage {

    BrowserNavigation browserNavigation

    BasePage(){
        browserNavigation = new BrowserNavigation()
    }

    WebElement findElement(String sSelector){
        return browserNavigation.findElement(sSelector)
    }

    void enterText(String sSelector, String sText){
        findElement(sSelector).sendKeys(sText)
    }
}
