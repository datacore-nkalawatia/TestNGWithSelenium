package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    String baseURL = "http://www.n11.com/";

    By signInButtonBy = By.className("btnSignIn");

    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToN11 (){
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }

}
