package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_practice {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.egde.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://suntechnology.my.salesforce.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sugumars-uxyq@force.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("I@sun@312");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        Thread.sleep(3000);
    }

}