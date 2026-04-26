package hooks;

import Base.Driverfactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.Screenshotutils;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("HOOK RUNNING");
        Driverfactory.initDriver();
    }
    @After
    public void quit(Scenario scenario) {
        if(scenario.isFailed()) {
            byte[] screenshot = Screenshotutils.screenshot(Driverfactory.driver);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");

        }
        Driverfactory.quitdriver();
    }

}
