package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Explicitwait_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testproject.io/");
        String parentwindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Set<String> windowhandels = driver.getWindowHandles();
        for (String windowhandel : windowhandels) {
            if (!windowhandel.equals(parentwindow)) {
                driver.switchTo().window(windowhandel);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
                driver.findElement(By.xpath("//input[@id='username']")).sendKeys("HYR");
            }
        }
    }
    }















