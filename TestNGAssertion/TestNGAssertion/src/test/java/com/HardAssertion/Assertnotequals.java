package com.HardAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertnotequals {

    WebDriver driver;
    String URL = "https://www.easemytrip.com/";

    @BeforeTest
    public void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void TestAssertions() {

        String String1 = "MyAccount";
        String String2 = "My Booking";

       
        // assertNotEquals
        Assert.assertNotEquals(String1, String2);
        System.out.println("assertNotEquals Passed");

      
    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }
}
