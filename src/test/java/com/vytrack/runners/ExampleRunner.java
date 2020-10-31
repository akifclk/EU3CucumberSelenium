package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        //tags = "@driver and @VYT-123"
        //tags = {"@driver","@VYT-123"} old syntax
        //tags = "@driver, @store_manager" old syntax it is not using anymore, it means OR
        //tags = "@driver or @VYT-123"
        tags = "@login and not @wip" //not run @wip tag
)
public class ExampleRunner {
}