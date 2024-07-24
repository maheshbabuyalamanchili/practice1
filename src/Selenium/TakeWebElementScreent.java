package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class TakeWebElementScreent {
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/");
        Thread.sleep(8000);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        WebElement we=driver.findElement(By.xpath("//img[@id='logo']"));
        try {
            AShot AS=new AShot();

            Screenshot screenshot =AS.takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir")+"/IMAGES/LOGOIMAGE.PNG"));
           Thread.sleep(3000);

        }catch (Exception e){
            System.out.println("exception");
        }


    }
}
