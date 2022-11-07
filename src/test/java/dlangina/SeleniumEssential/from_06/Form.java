package dlangina.SeleniumEssential.from_06;

import dlangina.SeleniumEssential.from_06.pages.ConformationPage;
import dlangina.SeleniumEssential.from_06.pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


        FormPage formPage = new FormPage();
        ConformationPage conformationPage = new ConformationPage();

        formPage.submitForm(driver);
        conformationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", conformationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
