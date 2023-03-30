package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity5_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
                //Open the browser
                driver.get("https://training-support.net/selenium/dynamic-controls");
                //Find the checkbox
                WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
                System.out.println("The checkbox is selected: " + textInput.isEnabled());
                driver.findElement(By.id("toggleInput")).click();
                System.out.println("The checkbox is selected: " + textInput.isEnabled());
                driver.close();

            }

        }