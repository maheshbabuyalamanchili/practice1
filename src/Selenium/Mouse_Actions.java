package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Mouse_Actions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
       Actions action = new Actions(driver);
        //1...MOUSE OVER(moveToElement)

         driver.get("https://www.flipkart.com/big-saving-days-june-23-sale-store?fm=neo%2Fmerchandising&iid=M_59027cea-f67a-410c-a0ef-e0dfef61e893_1_6LEPZLPGAN32_MC.8TVKUWT87M16&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=8TVKUWT87M16");
        Thread.sleep(3000);
        action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();


        //2...DRAG & DROP(dragAndDrop)

        //driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
//       WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget ui-helper-clearfix']//li[4]/h5[text()='High Tatras 4']"));
//        WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
//        action.dragAndDrop(source,target).perform();

//        WebElement source=driver.findElement(By.xpath("//div[@class='ui-widget ui-helper-clearfix']//li[4]//img"));
//        WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
//        action.dragAndDrop(source,target);

            //3...RIGHT CLICK(contextClick)
//        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//        Thread.sleep(3000);
//        action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[text()='Quit']")).click();
//        Thread.sleep(3000);
//       System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();


          //4...DOUBLE CLICK(doubleClick)
//        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//        action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();

    }
}
