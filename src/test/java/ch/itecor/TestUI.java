package ch.itecor;

import ch.itecor.driver.CustomDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestUI
{
    @Test
    public void technicalTestUI() {
        String baseUrl = "https://www.itecor-app.ch/";

        // Exercise 0: driver management
        WebDriver driver = CustomDriver.initialiseDriverOfType("Chrome");

        // Exercise 1: Login
        // Access the base url
        //...
        // Log in by filling the username and password and click on the Submit button
        //...
        // Verify the username on the greetings message
        //...

        // Exercise 2
        // Wait for spinner to disappear
        //...

        // Select the Geneva office
        //...

        // Exercise 3
        // Get number of free seats from the orange number
        // Constraint: implement the method countTotalNumberOfFreeSeats at the bottom of this class
        // int numOfFreeSeats = countTotalNumberOfFreeSeats(driver);
        // Verify that the total number of free seats is equal to 10
        //...

        // Exercise 4
        // Get the number of free seats in the HR Office
        //...
        // Verify that the number of free seats in the HR office is equal to 4
        //...

        // Exercise 5
        // Click on the third free seat in HR Office and then click on the 6th free seat among the remaining ones
        //...

        // Exercise 6
        // Verify that the total number of free seats was decreased by 2
        //...

        // Exercise 7
        // Show that the seats in the conference room are lightblue -> rgb(173, 216, 230)
        //...

        // Exercise 8
        // Click on the HR chair and verify the following properties
        // 1) A popup bubble appears (is visible)
        // 2) The chair title is "HR chair"
        // 3) The popup message says "This seat cannot be booked"
        // 1)
        //...
        // 2)
        //...
        // 3)
        //...

        // Exercise 9
        // Logout of the application and verify that after logging out the login page is displayed
        //...

        // Close the driver
        //..
    }

}
