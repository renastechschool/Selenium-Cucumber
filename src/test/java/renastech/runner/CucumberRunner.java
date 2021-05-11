package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "/renastech",
        dryRun=false,  //When it is false it is inactive
        tags = "@guru991",
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",

        }


)
public class CucumberRunner {

}

/**
 *
 *
 *
 *
 *
 *
 * 1: Go to http://demo.guru99.com/Agile_Project/Agi_V1/
 *
 * 2: login with
 *    UserID : 1303
 *    Password : Guru99
 *
 * 3: Go to Mini Statement
 *
 * 4: Select account number  "3308"
 *
 * 5: Submit
 *
 * 6:You need to verify message "Last Three Transaction Details for Account No: 3308"
 *
 * 7: Use log4j
 *
 *     Finish before 9:10 pm
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * ****/
