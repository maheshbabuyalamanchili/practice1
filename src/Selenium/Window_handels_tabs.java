package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Window_handels_tabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        //SINGEL WINDOW
//        String parentwindow = driver.getWindowHandle();
//        System.out.println("parent window handel:" + parentwindow + driver.getTitle());
//        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
//        Set<String> windowhandels = driver.getWindowHandles();
//        for (String windowhandel : windowhandels) {
//            driver.switchTo().window(windowhandel);
//            System.out.println(windowhandel + driver.getTitle());
//        }

            /////performing actions in childwindow handel to parentwindow
        String parentwindow = driver.getWindowHandle();
        System.out.println("parent window handel:"+parentwindow+driver.getTitle());
        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
        Set<String>windowhandels=driver.getWindowHandles();
//        Iterator<String> itt = windowhandels.iterator();
//        String parentid = itt.next();
//        String childid = itt.next();
        for (String windowhandel:windowhandels) {
            if (!windowhandel.equals(parentwindow)){
                driver.switchTo().window(windowhandel);
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hyr");
                Thread.sleep(3000);
                System.out.println(windowhandel+driver.getTitle());
                driver.close();

            }
        }
        driver.switchTo().window(parentwindow);
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hyr");
       Thread.sleep(3000);
            driver.quit();

            //Singel Tab

//        String parentwindow = driver.getWindowHandle();
//        System.out.println("parent window handel:"+parentwindow+driver.getTitle());
//        driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
//        Set<String>windowhandels=driver.getWindowHandles();
//        for (String windowhandel:windowhandels) {
//            if (!windowhandel.equals(parentwindow)){
//                driver.switchTo().window(windowhandel);
//                driver.findElement(By.xpath("//button[@id='alertBox']")). click();
//               Thread.sleep(3000);
//                System.out.println(driver.switchTo().alert().getText());
//                Thread.sleep(3000);
//                driver.switchTo().alert().accept();
//                System.out.println(driver.findElement(By.xpath("//div[text()='You selected alert popup']")).getText());
//                driver.close();
//            }
//
//        }
//        driver.switchTo().window(parentwindow);
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hyr");
//        Thread.sleep(3000);


        }
    }



