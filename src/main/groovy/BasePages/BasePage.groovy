package BasePages

import Selenium.BrowserNavigation

class BasePage {

    BrowserNavigation browserNavigation

    BasePage(){
        browserNavigation = new BrowserNavigation()
    }
}
