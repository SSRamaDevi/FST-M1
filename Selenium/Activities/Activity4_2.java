package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity4_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("rama");
        lastName.sendKeys("kopparthi");        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("testfullstack@example.com");

        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("987654321");

        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}

