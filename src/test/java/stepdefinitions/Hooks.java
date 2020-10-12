package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){
    }
    @After
    public void teraDown(Scenario scenario){
        final byte [] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            if(scenario.isFailed()){
                scenario.attach(screenshoot, "image/png","screenshoots");
        }
            Driver.closeDriver();
    }
}
