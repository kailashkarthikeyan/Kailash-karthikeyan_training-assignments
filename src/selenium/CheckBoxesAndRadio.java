package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesAndRadio {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().window().maximize();
		
		//
		WebElement Raiobutton =driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		Raiobutton.click();
		
		//For multiple checkbox
		WebElement CheckBox1 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		CheckBox1.click();
		
		WebElement CheckBox2 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
		CheckBox2.click();
		
		WebElement CheckBox3 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
		CheckBox3.click();
		
		

	}

}
