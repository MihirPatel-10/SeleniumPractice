package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        //implicit wait - 5 second time out


        System.setProperty("webdriver.chrome.driver", "/home/mihirpatel/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Mihir");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mihir Patel");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mihir.patel.123@google.com");
        //driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        //driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("mihitpar@googly.com");
        //driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("mihirpatel@example.au");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9958741234");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("MihirPatel");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        //driver.findElement(By.xpath("//button[contains(@class, 'submit'")).click();
        /*driver.findElement(By.cssSelector("input#chkboxOne")).click();
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.xpath("//div[contain(@class,'submit']")).click();*/
    }
}
