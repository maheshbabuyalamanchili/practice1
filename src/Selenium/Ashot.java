package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ashot {
    public static void main(String[] args) throws IOException, AWTException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/");
        new Robot().delay(5000);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        try {
//            AShot as= new AShot();
//            Screenshot screenshot= as.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            Files.copy(scrFile.toPath(), new File(System.getProperty("user.dir")+"//IMAGES//LOGOIMAGE.PNG").toPath());
//            ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir")+"//IMAGES//LOGOIMAGE.PNG"));
            ImageIO.read(new File(System.getProperty("user.dir") +"//IMAGES//LOGOIMAGE.PNG"));
            WebElement element = driver.findElement(By.xpath("//img[@id='logo']"));
            element.getScreenshotAs(OutputType.FILE);

            WrapsDriver wrapsDriver = (WrapsDriver) element;
            File screenshot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
            Rectangle rectangle = new Rectangle(element.getSize().width, element.getSize().height);
            Point location = element.getLocation();

            BufferedImage bufferedImage = ImageIO.read(screenshot);
            BufferedImage destImage = bufferedImage.getSubimage(location.x, location.y, rectangle.width, rectangle.height);
            ImageIO.write(destImage, "png", screenshot);
//            File file = new File("//path//to");
//            FileUtils.copyFile(screenshot, file);
            Files.copy(screenshot.toPath(), new File(System.getProperty("user.dir")+"//IMAGES//LOGOIMAGE.PNG").toPath());
            driver.close();

        }catch (Exception e){
            System.out.println("exception");
        }


        }
    }

