package dlangina.seleniumEssential.from_04_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));

        checkbox3.click();
        Thread.sleep(1000); //only for debugging
        checkbox2.click();
        Thread.sleep(1000); //only for debugging
        checkbox1.click();
        Thread.sleep(1000); //only for debugging


        driver.quit();
    }
}
