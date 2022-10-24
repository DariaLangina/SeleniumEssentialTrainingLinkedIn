package dlangina.from_04_04;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuBtn = driver.findElement(By.id("dropdownMenuButton"));
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));

        dropdownMenuBtn.click();
        Thread.sleep(1000); //only for debugging
        autocompleteItem.click();
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}
