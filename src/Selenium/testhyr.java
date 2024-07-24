package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class testhyr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //user launches the application
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        //user_can_view_HYR_TUTORIAL_dashbord_page
        driver.findElement(By.xpath("//img[@id='Header1_headerimg']")).getText();

        //user_move_the_cursore_on_selenium_practice_option
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();

        //click_on_basic_controls
        driver.findElement(By.xpath("//a[text()='Basic Controls']")).click();


    }
}
