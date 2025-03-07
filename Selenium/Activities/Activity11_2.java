package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity11_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);                //Open browser
                driver.get("https://www.training-support.net/selenium/javascript-alerts");

                //Click the button to open a simple alert
                driver.findElement(By.cssSelector("button#confirm")).click();

                //Switch to alert window
                Alert confirmAlert = driver.switchTo().alert();

                //Get text in the alert box and print it
                String alertText = confirmAlert.getText();
                System.out.println("Alert text is: " + alertText);

                //Close the alert with OK
                confirmAlert.accept();

                //Close the browser with Cancel
                //confirmAlert.dismiss();

                //Close the Browser
                driver.close();
            }
        }