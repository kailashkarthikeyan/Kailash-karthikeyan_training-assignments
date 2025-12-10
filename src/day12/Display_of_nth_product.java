package day12;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_of_nth_product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        while(true) {
            
            System.out.println("1. Laptop (7th product)");
            System.out.println("2. TV (13th product)"); 
            System.out.println("3. Smart Phone (2nd product)");
            System.out.println("4. Exit");
            System.out.print("Choose option (1-4): ");
            
            int choice = sc.nextInt();
            
            if(choice == 4) {
                System.out.println("Exiting...");
                break;
            }
            
            String product = "";
            int nthPosition = 0;
            
            switch(choice) {
                case 1: 
                    product = "Laptop";
                    nthPosition = 7; 
                    break;
                case 2: 
                    product = "TV";
                    nthPosition = 13; 
                    break;
                case 3: 
                    product = "Smart Phone";
                    nthPosition = 2; 
                    break;
                default: 
                    System.out.println("Invalid choice!");
                    continue;
            }
            
            // Search product
            WebElement type = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
            type.clear();
            type.sendKeys(product);
            
            WebElement search = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
            search.click();
            
            // Get predefined nth product automatically
            String dynamicXpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[" + nthPosition + "]/div/div/div/a/div[2]/div[1]/div[2]";
            WebElement display = driver.findElement(By.xpath(dynamicXpath));
            
            System.out.println(product + " - " + nthPosition + "th product: " + display.getText());
            // display.click();  // Uncomment if you want to click
        }
        
        driver.quit();
        sc.close();
    }
}
