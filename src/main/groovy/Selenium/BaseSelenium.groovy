package Selenium

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class BaseSelenium {

    public WebDriver driver

    BaseSelenium(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\${System.getProperty("user.name")}\\IdeaProjects\\gradleselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver()
    }

    void print(Object obj){
        System.out.println(String.valueOf(obj))
    }


}