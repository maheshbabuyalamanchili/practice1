package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nop_Ecommerce {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Edge drivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        //launch();

       // Map<String,Object>edgePrefs=new HashMap<>();
//        edgePrefs.put("profile.default_content_settings.popups",0);
//        edgePrefs.put("profile.default_content_setting.values.notifications",2);

       // EdgeOptions opt=new EdgeOptions();

        //opt.setCapability("pref",edgePrefs);
//        WebDriver driver = new EdgeDriver();
//        driver.manage().deleteAllCookies();
        //url
        driver.get("http://admin-demo.nopcommerce.com/login");
        driver.getCurrentUrl();
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);

        //Title
        driver.getTitle();
        String title = driver.getTitle();
        System.out.println(title);

        //pagesource
//        driver.getPageSource();
//        String pagesource= driver.getPageSource();
//        System.out.println(pagesource);

        //username
        WebElement username=driver.findElement(By.xpath("//input[@id='Email']"));//username
        if (username.isDisplayed()){
            if (username.isEnabled()) {
                username.clear();
                username.sendKeys("admin@yourstore.com");
                String entertxt = username.getAttribute("value");
                System.out.println(entertxt);
            }
            else {
                System.out.println("username is not enabled");
            }
        }
        else {
            System.out.println("username is not displayed");
        }

        //password
            WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));//password
        if (password.isDisplayed()){
            if (password.isEnabled()){
                password.clear();
                password.sendKeys("admin");
                String enterpswd=password.getAttribute("value");
                System.out.println(enterpswd);
            }
            else {
                System.out.println("password is not enabled");
            }
        }
        else {
            System.out.println("password is not displayed");
        }

        //login
        driver.findElement(By.xpath(" //button[text()='Log in']")).click();

        //validate dashbord
        driver.findElement(By.xpath("//div[@class='content-header']"));
        System.out.println(driver.findElement(By.xpath("//div[@class='content-header']")).getText());

        //customer menu
        driver.findElement(By.xpath("(//a[@href='#'])[7]")).click();

        //customer menu item
        driver.findElement(By.xpath("(//a[@href='/Admin/Customer/List'])[1]")).click();

        //add button
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

        //validate Add a new customer page
        driver.findElement(By.xpath("//h1[@class='float-left']"));
        System.out.println(  driver.findElement(By.xpath("//h1[@class='float-left']")).getText());

        //customer_info
        //Email
        driver.findElement(By.xpath("//label[text()='Email']/parent::div/following::div/input[@id='Email']")).sendKeys("test12mail@gmail.com");

        //password
        driver.findElement(By.xpath("//label[text()='Password']/parent::div/following::div/input[@id='Password']")).sendKeys("1234567890");

        //firstname
        driver.findElement(By.xpath("//label[text()='First name']/parent::div/following::div/input[@id='FirstName']")).sendKeys("FirstName");

        //lastname
        driver.findElement(By.xpath("//label[text()='Last name']/parent::div/following::div/input[@id='LastName']")).sendKeys("LastName");

        //gender
        driver.findElement(By.xpath("//label[text()='Gender']/../following::input[@id='Gender_Male']")).click();

        //date
        int day=25;
        driver.findElement(By.xpath("//label[text()='Date of birth']//following::div[@class='col-md-9']//span[@class='k-icon k-i-calendar']")).click();
        driver.findElement(By.xpath("//a[text()='25']"));
        driver.findElement(By.xpath("//a[text()="+day+"]")).click();

        //companyname
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("abcd");

        //checkbok
        driver.findElement(By.xpath("//input[@class='check-box']")).click();

        //Newsletter
        driver.findElement(By.xpath("//label[contains(text(),'Newsletter')]/parent::div/following::div[1]")).click();
        driver.findElement(By.xpath("//li[text()='Test store 2']")).click();

        //Customer roles
        driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")).click();
        driver.findElement(By.xpath("//li[text()='Administrators']")).click();


        Thread.sleep(3000);
        //Manager of vendor
       driver.findElement(By.xpath("//label[text()='Manager of vendor']/following::div/select[@id='VendorId']"));
        WebElement vendor= driver.findElement(By.xpath("//label[text()='Manager of vendor']/following::div/select[@id='VendorId']"));
        Select vendordpdwn=new Select(vendor);
        vendordpdwn.selectByVisibleText("Vendor 2");

       List<WebElement>vendordpdwnoptions= vendordpdwn.getOptions();
        for (WebElement options:vendordpdwnoptions) {
            System.out.println(options.getText());

        }

        // Active checkbox
        driver.findElement(By.xpath("//label[text()='Active']/parent::div/following::div/input[@id='Active']")).click();

        //Admin Comments
        driver.findElement(By.xpath("//label[text()='Admin comment']/../div/following::div/textarea[@id='AdminComment']")).sendKeys("helo");

        //save
       driver.findElement(By.xpath("//div[@class='content-header clearfix']/h1/small/following::div/button[1]")).click();

       //confirmation msg
        driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText());

        //quitbrowser
        driver.quit();

   }

    }

