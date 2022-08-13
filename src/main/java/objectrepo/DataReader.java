package objectrepo;

import java.util.HashMap;
import java.util.Map;

import static objectrepo.ObjectBy.XPATH;
import static objectrepo.ObjectBy.ID;
import static objectrepo.TestCaseID.TS001;
import static objectrepo.WebObjects.*;

public class DataReader {

    //TODO : Can be replaced with file reader
    private DataReader() {
    }

    //Production object data
    public static Map<TestCaseID, Map<WebObjects, WebObjectValue>> getProdObjectData() {
        Map<WebObjects, WebObjectValue> ts001Prod = new HashMap<>();
        ts001Prod.put(ACCOUNT_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts001Prod.put(REGISTER_LINK, new WebObjectValue(XPATH, "//a[contains(text(),'Register')]"));
        ts001Prod.put(FNAME_INPUT, new WebObjectValue(ID, "firstname"));
        ts001Prod.put(LNAME_INPUT, new WebObjectValue(ID, "lastname"));
        ts001Prod.put(EMAIL_INPUT, new WebObjectValue(ID, "email_address"));
        ts001Prod.put(PASSWORD_INPUT, new WebObjectValue(ID, "password"));
        ts001Prod.put(REGISTER_BUTTON, new WebObjectValue(XPATH, "//button[@title=\"Register\"]//button[@title=\"Register\"]"));
        ts001Prod.put(ASSERTIONS_TEXT, new WebObjectValue(XPATH, "//span[contains(text(),'Thank you for registering with Madison Island')]"));

        Map<WebObjects, WebObjectValue> ts002Prod = new HashMap<>();
        ts002Prod.put(ACCOUNT_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(LOG_IN_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(EMAIL_INPUT, new WebObjectValue(ID, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(PASSWORD_INPUT, new WebObjectValue(ID, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(LOG_IN_BUTTON, new WebObjectValue(ID, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(MEN_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(SHIRTS_LINK, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(FIRST_ITEM, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(SELECT_COLOR, new WebObjectValue(ID, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(SELECT_SIZE, new WebObjectValue(ID, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(ADD_TO_CART_BUTTON, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));
        ts002Prod.put(GRAND_PRICE, new WebObjectValue(XPATH, "//a[@class='skip-link skip-account']/span[contains(text(),'Account')]"));

        Map<TestCaseID, Map<WebObjects, WebObjectValue>> prodObjectData = new HashMap<>();
        prodObjectData.put(TS001, ts001Prod);
        prodObjectData.put(TS001, ts002Prod);
        return prodObjectData;
    }

}
