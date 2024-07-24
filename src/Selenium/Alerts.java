package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers//msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        //ALERT BOX
//       driver.findElement(By.xpath("//button[@id='alertBox']")). click();
//       Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());    //gettext
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();      //ok
//        System.out.println(driver.findElement(By.xpath("//div[text()='You selected alert popup']")).getText());


        //CONFIRM BOX
//        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//        System.out.println(driver.findElement(By.xpath("//div[text()='You pressed OK in confirmation popup']")).getText());
//
//        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();         //cancel
//        System.out.println(driver.findElement(By.xpath("//div[text()='You pressed Cancel in confirmation popup']")).getText());

        //PROMPT BOX
//        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().sendKeys("hyr");   //sendkeys
//        driver.switchTo().alert().accept();
//        System.out.println(driver.findElement(By.xpath("//div[text()='You entered text hyr in propmt popup']")).getText());
//
//        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();
//        System.out.println(driver.findElement(By.xpath("//div[text()='You pressed Cancel in prompt popup.']")).getText());


        //////////////////////////////////////////////////




    }
}