package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mihirpatel/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Mihir");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
        driver.findElement(By.className("signInBtn")).click();
    }
}
