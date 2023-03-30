package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver;

       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver(options);
       driver.get("https://alchemy.hguy.co/jobs");
       driver.manage().window().maximize();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//a[text()='Jobs']")).click();
        String ele = driver.getTitle();
        if(ele.equals("Jobs – Alchemy Jobs")){
            driver.close();
        }
    }
}