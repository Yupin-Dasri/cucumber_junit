package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //run everytime before each scenarios
    @Before(order = 2)
    public void setUpScenario() {
        System.out.println("Setting up browser with further details...");
    }


    @Before(value = "@db", order = 1)
    // run scenario that have this @db tag and run this one before @before order1 **we can control it
    public void setUpDatabase() {
        System.out.println("CONNECTING TO DATABASE");
    }

    @BeforeStep
    public void runsBeforeStep() {
        System.out.println("Run before each step");
    }


    @AfterStep
    public void runsAfterSteps() {
        System.out.println("Run after each step");
    }

    @After(value = "@db", order = 1)
    public void tearDownScenario() {
        System.out.println("Closing the browser");
        System.out.println("Taking screen shot");
    }

    //run everytime after each scenarios
    @After(order = 2)
    public void tearDownScenario(Scenario scenario) {

        //if my scenario failed
        //go and take screen shot
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }



}
