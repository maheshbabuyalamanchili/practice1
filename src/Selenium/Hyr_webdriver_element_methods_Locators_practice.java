package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hyr_webdriver_element_methods_Locators_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //get(string)
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(3000);

        //manage(maximize & minimize)
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //getCurrenturl(String)
        driver.getCurrentUrl();
        String currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);

        //getTitle(String)
        driver.getTitle();
        String title = driver.getTitle();
        System.out.println(title);

        //getPageSource(String)
        driver.getPageSource();
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        //Text Box
        driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement firstnametxtbox=driver.findElement(By.xpath("//input[@id='firstName']"));
        if (firstnametxtbox.isDisplayed()){          //isDisplayed
            if (firstnametxtbox.isEnabled()){//isEnabled
                firstnametxtbox.sendKeys("hyr tutorials");             //Sendkeys
                String enertedtxt=firstnametxtbox.getAttribute("value");   //get text
                System.out.println(enertedtxt);
                Thread.sleep(3000);
                firstnametxtbox.clear();                                         //clear


            }
            else{
                System.out.println("FIRSTNAMETXTBOX IS NOT ENABLED");
            }

        }
        else{
            System.out.println("FIRSTNAMETXTBOX IS NOT DISPLAYED");
        }


        Thread.sleep(3000);
        WebElement lastnametxtbox=driver.findElement(By.xpath("//input[@name='lName']"));
        if (lastnametxtbox.isDisplayed()){
            if (lastnametxtbox.isEnabled()){
                lastnametxtbox.sendKeys("technologies");
                String txt1 = lastnametxtbox.getAttribute("value");
                System.out.println(txt1);
                Thread.sleep(3000);
                lastnametxtbox.clear();
            }
            else {
                System.out.println("lastnametxtbox is not enabled");
            }
        }
        else{
            System.out.println("lastnametxtbox is not displayed");
        }
        Thread.sleep(3000);

        //Radio Button
        WebElement femradiobtn=driver.findElement(By.xpath("//input[@id='femalerb']"));
        femradiobtn.click();   //check
        if (femradiobtn.isSelected())
            femradiobtn.click();  //uncheck
        Thread.sleep(3000);

        //Check Box
        driver.findElement(By.xpath("//input[@id='englishchbx']"));
       WebElement englishchkbx = driver.findElement(By.xpath("//input[@id='englishchbx']"));
       englishchkbx.click();    //check

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='hindichbx']"));
        WebElement hindichkbox= driver.findElement(By.xpath("//input[@id='hindichbx']"));
        hindichkbox.click(); //check
        Thread.sleep(3000);
        if (hindichkbox.isSelected()) //uncheck
            hindichkbox.click();

        Thread.sleep(3000);

        WebElement emailtxtbx=driver.findElement(By.xpath("//input[@id='email']"));
        if (emailtxtbx.isDisplayed()){
            if (emailtxtbx.isEnabled()){
                emailtxtbx.sendKeys("abcde@gmail.com");
                Thread.sleep(3000);
                String emailtxt=emailtxtbx.getAttribute("value");
                System.out.println(emailtxt);
                emailtxtbx.clear();
            }
            else{
                System.out.println("emailtxtbox is not enabaled");
            }

        }
        else {
            System.out.println("emailtxtbox is not displayed");
        }
        Thread.sleep(3000);


        WebElement passwordtxtbx=driver.findElement(By.xpath("//input[@id='password']"));
        if (passwordtxtbx.isDisplayed()){
            if (passwordtxtbx.isEnabled()){
                passwordtxtbx.sendKeys("123456");
                Thread.sleep(3000);
                String passwordtxt=passwordtxtbx.getAttribute("value");
                System.out.println(passwordtxt);
                passwordtxtbx.clear();
            }
            else{
                System.out.println("passwordtxtbox is not enabaled");
            }
        }
        else{
            System.out.println("passwordtxtbox is not displayed");
        }
        Thread.sleep(3000);

        //Button
        driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.xpath("//label[@id='msg']")).getText());
        Thread.sleep(3000);

        //link
        driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']")).click();
        Thread.sleep(3000);

        //Close
        driver.close();
    }
}

