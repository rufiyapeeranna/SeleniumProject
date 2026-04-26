package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public  LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement pwd;

    @FindBy(id="signin-submit2")
    WebElement button;

    public void enterUsername(String user)
    {
        username.sendKeys(user);
    }
    public void enterpassword(String password)
    {
        pwd.sendKeys(password);
    }
    public  void submit()
    {
        button.click();
    }

}
