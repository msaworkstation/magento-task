import common.TestCaseID;
import common.WebObjects;
import framework.FrameworkActions;
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
import static common.TestCaseID.TS002;
import static common.WebObjects.*;
import static testdata.TestData.PROD;

public class MainTest {
    static {
        // TODO: ADD the path for chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/seceng/Downloads/chromedriver_linux64/chromedriver");
    }

    protected WebDriver driver = new ChromeDriver();
    FrameworkActions frameworkActions = new FrameworkActions(driver);

    @Test(priority=1)
    public void registration() {
        frameworkActions.open("http://magento-demo.lexiconn.com/");
        TestCaseID testCaseID = TS001;
        WebObjectValue accountLink = ObjectDataReader.getObjectData().get(testCaseID).get(ACCOUNT_LINK);
        By accountLinkBy = frameworkActions.getElementBy(accountLink.getBy(), accountLink.getLocatorValue());
        frameworkActions.click(accountLinkBy);

        WebObjectValue registerLink = ObjectDataReader.getObjectData().get(testCaseID).get(REGISTER_LINK);
        By registerLinkBy = frameworkActions.getElementBy(registerLink.getBy(), registerLink.getLocatorValue());
        frameworkActions.click(registerLinkBy);

        WebObjectValue fname = ObjectDataReader.getObjectData().get(testCaseID).get(WebObjects.FNAME_INPUT);
        By fnameBy = frameworkActions.getElementBy(fname.getBy(), fname.getLocatorValue());
        frameworkActions.waitForElement(fnameBy, 5);
        frameworkActions.type(fnameBy, TestDataReader.getProdTestData().get(PROD).get(FNAME_INPUT));

        WebObjectValue lname = ObjectDataReader.getObjectData().get(testCaseID).get(LNAME_INPUT);
        By lastnameBy = frameworkActions.getElementBy(lname.getBy(), lname.getLocatorValue());
        frameworkActions.type(lastnameBy, TestDataReader.getProdTestData().get(PROD).get(LNAME_INPUT));

        WebObjectValue email = ObjectDataReader.getObjectData().get(testCaseID).get(EMAIL_INPUT);
        By emailBy = frameworkActions.getElementBy(email.getBy(), email.getLocatorValue());
        frameworkActions.type(emailBy, TestDataReader.getProdTestData().get(PROD).get(EMAIL_INPUT));

        WebObjectValue password = ObjectDataReader.getObjectData().get(testCaseID).get(PASSWORD_INPUT);
        By passwordBy = frameworkActions.getElementBy(password.getBy(), password.getLocatorValue());
        frameworkActions.type(passwordBy, TestDataReader.getProdTestData().get(PROD).get(PASSWORD_INPUT));

        WebObjectValue confPassword = ObjectDataReader.getObjectData().get(testCaseID).get(CONFIRMATION_PASSWORD_INPUT);
        By confPasswordBy = frameworkActions.getElementBy(confPassword.getBy(), confPassword.getLocatorValue());
        frameworkActions.type(confPasswordBy, TestDataReader.getProdTestData().get(PROD).get(PASSWORD_INPUT));

        WebObjectValue registerButton = ObjectDataReader.getObjectData().get(testCaseID).get(REGISTER_BUTTON);
        By registerButtonBy = frameworkActions.getElementBy(registerButton.getBy(), registerButton.getLocatorValue());
        frameworkActions.click(registerButtonBy);

        WebObjectValue registertext = ObjectDataReader.getObjectData().get(testCaseID).get(ASSERTIONS_TEXT);
        By registertextBy = frameworkActions.getElementBy(registertext.getBy(), registertext.getLocatorValue());
        frameworkActions.waitForElement(registertextBy, 5);
        Assert.assertEquals(frameworkActions.getText(registertextBy), TestDataReader.getProdTestData().get(PROD).get(ASSERTIONS_TEXT));
    }

    @Test(priority=2)
    public void budgetCheck() {
        frameworkActions.clearCookies();
        frameworkActions.open("http://magento-demo.lexiconn.com/");
        TestCaseID testCaseID = TS002;
        WebObjectValue accountLink = ObjectDataReader.getObjectData().get(testCaseID).get(ACCOUNT_LINK);
        By accountLinkBy = frameworkActions.getElementBy(accountLink.getBy(), accountLink.getLocatorValue());
        frameworkActions.click(accountLinkBy);

        WebObjectValue logInLink = ObjectDataReader.getObjectData().get(testCaseID).get(LOG_IN_LINK);
        By logInLinkBy = frameworkActions.getElementBy(logInLink.getBy(), logInLink.getLocatorValue());
        frameworkActions.click(logInLinkBy);

        WebObjectValue email = ObjectDataReader.getObjectData().get(testCaseID).get(EMAIL_INPUT);
        By emailBy = frameworkActions.getElementBy(email.getBy(), email.getLocatorValue());
        frameworkActions.type(emailBy, TestDataReader.getProdTestData().get(PROD).get(EMAIL_INPUT));

        WebObjectValue password = ObjectDataReader.getObjectData().get(testCaseID).get(PASSWORD_INPUT);
        By passwordBy = frameworkActions.getElementBy(password.getBy(), password.getLocatorValue());
        frameworkActions.type(passwordBy, TestDataReader.getProdTestData().get(PROD).get(PASSWORD_INPUT));

        WebObjectValue loginButton = ObjectDataReader.getObjectData().get(testCaseID).get(LOG_IN_BUTTON);
        By loginButtonBy = frameworkActions.getElementBy(loginButton.getBy(), loginButton.getLocatorValue());
        frameworkActions.click(loginButtonBy);

        WebObjectValue menLink = ObjectDataReader.getObjectData().get(testCaseID).get(MEN_LINK);
        By menLinkBy = frameworkActions.getElementBy(menLink.getBy(), menLink.getLocatorValue());
        frameworkActions.hover(menLinkBy);

        WebObjectValue shirtsLink = ObjectDataReader.getObjectData().get(testCaseID).get(SHIRTS_LINK);
        By shirtsLinkBy = frameworkActions.getElementBy(shirtsLink.getBy(), shirtsLink.getLocatorValue());
        frameworkActions.click(shirtsLinkBy);

        WebObjectValue firstItemLink = ObjectDataReader.getObjectData().get(testCaseID).get(FIRST_ITEM_LINK);
        By firstItemLinkBy = frameworkActions.getElementBy(firstItemLink.getBy(), firstItemLink.getLocatorValue());
        frameworkActions.click(firstItemLinkBy);

        WebObjectValue colorSelect = ObjectDataReader.getObjectData().get(testCaseID).get(SELECT_COLOR);
        By colorSelectBy = frameworkActions.getElementBy(colorSelect.getBy(), colorSelect.getLocatorValue());
        frameworkActions.selectByText(colorSelectBy, TestDataReader.getProdTestData().get(PROD).get(SELECT_COLOR));

        WebObjectValue sizeSelect = ObjectDataReader.getObjectData().get(testCaseID).get(SELECT_SIZE);
        By sizeSelectBy = frameworkActions.getElementBy(sizeSelect.getBy(), sizeSelect.getLocatorValue());
        frameworkActions.selectByText(sizeSelectBy, TestDataReader.getProdTestData().get(PROD).get(SELECT_SIZE));

        WebObjectValue addToCartButton = ObjectDataReader.getObjectData().get(testCaseID).get(ADD_TO_CART_BUTTON);
        By addToCartButtonBy = frameworkActions.getElementBy(addToCartButton.getBy(), addToCartButton.getLocatorValue());
        frameworkActions.click(addToCartButtonBy);

        WebObjectValue grandPriceButton = ObjectDataReader.getObjectData().get(testCaseID).get(GRAND_PRICE);
        By grandPriceButtonBy = frameworkActions.getElementBy(grandPriceButton.getBy(), grandPriceButton.getLocatorValue());
        Assert.assertTrue(Double.parseDouble(frameworkActions.getAttribute(grandPriceButtonBy, "innerHTML").replace("$", "")) < Double.parseDouble(TestDataReader.getProdTestData().get(PROD).get(GRAND_PRICE)));
    }

    @AfterTest
    void close() {
        driver.quit();
    }
}
