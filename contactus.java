package project2;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contactus {
	   @Test()
	    public void contact() throws InterruptedException
	    {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\mithun.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://mobileworld.azurewebsites.net");
	       driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
	       driver.findElement(By.linkText("Contact Us")).click();
	       Set<String> windows = driver.getWindowHandles();
	       Iterator<String> it = windows.iterator();
	       String parentId = it.next();
	       String childId = it.next();
	       driver.switchTo().window(childId);
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mithun gowda");
	       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mithun2504@gmail.com");
	       driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8884833136");
	       driver.findElement(By.name("message")).sendKeys("hello world");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       driver.quit();
	      
	    }
	}




