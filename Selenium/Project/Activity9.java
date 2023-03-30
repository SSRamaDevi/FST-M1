package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("user_login")).sendKeys("ramadevi");
        driver.findElement(By.id("user_pass")).sendKeys("^7uG#rf%zkQ");
        driver.findElement(By.id("wp-submit")).click();
        //Unable to proceed due to links are not exists on UI
        driver.close();
    }
}
