import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeLoginLogout {


    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/WebBroser/chromedriver.exe");

      //open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //type username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //type password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //click on login
        driver.findElement(By.className("button")).click();

        //click on welcome Admin section
        driver.findElement(By.linkText("Welcome Admin")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //click on logout
        driver.findElement(By.linkText("Logout")).click();

    }


}
