package dlangina.seleniumEssential.from_06.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConformationPage {

    public void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
