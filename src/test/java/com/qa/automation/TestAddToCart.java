package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAddToCart {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = BaseDriver.initializeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void addProductToCart() {
        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Verify cart
        int items = driver.findElements(By.className("cart_item")).size();
        Assert.assertEquals(items, 1, "Cart should have 1 item");
        System.out.println("Test passed: Product added to cart");
    }

    @AfterClass
    public void tearDown() {
        BaseDriver.quitDriver();
    }
}
