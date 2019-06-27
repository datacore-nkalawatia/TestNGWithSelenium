package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword() {
        HomePage homePage = new HomePage(driver);

        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("onur@swtestacademy.com", "11223344")
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"))
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
    }

    @Test(priority = 1)
    public void invalidLoginTest_EmptyUserPassword() {
        HomePage homePage = new HomePage(driver);

        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("", "")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }
}