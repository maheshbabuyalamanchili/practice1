package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

    public class Loctars_Github_practice {
        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://github.com/login");
            Thread.sleep(3000);
            WebElement login=driver.findElement(By.id("login_field"));//ID
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');",login);
           Thread.sleep(3000);
            driver.findElement(By.name("password"));//NAME
            Thread.sleep(3000);
            driver.findElement(By.className("header-logo"));//CLASS NAME
            Thread.sleep(3000);
            driver.findElement(By.tagName("h1"));//TAG NAME
            Thread.sleep(3000);
            driver.findElement(By.linkText("Forgot password?"));//LINK TEXT
            Thread.sleep(3000);
            driver.findElement(By.partialLinkText("Create an "));//PARTIAL LINK TEXT
            Thread.sleep(3000);
            driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));//X-PATH
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("input[@name='commit']"));

//            public static void highlight(WebDriver driver ,WebElement element){
//                JavascriptExecutor js = (JavascriptExecutor)driver;
//                js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');",login);
//
//            }



        }
    }
