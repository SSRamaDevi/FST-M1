package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("test@gmail.com");
        driver.findElement(By.id("wp-submit")).click();
        Boolean ele = driver.findElement(By.xpath("//a[text()='Alchemy Jobs']")).isDisplayed();
        if(ele.equals(true)){
            System.out.println("Successfully Logged In");
        }
        driver.close();
    }
}
