package ch.itecor.driver;

import org.openqa.selenium.WebDriver;

public class CustomDriver {

    public static WebDriver initialiseDriverOfType(String driverRequired) {
        WebDriver driver = null;
        switch(driverRequired) {
            case "Chrome":
                // Code for Chrome driver
                // Place the chromedriver in ch.itecor.driver folder
                System.setProperty("...", "...");
                //...
                break;
            case "Firefox":
                // Code for Firefox driver
                // ...
                break;
            default:
                return null;
        }
        // Code for opening the driver in full screen mode
        // ...
        return driver;
    }

}
