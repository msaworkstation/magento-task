import common.TestCaseID;
import common.WebObjects;
import framework.Actions;
import objectrepo.ObjectDataReader;
import objectrepo.WebObjectValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import testdata.TestDataReader;

import static common.TestCaseID.TS001;
import static common.WebObjects.*;

public class MainTest {
    static {
        System.setProperty("webdriver.chrome.driver","/home/seceng/Downloads/chromedriver_linux64/chromedriver");
    }

    protected WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);

    @Test
    public void registration(){
        actions.open("http://magento-demo.lexiconn.com/");
        WebObjectValue accountLink = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(WebObjects.ACCOUNT_LINK);
        By accountLinkBy = actions.getElementBy(accountLink.getBy(), accountLink.getLocatorValue());
        actions.click(accountLinkBy);

        WebObjectValue registerLink = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(REGISTER_LINK);
        By registerLinkBy = actions.getElementBy(registerLink.getBy(), registerLink.getLocatorValue());
        actions.click(registerLinkBy);

        WebObjectValue fname = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(WebObjects.FNAME_INPUT);
        By fnameBy = actions.getElementBy(fname.getBy(), fname.getLocatorValue());
        actions.waitForElement(fnameBy,5);
        actions.type(fnameBy, TestDataReader.getProdTestData().get(TS001).get(FNAME_INPUT));

        WebObjectValue lname = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(LNAME_INPUT);
        By lastnameBy = actions.getElementBy(lname.getBy(), lname.getLocatorValue());
        actions.type(lastnameBy, TestDataReader.getProdTestData().get(TS001).get(LNAME_INPUT));

        WebObjectValue email = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(EMAIL_INPUT);
        By emailBy = actions.getElementBy(email.getBy(), email.getLocatorValue());
        actions.type(emailBy, TestDataReader.getProdTestData().get(TS001).get(EMAIL_INPUT));

        WebObjectValue password = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(PASSWORD_INPUT);
        By passwordBy = actions.getElementBy(password.getBy(), password.getLocatorValue());
        actions.type(passwordBy, TestDataReader.getProdTestData().get(TS001).get(PASSWORD_INPUT));

        WebObjectValue confPassword = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(CONFIRMATION_PASSWORD_INPUT);
        By confPasswordBy = actions.getElementBy(confPassword.getBy(), confPassword.getLocatorValue());
        actions.type(confPasswordBy, TestDataReader.getProdTestData().get(TS001).get(PASSWORD_INPUT));

        WebObjectValue registerButton = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(REGISTER_BUTTON);
        By registerButtonBy = actions.getElementBy(registerButton.getBy(), registerButton.getLocatorValue());
        actions.click(registerButtonBy);

        WebObjectValue registertext = ObjectDataReader
                .getObjectData()
                .get(TS001)
                .get(ASSERTIONS_TEXT);
        By registertextBy = actions.getElementBy(registertext.getBy(), registertext.getLocatorValue());
        actions.waitForElement(registertextBy,5);
        Assert.assertEquals(actions.getText(registertextBy),TestDataReader.getProdTestData().get(TS001).get(ASSERTIONS_TEXT));
    }
    
    @AfterTest
    void close() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
