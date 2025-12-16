package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TooltipTest {
  @Test
  public void f() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    try {
      driver.get("https://www.flipkart.com");
      
      Actions actions = new Actions(driver);
      
      // Flipkart specific tooltip elements
      List<WebElement> tooltipElements = driver.findElements(
          By.xpath("//*[@title] | //*[contains(@class,'_3v1-6')] | //i[contains(@class,'icon')] | "
                 + "//span[contains(@class,'tooltip')] | //*[contains(@class,'_1KRbFB')] | "
                 + "//div[contains(@class,'_2kQMPE')]//following::*[@title]"));
      
      System.out.println("Found " + tooltipElements.size() + " potential tooltip elements on Flipkart:");
      
      for (int i = 0; i < Math.min(10, tooltipElements.size()); i++) {
        WebElement elem = tooltipElements.get(i);
        try {
          String elementTitle = elem.getAttribute("title");
          if (elementTitle != null && !elementTitle.trim().isEmpty()) {
            System.out.println((i+1) + ". Direct title: " + elementTitle);
            continue;
          }
          
          // Hover to trigger dynamic tooltip
          actions.moveToElement(elem).perform();
          Thread.sleep(1500);
          
          // Flipkart tooltip detection
          List<WebElement> tooltips = driver.findElements(
              By.xpath("//div[contains(@class,'tooltipster-box') or contains(@class,'tooltip') "
                     + "or contains(@class,'_2tzWk4') or contains(@class,'popover') "
                     + "or @role='tooltip' or contains(@class,'_1KRbFB')]"));
          
          for (WebElement tooltip : tooltips) {
            if (tooltip.isDisplayed() && tooltip.getText().trim().length() > 0) {
              String tooltipText = tooltip.getText().trim();
              System.out.println((i+1) + ". Tooltip: '" + tooltipText + "'");
              break;
            }
          }
          
        } catch (Exception e) {
          // Skip elements without tooltips
        }
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
      }
      driver.quit();
    }
  }
}
