package dlangina.from_02_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        WebElement autocompleteResult = driver.findElement(By.className("pac-container"));

        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        Thread.sleep(1000); //it is needed for waiting the result

        //autocompleteResult.click(); it is impossible because the site has problem at the moment

        driver.quit();
    }
}
