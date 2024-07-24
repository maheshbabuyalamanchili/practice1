package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class greenkart_practice  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //try {

            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']/following-sibling::div[2]/button]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[starts-with(.,'Place Order')]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//label[text()='Choose Country']/following::div/select"));
            WebElement dropdown = driver.findElement(By.xpath("//label[text()='Choose Country']/following::div/select"));
            Select selectdropdown = new Select(dropdown);
            Thread.sleep(3000);
            selectdropdown.selectByVisibleText("Brazil");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='checkbox']"));
            WebElement CHECKBOX = driver.findElement(By.xpath("//input[@type='checkbox']"));
            CHECKBOX.click(); //check
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Proceed']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//span[text()='Thank you, your order has been placed successfully ']"));
            WebElement txt = driver.findElement(By.xpath("//span[text()='Thank you, your order has been placed successfully ']"));
            String text = txt.getText();
            System.out.println(text);
            driver.quit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }

}







