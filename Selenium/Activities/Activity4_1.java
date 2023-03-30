package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity4_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        System.out.println("Heading is: " + driver.getTitle());
        driver.close();
    }
}

