package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Drop_downs  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\maheshbabuy\\\\Downloads\\\\edgedriver_win64 (2)\\\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
//        //1...SINGEL SELECTION
        driver.findElement(By.xpath("//select[@id='course']"));
        WebElement coursename =driver.findElement(By.xpath("//select[@id='course']"));
        //Select class
        Select coursenamedropdown =new Select(coursename);
        coursenamedropdown.selectByIndex(1);       //java
        Thread.sleep(3000);
        coursenamedropdown.selectByValue("net");   //dotnet
        Thread.sleep(3000);
        coursenamedropdown.selectByVisibleText("Javascript");   //javascript

        List<WebElement>coursedropdownoptions=coursenamedropdown.getOptions();
        for (WebElement options:coursedropdownoptions) {
            System.out.println(options.getText());
        }

        String selectedtxt= coursenamedropdown.getFirstSelectedOption().getText();
        System.out.println("selected visible txt:"+selectedtxt);
//
//        System.out.println();
//
//        //2...MULTISELECTION
        driver.findElement(By.xpath("//select[@id='ide']"));
        WebElement idename = driver.findElement(By.xpath("//select[@id='ide']"));
        Select idenamedropdown = new Select(idename);

        idenamedropdown.selectByIndex(0);  //ECLIPSE
        Thread.sleep(3000);
        idenamedropdown.selectByValue("ij");  //IntelliJ IDEA
        Thread.sleep(3000);
        idenamedropdown.selectByVisibleText("NetBeans");   //Net Beans
        Thread.sleep(3000);
        idenamedropdown.deselectByVisibleText("NetBeans");

        List<WebElement> idenamedropdownoptions = idenamedropdown.getOptions();
        for (WebElement option1 : idenamedropdownoptions) {
            System.out.println(option1.getText());
        }

        List<WebElement> selectedoptions = idenamedropdown.getAllSelectedOptions();
        for (WebElement selopt : selectedoptions) {
            System.out.println("visible text:" + selopt.getText());

        }
    }
}


