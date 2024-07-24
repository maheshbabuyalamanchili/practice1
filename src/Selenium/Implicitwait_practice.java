package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Implicitwait_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("hyr");

//        driver.findElement(By.xpath("//button[@id='btn2']")).click();
//        driver.findElement(By.xpath("(//input[@id='txt2'])[1]")).sendKeys("hyr2");


    }
}
