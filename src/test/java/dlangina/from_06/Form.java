package dlangina.from_06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

//        in the lesson
        driver.findElement(By.id("first-name")).sendKeys("Daria");
        driver.findElement(By.id("last-name")).sendKeys("Langina");
        driver.findElement(By.id("job-title")).sendKeys("QA");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='0']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("11/11/1991");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        Thread.sleep(1000); //only for debugging

        driver.quit();
    }
}
