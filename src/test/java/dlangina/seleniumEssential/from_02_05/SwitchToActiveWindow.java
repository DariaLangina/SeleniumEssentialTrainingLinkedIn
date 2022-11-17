package dlangina.seleniumEssential.from_02_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        String originalHandle = driver.getWindowHandle();

        newTabBtn.click();

        Thread.sleep(1000); //only for debugging

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(1000); //only for debugging

        driver.switchTo().window(originalHandle);
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}
