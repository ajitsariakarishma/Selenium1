import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailFriend {


    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/WebBroser/chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();

        //maximise the browser window
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com");


        //click on login button
        driver.findElement(By.className("ico-login")).click();

        //enter valid email id
        driver.findElement(By.id("Email")).sendKeys("Testtest4@gmail.com");

        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("london26");

        //click on log in tab
        driver.findElement(By.xpath("//input[@value='Log in']")).click();

        //click on nop commerce icon for opening homepage
        driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();

        //click on imac pro image
        driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']")).click();

        //click on email friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();

        //enter email id of friend
        driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("brightvibrant@yahoo.com");

        //enter message
        driver.findElement(By.id("PersonalMessage")).sendKeys("This is good, try");

        //click on send email button
        driver.findElement(By.xpath("//input[@value='Send email']")).click();

        driver.close();

        // driver.findElement()

    }
}
