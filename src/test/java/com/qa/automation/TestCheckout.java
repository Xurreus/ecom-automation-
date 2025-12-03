package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCheckout {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = BaseDriver.initializeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void checkoutProcess() {
        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        // Checkout
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Kristian");
        driver.findElement(By.id("last-name")).sendKeys("Lubomirov");
        driver.findElement(By.id("postal-code")).sendKeys("1000");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        System.out.println("Checkout test passed");
    }

    @AfterClass
    public void tearDown() {
        BaseDriver.quitDriver();
    }
}
