package dlangina.from_04_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dataField = driver.findElement(By.id("datepicker"));

        dataField.sendKeys("03/03/2023");
        Thread.sleep(1000); //only for debugging
        dataField.sendKeys(Keys.RETURN);
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}