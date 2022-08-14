package framework;

import objectrepo.ObjectBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameworkActions {

    WebDriver driver;

    public FrameworkActions(WebDriver driver) {
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

    public String getAttribute(By by,String attrValue) {
        return driver.findElement(by).getAttribute(attrValue);
    }

    public By getElementBy(ObjectBy objectBy,String value) {
        if(objectBy.equals(objectBy.XPATH)){
            return By.xpath(value);
        }
        if(objectBy.equals(objectBy.ID)){
            return By.id(value);
        }
        try {
            throw new Exception("Invalid locator");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void type(By by,String value) {
        driver.findElement(by).sendKeys(value);
    }

    public void hover(By by) {
        Actions action = new Actions(driver);
        WebElement webElement = driver.findElement(by);
        action.moveToElement(webElement).build().perform();
    }

    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }
}
