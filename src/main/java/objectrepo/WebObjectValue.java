package objectrepo;

public class WebObjectValue {

    ObjectBy by;
    String locatorValue;

    WebObjectValue(ObjectBy by, String locatorValue) {
        this.by = by;
        this.locatorValue = locatorValue;
    }

    public ObjectBy getBy() {
        return by;
    }

    public String getLocatorValue() {
        return locatorValue;
    }
}
