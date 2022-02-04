package web_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Boolean bol = driver.findElement(By.name("emails")).isDisplayed();
        if(bol)
        {
            System.out.println("Testcase is passed");
        }
        else
        {
            System.out.println("Testcase is Failed");
        }
    }
}
