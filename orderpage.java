package project2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orderpage {
	
	@Test()
    public void Order() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mithun.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net");
        driver.manage().window().maximize();
        //AllMobiles
        driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//tbody[@id='myTable']/tr[2]/td[5]/a")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("mithun");
        driver.findElement(By.xpath("//body/div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("gowda");
        Thread.sleep(2000);

}
}
