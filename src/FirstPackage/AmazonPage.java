package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
    public static void main (String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssha7338\\Documents\\netcracker-atp-executor-build-1.4.25\\resources\\components\\webdriver\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
        Thread.sleep(3000);
        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("TheGiftKart")).click();
        driver.navigate().back();
        driver.close();
    }
}
