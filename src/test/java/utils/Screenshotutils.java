package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutils {

    public static byte[] screenshot(WebDriver driver)
    {
       return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
