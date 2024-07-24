package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class  Handle_Texboxes {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
       WebElement usertxt= driver.findElement(By.xpath("//input[@id='login_field']"));
        if (usertxt.isDisplayed()) {
            if (usertxt.isEnabled()) {
                usertxt.sendKeys("suntech");
                String entertxt = usertxt.getAttribute("value");
                System.out.println("entertxt");
                Thread.sleep(3000);
                usertxt.clear();


            } else {
                System.out.println("user name txt box enabled");
            }
        }
        else {
            System.out.println("user name txt box not displayed");
        }


        WebElement pswdtxt= driver.findElement(By.xpath("//input[@id='password']"));
        if (pswdtxt.isDisplayed()){
            if(pswdtxt.isEnabled()){
                pswdtxt.sendKeys("12345");
                Thread.sleep(3000);
                String pswdnm=pswdtxt.getAttribute("value");
                System.out.println("pswdnm");
                pswdtxt.clear();
                Thread.sleep(3000);
                driver.close();

            }
            else{
                System.out.println("pswd txt box enabled");
            }
        }

        else {
            System.out.println("pswd txt box not displayed");

        }


       }


    }


