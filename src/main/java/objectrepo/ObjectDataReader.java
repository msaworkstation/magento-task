package objectrepo;

import common.TestCaseID;
import common.WebObjects;

import java.util.HashMap;
import java.util.Map;

import static common.TestCaseID.TS002;
import static objectrepo.ObjectBy.XPATH;
import static objectrepo.ObjectBy.ID;
import static common.TestCaseID.TS001;
import static common.WebObjects.*;

public class ObjectDataReader {

    //TODO : Can be replaced with file reader
    private ObjectDataReader() {
    }

    //Production object data
    public static Map<TestCaseID, Map<WebObjects, WebObjectValue>> getObjectData() {
        Map<WebObjects, WebObjectValue> ts001 = new HashMap<>();
        ts001.put(ACCOUNT_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts001.put(REGISTER_LINK, new WebObjectValue(XPATH, "//a[contains(text(),'Register')]"));
        ts001.put(FNAME_INPUT, new WebObjectValue(ID, "firstname"));
        ts001.put(LNAME_INPUT, new WebObjectValue(ID, "lastname"));
        ts001.put(EMAIL_INPUT, new WebObjectValue(ID, "email_address"));
        ts001.put(PASSWORD_INPUT, new WebObjectValue(ID, "password"));
        ts001.put(CONFIRMATION_PASSWORD_INPUT, new WebObjectValue(ID, "confirmation"));
        ts001.put(REGISTER_BUTTON, new WebObjectValue(XPATH, "//button[@title=\"Register\"]"));
        ts001.put(ASSERTIONS_TEXT, new WebObjectValue(XPATH, "//span[contains(text(),'Thank you for registering with Madison Island')]"));

        Map<WebObjects, WebObjectValue> ts002 = new HashMap<>();
        ts002.put(ACCOUNT_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002.put(LOG_IN_LINK, new WebObjectValue(XPATH, "//a[contains(text(),'Log In')] "));
        ts002.put(EMAIL_INPUT, new WebObjectValue(ID, "email"));
        ts002.put(PASSWORD_INPUT, new WebObjectValue(ID, "pass"));
        ts002.put(LOG_IN_BUTTON, new WebObjectValue(ID, "send2"));
        ts002.put(MEN_LINK, new WebObjectValue(XPATH, "(//a[contains(text(),'Men')] )[1]"));
        ts002.put(SHIRTS_LINK, new WebObjectValue(XPATH, "(//a[contains(text(),'Pants & Denim')])[2]"));
        ts002.put(FIRST_ITEM_LINK, new WebObjectValue(XPATH, "(//div[@class='actions']/a)[1]"));
        ts002.put(SELECT_COLOR, new WebObjectValue(ID, "attribute92"));
        ts002.put(SELECT_SIZE, new WebObjectValue(ID, "attribute180"));
        ts002.put(ADD_TO_CART_BUTTON, new WebObjectValue(XPATH, "(//button[@class='button btn-cart'])[1]"));
        ts002.put(GRAND_PRICE, new WebObjectValue(XPATH, "//table[@class='info-wrapper']/tbody/tr/td/span[@class='price']"));

        Map<TestCaseID, Map<WebObjects, WebObjectValue>> prodObjectData = new HashMap<>();
        prodObjectData.put(TS001, ts001);
        prodObjectData.put(TS002, ts002);
        return prodObjectData;
    }

}
