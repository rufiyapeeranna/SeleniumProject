package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverfactory {
    public static WebDriver driver;


    public static WebDriver initDriver() {

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        return driver;
    }
     public static void quitdriver()

     {

        driver.quit();
    }
}
