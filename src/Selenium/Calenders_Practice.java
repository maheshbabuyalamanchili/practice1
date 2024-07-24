package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calenders_Practice {
    public static void main(String[] args) throws InterruptedException, ParseException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html#");



        //1...FIRST CALENDAR(selecting current date in current month)
//        int day=25;
//        driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='22']"));
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

        //2...SECOND CALENDAR(previous-current-future dates)
//        int day1=30;
//        driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
//       Thread.sleep(3000);
//        //previous & future month date disable in month &  select to current month date
//       //(Prv month) 04-30-2023
//       driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='30']"));  //04-30-2023
//        //(current month)05-30-2023
//       driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()='30']"));
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day1+"]")).click();

        //3...VALIDATING USER INPUT DATE
//        String date = "30/feb/2025";
//        SimpleDateFormat targetdate=new SimpleDateFormat("dd/MMM/yyyy");
//        targetdate.setLenient(false);
//        Date formatedtargetdate=targetdate.parse(date);
//        System.out.println(formatedtargetdate);
//
        //4...SELECTING CURRENT DATE TO TARGET DATE
        //Target date code
        String date = "05/DEC/2025";
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat targetdate = new SimpleDateFormat("dd/MMM/yyyy");
        Date formatedtargetdate = targetdate.parse(date);
        cal.setTime(formatedtargetdate);
        int targetmonth = cal.get(cal.MONTH);
        int targetyear = cal.get(cal.YEAR);
        int targetday = cal.get(cal.DAY_OF_MONTH);
        System.out.println(formatedtargetdate);


        //CURRENT DATE CODE
        driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
        Thread.sleep(3000);
        //MAY 2022
        String currentdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
        SimpleDateFormat currenrttargetdate = new SimpleDateFormat("MMM yyyy");
        Date formatedcurenttargetdate = currenrttargetdate.parse(currentdate);
        cal.setTime(formatedcurenttargetdate);
        int currentmonth = cal.get(cal.MONTH);
        int currentyear = cal.get(cal.YEAR);
        System.out.println(formatedcurenttargetdate);

        //FUTURE DATE

        while (currentmonth < targetmonth || currentyear < targetyear) {
            driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]")).click();
            currentdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            currenrttargetdate = new SimpleDateFormat("MMM yyyy");
            formatedcurenttargetdate = currenrttargetdate.parse(currentdate);
            cal.setTime(formatedcurenttargetdate);
            currentmonth = cal.get(cal.MONTH);
            currentyear = cal.get(cal.YEAR);
        }


        //PAST DATE
        while (currentmonth > targetmonth || currentyear > targetyear) {
            driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-prev')]")).click();
            currentdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            currenrttargetdate = new SimpleDateFormat("MMM yyyy");
            formatedcurenttargetdate = currenrttargetdate.parse(currentdate);
            cal.setTime(formatedcurenttargetdate);
            currentmonth = cal.get(cal.MONTH);
            currentyear = cal.get(cal.YEAR);
        }


        // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='25']"));
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=" + targetday + "]")).click();

    }
}


