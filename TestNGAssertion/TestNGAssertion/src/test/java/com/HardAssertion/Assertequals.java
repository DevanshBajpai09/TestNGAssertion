package com.HardAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertequals {

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

        // assertEquals
        Assert.assertEquals(String1, "MyAccount");
        System.out.println("assertEquals Passed");

        // assertNotEquals
        
    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }
}
