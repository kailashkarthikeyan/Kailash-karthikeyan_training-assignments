package day12;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name:Chrome/Firefox/Edge");
		String browsername=sc.nextLine();
		
		WebDriver driver=null;
		
		if(browsername.equalsIgnoreCase("Chrome"))
			driver=new ChromeDriver();
		else if(browsername.equalsIgnoreCase("Firefox"))
			driver=new FirefoxDriver();
		else if(browsername.equalsIgnoreCase("Edge"))
			driver=new EdgeDriver();
		else
		{
			System.out.println("Invalid browser");
			return;
		}
		driver.manage().window().maximize();
		driver.get("https://www.puma.com/");
		driver.quit();
	}

}
