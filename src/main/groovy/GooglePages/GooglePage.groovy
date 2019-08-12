package GooglePages

import BasePages.BasePage

class GooglePage extends BasePage{

    private final String url = "https://www.google.com/"
    private final String googleSearchBox = "[class='gLFyf gsfi']"

    GooglePage(){
        super()
    }

    void go(){
        browserNavigation.goToUrl(url)
    }

    boolean at(){
        browserNavigation.waitForPageLoad()
        return browserNavigation.getUrl() == url
    }

    boolean isSearchBoxDisplayed(){
        browserNavigation.isElementDisplayed(googleSearchBox)
    }

    void enterSearchText(String sText){
        enterText(googleSearchBox, sText)
    }

}
