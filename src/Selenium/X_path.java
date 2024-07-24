package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X_path {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\IdeaProjects\\Selenium Java\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();


        //xpath using index
        //table[@id="contactList"]/tbody/tr[5]
        // (//table[@id="contactList"]/tbody/tr)[5]
        // (//table[@id="contactList"]/tbody/tr/td)[23]



        //X-PATH FUNCTIONS(links,labels,buttons,headers...)

        // 1...text()

        //a[text()='Sign in']            [link]
        //label[text()='Email']          [label]
        //button[text()='Reset']         [button]
        //h1[text()='Register']          [header]
        //h1[.='Register']


        //2...contains(,)

        //a[contains(text(),'Sign in into')]    [link]
        //label[contains(text(),'First ')]      [label]
        //td[contains(text(),'Maria ')]         [label]
        //div[contains(@class,'signin')]      [passing contains(@AT,'AV')]



        //3...starts- with(,)

        //td[starts-with(text(),'Maria')]


        //4...normalize.space

        //label[normalize.space(text()=' Username or email address')]

        //5...last

       // (//table[@id="contactList"]/tbody/tr)[last()]

        //6...position
       // (//table[@id="contactList"]/tbody/tr)[position()=2]



        //X-PATH AXES

        //following-sibling

//        driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("abcd");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@maxlength=\"15\"]/following-sibling::input[@type=\"password\"]")).sendKeys("12345");
//        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[.='Francisco Chang']/following-sibling::td[3]/a")).click();

        //driver.findElement(By.xpath("//td[text()='Mexico']/../following-sibling::tr[4]//td[5]/a")).click();

        //preceding-sibling
//        driver.findElement(By.xpath("(//td[text()='5000'])[1]/preceding-sibling::td[text()='Maria Anders']"));
//        driver.findElement(By.xpath("//h4[text()='Beetroot - 1 Kg']/.././preceding-sibling::div/div[3]/button")).click



        //XPATH SHORTCUTS

        //1..text() = .
        //a[contains(.,'Sign in into account')]

        //2...child = /
        //div[@class="container"]/h1

        //3...parent = ..
        //h1[.='Register']/..

        //4...descendent = //
        //table[contains(@id,"contactList")]//td[3]
        //img[@src="/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg"]/following::div[1]
        //div[@class="social-icon"]/following::div[2]/child::img
        //h2[contains(text(),'People Management')]/following::div[4]/child::div/child::ul/child::li[3]
        //span[text()='Active users']/preceding-sibling::h2[text()='5M+']
    }
}
