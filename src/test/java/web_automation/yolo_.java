package web_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yolo_ {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dri = new ChromeDriver();
        dri.get("C:\\Users\\Asus\\Downloads\\prompt.html");
        dri.findElement(By.xpath("//*[text()='click or me']")).click();
        Thread.sleep(3960);
        dri.switchTo().alert().sendKeys("Ishan");
        Thread.sleep(3060);
        dri.switchTo().alert().dismiss();
    }
}
