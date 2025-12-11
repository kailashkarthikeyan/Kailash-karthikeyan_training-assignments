package day13;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultiSelectDropdownTest {
    @Test
    public void f() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mobiscroll.com/select/multiple-select");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1) Click the visible field (span overlay) - not the hidden input
        WebElement field = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[contains(@class,'mbsc-textfield-tags')]")
        ));
        field.click();

        // 2) Select "Books"
        WebElement books = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[normalize-space(text())='Books']")
        ));
        books.click();

        // 3) Select "Movies, Music & Games"
        WebElement mmg = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[normalize-space(text())='Movies, Music & Games']")
        ));
        mmg.click();

        // 4) Click the Set button
        WebElement setBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[normalize-space(text())='Set']")
        ));
        setBtn.click();

        driver.quit();
    }
}
