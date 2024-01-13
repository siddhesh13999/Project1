package project1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorldTest {

//    @Test
//    public void testHelloWorld() {
//    	WebDriverManager.firefoxdriver().setup();
//
//        // Create a new instance of the FirefoxDriver
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com");
//        System.out.println("Hello, Selenium and TestNG!");
//        driver.quit();
//     
//    }
    @Test
    public void testHelloWorld() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://justbooks.in/signup");
		Thread.sleep(200);
		
		WebElement firstname = driver.findElement(By.xpath("//div[@id='__next']/div[1]/div[2]/form/div[1]/input"));
		firstname.sendKeys("Albus");
		
//		WebElement lastname = driver.findElement(By.xpath("//div[@id='__next']/div[1]/div[2]/form/div[2]/input"));
//		lastname.sendKeys("Dumbledore");
		
		WebElement email = driver.findElement(By.xpath("//div[@id='__next']/div[1]/div[2]/form/div[3]/input"));
		email.sendKeys("albus@gmail.com");
		
		
		driver.findElement(By.xpath("//div[@id='__next']/div[1]/div[2]/form/div[6]")).click();
		
//		WebElement lblError = driver.findElement(By.id("lblMsg"));
//		String actError = lblError.getText();
//		assertEquals(actError, "Invalid Username/Password");
	}        
        
}