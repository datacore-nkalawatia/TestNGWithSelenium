package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
    public WebDriver driver;

    @BeforeClass
    public void setup()
    {
        //Create a new ChromeDriver
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
