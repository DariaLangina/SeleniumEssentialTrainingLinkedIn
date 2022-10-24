package dlangina.from_06.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public void submitForm(WebDriver driver) {
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
    }
}
