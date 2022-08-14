package testdata;

import common.TestCaseID;
import common.WebObjects;

import java.util.HashMap;
import java.util.Map;

import static common.TestCaseID.TS001;
import static common.TestCaseID.TS002;
import static common.WebObjects.*;
import static testdata.TestData.PROD;

public class TestDataReader {


    public static Map<TestData, Map<WebObjects, String>> getProdTestData() {
        int min = 50;
        int max = 100;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Map<WebObjects, String> tdProd = new HashMap<>();
        tdProd.put(FNAME_INPUT, "FTestTest");
        tdProd.put(LNAME_INPUT, "LTestTest");
//        tdProd.put(EMAIL_INPUT, "email" + random_int + "@gmail.com");
        tdProd.put(EMAIL_INPUT, "email88@gmail.com");
        tdProd.put(PASSWORD_INPUT, "A3Lpgbidq9ZgcZp");
        tdProd.put(CONFIRMATION_PASSWORD_INPUT, "A3Lpgbidq9ZgcZp");
        tdProd.put(ASSERTIONS_TEXT, "Thank you for registering with Madison Island.");
        tdProd.put(SELECT_COLOR, "Indigo");
        tdProd.put(SELECT_SIZE, "31");
        tdProd.put(GRAND_PRICE, "350");

        Map<TestData, Map<WebObjects, String>> prodObjectData = new HashMap<>();
        prodObjectData.put(PROD, tdProd);
        return prodObjectData;
    }
}
