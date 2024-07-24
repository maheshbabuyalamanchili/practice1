package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_webelement_properties   {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\maheshbabuy\\\\Downloads\\\\edgedriver_win64 (2)\\\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/login");
        //tagname

        System.out.println(driver.findElement(By.xpath("//input[@name='commit']")).getTagName());


        //html attributevalue

        driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("type");
        System.out.println( driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("type"));

        //text

        WebElement usertxt=driver.findElement(By.xpath("//input[@id='login_field']"));
        usertxt.sendKeys("hyr");
        System.out.println( usertxt.getAttribute("value"));

        //label text
        System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());


        //css attribute
        System.out.println( driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("background-color"));
        System.out.println( driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("display "));



    }
}
