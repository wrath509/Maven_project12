package sel_auto;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class demo {
    @Test
    public void textverify()
    {
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,"Your Store");
        System.out.println("Test Case Passed");
    }
}
