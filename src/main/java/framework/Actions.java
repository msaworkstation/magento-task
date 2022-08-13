package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

    WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void selectByText(By by, String text) {
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    public void selectByIndex(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    public void waitForElement(By by, int timeout) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }
}
