package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver;

       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver(options);
       driver.get("https://alchemy.hguy.co/jobs");
       driver.manage().window().maximize();
       Thread.sleep(5000);
       String ele = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
       if(ele.equals("Welcome to Alchemy Jobs")){
           driver.close();
       }
    }
}