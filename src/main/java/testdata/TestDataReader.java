package testdata;

import common.TestCaseID;
import common.WebObjects;

import java.util.HashMap;
import java.util.Map;

import static common.TestCaseID.TS001;
import static common.WebObjects.*;

public class TestDataReader {


    public static Map<TestCaseID, Map<WebObjects, String>> getProdTestData() {
        int min = 50;
        int max = 100;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Map<WebObjects, String> ts001Prod = new HashMap<>();
        ts001Prod.put(FNAME_INPUT, "FTestTest");
        ts001Prod.put(LNAME_INPUT, "LTestTest");
        ts001Prod.put(EMAIL_INPUT, "email" + random_int + "@gmail.com");
        ts001Prod.put(PASSWORD_INPUT, "A3Lpgbidq9ZgcZp");
        ts001Prod.put(CONFIRMATION_PASSWORD_INPUT, "A3Lpgbidq9ZgcZp");
        ts001Prod.put(ASSERTIONS_TEXT, "Thank you for registering with Madison Island.");

        Map<TestCaseID, Map<WebObjects, String>> prodObjectData = new HashMap<>();
        prodObjectData.put(TS001, ts001Prod);
        return prodObjectData;
    }
}
