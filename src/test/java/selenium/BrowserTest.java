package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\uddin\\selenium\\chromedriver.exe");
      //	System.setProperty("webdriver.gecko.driver","C:\\Users\\uddin\\eclipse-workspace\\hello\\geckodriver-v0.26.0-win64\\geckodriver.exe");

        //WebDriver driver= new FirefoxDriver();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
        driver.get("http://www.yahoo.com");
        String currUrl=driver.getCurrentUrl();
        System.out.println("current url : " +currUrl);
        String s=driver.getTitle();
        System.out.println("title : "+s);
        driver.navigate().to("http://ebfs.bruteforcesolution.net/ebfs/index.php");
        currUrl=driver.getCurrentUrl();
        System.out.println("current url : " +currUrl);
        s=driver.getTitle();
        System.out.println("title : "+s);
        String actual= driver.getCurrentUrl();
        String expected="http://ebfs.bruteforcesolution.net/ebfs/index.php";
        if(expected.equals(actual)) {
            System.out.println("test pass");
        }else {
            System.out.println("test fail");
        }
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.quit();

    }

}
