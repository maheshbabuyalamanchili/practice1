package GREENKART_PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class GREENKART_PRACTICE {
    public static void main(String[] args) throws InterruptedException, ParseException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String parentwind = driver.getWindowHandle();
        System.out.println("parent window:" + parentwind + driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();

        Set<String> WINDOWHANDELS = driver.getWindowHandles();
        for (String WINDOWHANDEL : WINDOWHANDELS) {
            if (!WINDOWHANDEL.equals(parentwind)) ;
            driver.switchTo().window(WINDOWHANDEL);
        }

        driver.findElement(By.xpath("//div[@class='search-buttons-heading']/div/ul/li/a/span[text()='Flights']"));
        String flighttxt=driver.findElement(By.xpath("//div[@class='search-buttons-heading']/div/ul/li/a/span[text()='Flights']")).getText();
        System.out.println(flighttxt);


        driver.findElement(By.xpath("//label[text()='Round Trip']/preceding-sibling::input")).click();


//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//
//        driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();
//
//
//
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
//
//        driver.findElement(By.xpath("(//a[text()=' Hyderabad (HYD)'])[1]")).click();




//        driver.findElement(By.xpath("(//div[@class='picker-first2']/div/label/following::input[@id='ctl00_mainContent_view_date1'])[1]")).click();
//
//        String date = "05/DEC/2025";
//        Calendar cal=Calendar.getInstance();
//        SimpleDateFormat targetdate = new SimpleDateFormat("dd/MMM/yyyy");
//        Date formatedtargetdate = targetdate.parse(date);
//        cal.setTime(formatedtargetdate);
//        int targetmonth = cal.get(cal.MONTH);
//        int targetyear = cal.get(cal.YEAR);
//        int targetday = cal.get(cal.DAY_OF_MONTH);
//        System.out.println(formatedtargetdate);
//
//
//        //CURRENT DATE CODE
//        //JUNE 2023
//        // String currentdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//        String currentdate = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
//        SimpleDateFormat currenrttargetdate = new SimpleDateFormat("MMM yyyy");
//        Date formatedcurenttargetdate = currenrttargetdate.parse(currentdate);
//        cal.setTime(formatedcurenttargetdate);
//        int currentmonth = cal.get(cal.MONTH);
//        int currentyear = cal.get(cal.YEAR);
//        System.out.println(formatedcurenttargetdate);
//
//        //FUTURE DATE
//
//        while (currentmonth < targetmonth || currentyear < targetyear) {
//            //driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]")).click();
//            currentdate = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
//            currenrttargetdate = new SimpleDateFormat("MMM yyyy");
//            formatedcurenttargetdate = currenrttargetdate.parse(currentdate);
//            cal.setTime(formatedcurenttargetdate);
//            currentmonth = cal.get(cal.MONTH);
//            currentyear = cal.get(cal.YEAR);
//        }
//
//        // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='25']"));
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=" + targetday + "]")).click();


        driver.findElement(By.xpath("//div[text()='1 Adult']")).click();

        //driver.findElement(By.xpath("//span[text()='12+ years']/parent::div/following-sibling::div/span[3]")).click();

        driver.findElement(By.xpath("//input[@value='Done']")).click();
        //driver.findElement(By.xpath("(//div[@class='picker-first2']/div/label/following::input[@id='ctl00_mainContent_view_date1'])[1]")).click();
    }

    }

