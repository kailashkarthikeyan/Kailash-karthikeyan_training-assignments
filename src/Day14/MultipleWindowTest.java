package Day14;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleWindowTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice");
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  
	  WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.id("openwindow")));
	  search.click();
	  String parentWindow=driver.getWindowHandle();
	  
	  Set<String>windows=driver.getWindowHandles();
	  
	  for(String eachwindow:windows)
	  {
		  if(!parentWindow.equals(eachwindow))
		  {
			  driver.switchTo().window(eachwindow);
			  
		  }
	  }
	  String offerText=driver.findElement(By.cssSelector("section > div > div > div > div.section-title.mt-50 > h2\n")).getText();
	  System.out.println(offerText);
	  
	  driver.switchTo().window(parentWindow);
	  
	  WebElement search1=wait.until(ExpectedConditions.elementToBeClickable(By.id("opentab")));
	  search1.click();
	  String parentWindow1=driver.getWindowHandle();
	  
	  Set<String>windows1=driver.getWindowHandles();
	  
	  for(String eachwindow1:windows1)
	  {
		  if(!parentWindow1.equals(eachwindow1))
		  {
			  driver.switchTo().window(eachwindow1);
			  
		  }
	  }
	  String offerText1=driver.findElement(By.cssSelector("section > div > div > div > div.section-title.mt-50 > h2\n")).getText();
	  System.out.println(offerText1);
	  
	  
  }
}
