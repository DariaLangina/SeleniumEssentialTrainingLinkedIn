package dlangina.SeleniumEssential.from_04_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/ProgramData/chocolatey/lib/chromedriver/tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        radioBtn3.click();
        Thread.sleep(1000); //only for debugging
        radioBtn2.click();
        Thread.sleep(1000); //only for debugging
        radioBtn1.click();
        Thread.sleep(1000); //only for debugging


        driver.quit();
    }
}
