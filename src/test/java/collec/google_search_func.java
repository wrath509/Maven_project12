package collec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search_func {
    private static io.github.bonigarcia.wdm.WebDriverManager WebDriverManager;

    public static void main(String[] args) throws InterruptedException {

        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        driver.findElement(By.name("q")).sendKeys("testing");
        Thread.sleep(3000);
        driver.findElement(By.name("btnk")).click();
    }
}
