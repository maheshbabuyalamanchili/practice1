package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Screenshorts {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver,driver,edge","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.xpath("//span[text()='Downloads']")).click();

        File fl =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(fl.toPath(), new File("C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\src\\screenshots\\selenium download.jpg").toPath());
    }
}
