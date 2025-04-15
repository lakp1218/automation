package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(String[] args) throws InterruptedException {
        // Set path to chromedriver if not set in environment variables
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to OrangeHRM login page
        driver.get("https://automation1218-trials7161.orangehrmlive.com/");

        // Maximize the browser window
        driver.manage().window().maximize();
        
        Thread.sleep(2000);

        // Locate username field and enter value
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");

        // Locate password field and enter value
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("s1@3AsGuOF");

        // Locate and click the Login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Wait for a moment to see the result (not recommended for real testing)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the current page title after login
        System.out.println("Page Title after login: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
