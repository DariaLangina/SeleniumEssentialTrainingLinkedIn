package dlangina.advancedSeleniumSupportClasses.from_05_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

public class VisibleAjaxElementLocatorFactory implements ElementLocatorFactory {
    private final WebDriver driver;
    private final int timeOutInSeconds;

    public VisibleAjaxElementLocatorFactory(WebDriver driver, int timeOutInSeconds) {
        this.driver = driver;
        this.timeOutInSeconds = timeOutInSeconds;
    }

    @Override
    public ElementLocator createLocator(Field field) {
        return new VisibleAjaxElementLocator(driver, field, timeOutInSeconds);
    }

    private class VisibleAjaxElementLocator extends AjaxElementLocator {
        public VisibleAjaxElementLocator(WebDriver driver, Field field, int timeOutInSeconds) {
            super(driver, field, timeOutInSeconds);
        }

        @Override
        protected boolean isElementUsable(WebElement element) {
            if (element == null) {
                return false;
            }
            return element.isDisplayed() && element.isEnabled();
        }
    }
}
