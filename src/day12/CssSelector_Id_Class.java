package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Id_Class {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.libertyshoesonline.com/");
		driver.manage().window().maximize();

		List<WebElement> classselector = driver.findElements(By.cssSelector(".t4s-product-price"));

		for (WebElement class1 : classselector) {
			System.out.println(class1.getText());
		}

		List<WebElement> idselector = driver.findElements(By.cssSelector("#svelte-jk0m5r"));

		for (WebElement id : idselector) {
			System.out.println(id.getText());
		}

	}

}
