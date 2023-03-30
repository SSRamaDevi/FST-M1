package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://alchemy.hguy.co/jobs");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
        driver.findElement(By.name("create_account_email")).sendKeys("rama@gmail.com");
        driver.findElement(By.name("create_account_email")).sendKeys("AutomationTester");
        driver.findElement(By.name("application")).sendKeys("http://jobportal.com");
        WebElement ele = driver.findElement(By.id("job_description_ifr"));
        driver.switchTo().frame(ele);
        driver.findElement(By.id("tinymce")).sendKeys("Applied For SAP Job");
        driver.switchTo().defaultContent();
        driver.findElement(By.name("company_name")).sendKeys("IBM");
        driver.findElement(By.id("job_title")).sendKeys("Developer");
        driver.findElement(By.name("submit_job")).click();

        driver.findElement(By.id("job_preview_submit_button")).click();
        driver.findElement(By.xpath("//a[text()='Jobs']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a/strong[text()='Load more listings']"));
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        element.click();

        if (driver.findElement(By.xpath("//div/h3[text()='Developer']")).isDisplayed())
            System.out.println("Job Created");
        driver.quit();

    }
}
