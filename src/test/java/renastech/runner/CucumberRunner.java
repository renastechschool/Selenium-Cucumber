package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "/renastech/stepsDefinitions",
        dryRun=true,
        tags = "@TC_3"


)
public class CucumberRunner {








}