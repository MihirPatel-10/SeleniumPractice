package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mihirpatel/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        /*driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Mihir Jatin Patel");*/

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Username']")).sendKeys("Test User Name");
        driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("Test105*");
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();


        //forget password
        Locator2 ref = new Locator2();
        String password = ref.getPassword(driver);



        //password has been retrived to log in so going back to login page;
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String name = "Mihir Patel";
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Username']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='checkbox' and @id='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @id='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
        driver.close();


    }

    public String getPassword(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']")).sendKeys("Mihir Patel");
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email']")).sendKeys("mihir.patel@google.com");
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']")).sendKeys("9265981329");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        String [] passwordArray = passwordText.split("'");
        String password = passwordArray [1];
        System.out.println(password );
        return password;

    }
}
