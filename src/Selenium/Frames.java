package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("text1");//main doc
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']"))); //frame1
       driver.findElement(By.xpath("//select[@id='course']"));
       WebElement coursename =driver.findElement(By.xpath("//select[@id='course']"));
       Select coursenamedd=new Select(coursename);
       coursenamedd.selectByVisibleText("Java");
       driver.switchTo().defaultContent();//main doc
       driver.findElement(By.xpath("//input[@id='name']")).clear();
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("text2");//frame2

            //SWITCHING DRIVER FROM ONE FRAME TO ANOTHERFRAME

            driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("text1");//main doc
            Thread.sleep(3000);
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));//frame 1
            driver.findElement(By.xpath("//select[@id='course']"));
            WebElement csname= driver.findElement(By.xpath("//select[@id='course']"));
            Select coursenamedrop=new Select(csname);
            coursenamedrop.selectByVisibleText("Java");
            Thread.sleep(3000);
            driver.switchTo().defaultContent(); //main doc
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']")));//FRAME 2
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hyr");
            Thread.sleep(3000);
            driver.switchTo().defaultContent();//main doc
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));//FRAME1
            Thread.sleep(3000);
            coursenamedrop.selectByVisibleText("Dot Net");
            Thread.sleep(3000);
            driver.switchTo().defaultContent();//main doc
            driver.findElement(By.xpath("//input[@id='name']")).clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("TEXT2");

    }
}
