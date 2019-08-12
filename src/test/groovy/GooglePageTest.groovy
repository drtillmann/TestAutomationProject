import GooglePages.GooglePage
import org.junit.Test

class GooglePageTest{

    GooglePage googlePage = new GooglePage()

    @Test
    void isTheGoogleSearchBoxPresent(){
        googlePage.go()
        assert googlePage.at()
        assert googlePage.isSearchBoxDisplayed()
    }
}