package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        /*ChromeDriver driver = new ChromeDriver();*/
        System.setProperty("webdriver.chrome.driver","/home/mihirpatel/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.gallantree.com.au/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();
        //driver.quit();

    }
}
