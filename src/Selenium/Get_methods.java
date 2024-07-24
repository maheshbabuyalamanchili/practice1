package Selenium;

import org.asynchttpclient.request.body.multipart.StringPart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_methods  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\maheshbabuy\\\\Downloads\\\\edgedriver_win64 (2)\\\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();


        //url
        driver.get("https://www.selenium.dev/");

        //titel
        driver.getTitle();
        String Title= driver.getTitle();
        System.out.println("Title:"+Title);

        //Currenturl
        driver.getCurrentUrl();
        String currenturl=driver.getCurrentUrl();
        System.out.println("CURRENT URL:"+currenturl);

        //Page source
        driver.getPageSource();
        String pagesource= driver.getPageSource();
        System.out.println("PAGE SOURCE:"+pagesource);

    }
}
