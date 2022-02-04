package web_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Second_web_auto {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dri = new ChromeDriver();
     dri.get("https://demo.opencart.com/index.php?route=common/home");
     dri.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) dri;
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

    }
}
