package web_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Asus\\Downloads\\SimpleAlert.html");
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();
        Thread.sleep(3960);
    }
}
