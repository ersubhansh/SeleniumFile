package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ssha7338\\Documents\\netcracker-atp-executor-build-1.4.25\\resources\\components\\webdriver\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("q")).sendKeys("Subhansh");
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
    }
}
