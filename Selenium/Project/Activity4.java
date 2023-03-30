package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver;

       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver(options);
       driver.get("https://alchemy.hguy.co/jobs");
       driver.manage().window().maximize();
       Thread.sleep(5000);
       String secondTitle = driver.findElement(By.xpath("//div[@class='entry-content clear']//child::p[5]//following::h2")).getText();
       if(secondTitle.equals("Quia quis non")){
           driver.close();
       }
    }
}