package StepDefinition;

import Base.Driverfactory;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    LoginPage page;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driverfactory.driver.get("https://www.website.com/sign-in/?source=SC&country=IN");
        page=new LoginPage(Driverfactory.driver);
    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password()
    {
        page.enterUsername("rufiya");
        page.enterpassword("peeranna");
    }
    @And("user should click on submit")
    public void  user_should_click_on_submit()
    {
        page.submit();
    }
    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page()
    {
        System.out.println("Login successful");
    }


}
