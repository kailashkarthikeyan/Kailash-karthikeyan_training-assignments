package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationTest {
    @Test
    public void f() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     
        driver.navigate().to("https://www.skyscanner.co.in/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.redbus.in/");
        Thread.sleep(2000);
 
        driver.navigate().back();
        Thread.sleep(2000);
 
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().to("https://www.skyscanner.co.in/");
        Thread.sleep(2000);
 
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();
    }
}
