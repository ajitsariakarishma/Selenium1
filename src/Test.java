import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    protected static WebDriver driver ;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/WebBroser/chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com");

        //click on 'Register' button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Venus");

        //enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");

        //enter email
        driver.findElement(By.name("Email")).sendKeys("Testtest6@gmail.com");

        //enter password
        driver.findElement(By.id("Password")).sendKeys("london26");

        //enter confirm password
        driver.findElement(By.xpath("//input[@name=\'ConfirmPassword']")).sendKeys("london26");

        //click on register button
        driver.findElement(By.xpath("//input[@type='submit' and @name='register-button']")).click();


        //set implicity wait for driver object
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);


        //trying to view the confirmation message but unable to do so, plz assist



       //close the driver
        driver.close();




    }
}
