package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class Navigation_methods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@name='q']")).submit();
        Thread.sleep(3000);
        driver.navigate().to("https://www.bing.com/search?q=gmail&cvid=a8929cd5a0d744de98451b2965c6e3a6&aqs=edge.0.0j46j0l4j69i61l3.4119j0j4&FORM=ANAB01&PC=U531" + "");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Gmail - Email from Google']")).click();
        Thread.sleep(3000);
        String parentwindow=driver.getTitle();
        Set<String>windowhandels=driver.getWindowHandles();
        for (String WINDOWHANDEL:windowhandels) {
            if (!WINDOWHANDEL.equals(parentwindow)){
                driver.switchTo().window(WINDOWHANDEL);
        }
            }

        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abcd@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();




        //////////////////////////////

        //Github
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hyr");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).submit();
//        Thread.sleep(3000);
//        driver.navigate().to("https://www.bing.com/search?q=github+login&cvid=6481b9b960e4438da2aad01c39f08130&aqs=edge.1.69i60j69i59l2j46l2j69i57j69i60l3.3285j0j9&FORM=ANAB01&PC=U531");
//        Thread.sleep(3000);
//        String parentwindow = driver.getWindowHandle();
//        driver.findElement(By.xpath("(//a[text()='Sign in to GitHub · GitHub'])[1]")).click();
//        Thread.sleep(3000);
//        Set<String> windowhandels = driver.getWindowHandles();
//        for (String windowhandel : windowhandels) {
//            if (!windowhandel.equals(parentwindow)) {
//                driver.switchTo().window(windowhandel);
//            }
//        }
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("test@gmail.com");
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
    }
}