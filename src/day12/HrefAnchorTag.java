package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefAnchorTag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zepto.com/");
		driver.manage().window().maximize();
		
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		
		
		for(WebElement anchor:tags)
		{
			String hrefValue =anchor.getAttribute("href");
			String anchorText=anchor.getText();
			
			if(hrefValue != null && !hrefValue.isEmpty()) {
                System.out.println("Text: '" + anchorText + "' → href: " + hrefValue);
            }
        }
		System.out.println("Total no of tags"+ tags.size());
		}

	}

