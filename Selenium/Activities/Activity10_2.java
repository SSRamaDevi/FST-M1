package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Rama\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
                Actions actions = new Actions(driver);
                String pressedKeyText;

                //Open browser
                driver.get("https://www.training-support.net/selenium/input-events");
                WebElement pressedKey = driver.findElement(By.id("keyPressed"));

                //Create action sequence for initials
                Action actionSequence1 = actions.sendKeys("S").build();
                actionSequence1.perform();
                pressedKeyText = pressedKey.getText();
                System.out.println("Pressed key is: " + pressedKeyText);


                //Create action sequence for Spacebar
                Action actionSequence2 = actions
                        .keyDown(Keys.CONTROL)
                        .sendKeys("a")
                        .sendKeys("c")
                        .keyUp(Keys.CONTROL)
                        .build();
                actionSequence2.perform();
                pressedKeyText = pressedKey.getText();
                System.out.println("Pressed key is: " + pressedKeyText);

                //Close browser
                driver.close();
            }
        }