package dlangina.from_02_07;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModalBtn = driver.findElement(By.id("modal-button"));
        WebElement closeBtn = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        openModalBtn.click();
        Thread.sleep(1000); //only for debugging

        js.executeScript("arguments[0].click", closeBtn);
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}
