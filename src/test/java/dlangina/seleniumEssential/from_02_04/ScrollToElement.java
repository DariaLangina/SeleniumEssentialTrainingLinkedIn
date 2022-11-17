package dlangina.seleniumEssential.from_02_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));

        Actions actions = new Actions(driver);

        actions.moveToElement(name);
        name.sendKeys("Daria Langina");
        date.sendKeys("01/01/2022");

        driver.quit();
    }
}
