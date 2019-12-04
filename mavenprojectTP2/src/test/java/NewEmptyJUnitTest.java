/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Iyadh
 */
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class NewEmptyJUnitTest {



public static void main(String [] args) throws InterruptedException{
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\iviO\\Desktop\\GL\\QA\\TP2\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://mytek.tn/");
    driver.findElement(By.className("login")).click();
    TimeUnit.SECONDS.sleep(5);
    
    WebElement email =driver.findElement(By.xpath("//*[@id=\"email\"]"));
    email.click();
    email.clear();
    email.sendKeys("chaker.iyadh@gmail.com");
    
    WebElement passwd =driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
    passwd.click();
    passwd.clear();
    passwd.sendKeys("maryoul12");
    
    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    TimeUnit.SECONDS.sleep(5);
    
    WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
    search.click();
    search.clear();
    search.sendKeys("Connecteur BNC");
    
    driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
    TimeUnit.SECONDS.sleep(5);
    driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div/div[3]/a")).click();
    TimeUnit.SECONDS.sleep(3);
    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
    
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
    
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
    
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
    
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();

    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
    


}
}