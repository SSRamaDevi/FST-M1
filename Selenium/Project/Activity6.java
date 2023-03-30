package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity6 {
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
       driver.findElement(By.name("search_keywords")).sendKeys("Banking");
       driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
       Thread.sleep(5000);
       WebElement jobID=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/job/ibm-banglore-3-sap-testing-3/']"));
       jobID.click();
       driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        Thread.sleep(5000);
       String email = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
       System.out.println("Email is : "+email );
       driver.close();
        }
    }
