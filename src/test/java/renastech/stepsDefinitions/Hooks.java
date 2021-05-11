package renastech.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks  extends BrowserUtils{

    private static final Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void setup(){
          Driver.getDriver();
          logger.info("============Chrome Driver Working fine==============");
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.get(ConfigurationsReader.getProperties("url4"));

    }

    @After
    public void tearsDown(){

         //driver.quit();

    }


    /***
     * Go to this website http://demo.guru99.com/Security/SEC_V1/index.php
     *login with invalid credentials
     *and validate  message "User or Password is not valid"
     *
     *   Requirement:
     *   use log4j in page class
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
     *     // break until 8 pm
     *
     *
     * ***/





}
