package dlangina.from_02_06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");


        WebElement alertBtn = driver.findElement(By.id("alert-button"));
        alertBtn.click();
        Thread.sleep(1000); //only for debugging

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}
