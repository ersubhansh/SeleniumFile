package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssha7338\\Documents\\netcracker-atp-executor-build-1.4.25\\resources\\components\\webdriver\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("subhanshcoding@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Vidushi1!");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gb_71")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
