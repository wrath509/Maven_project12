package web_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class First_web_test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dri = new ChromeDriver();
        dri.get("https://the-internet.herokuapp.com");
     /*   dri.manage().window().maximize();*/
        dri.findElement(By.linkText( "Add/Remove Elements")).click();
        dri.findElement(By.xpath("//button[text()='Add Element']")).click();

      /*  List<WebElement> lst = dri.findElements(By.xpath("//input[@type='checkbox']"));
        lst.get(0).click();*/
    }
}
