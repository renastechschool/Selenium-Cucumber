package renastech.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.stepsDefinitions.Guru99Login;
import renastech.utils.BrowserUtils;

public class Guru99Page extends BrowserUtils {

    public Guru99Page(){
        PageFactory.initElements(driver,this);
    }

    private static final Logger logger = Logger.getLogger(Guru99Page.class);

    @FindBy(xpath = "//input[@name='uid']")
    private WebElement usernameBox;

    @FindBy(xpath ="//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement sbtBtn;

    public void setUsernameBox(String username){
        staticWait(2);
        usernameBox.sendKeys(username);

    }

    public void setPassword(String pass){
        staticWait(2);
        logger.info("Entering password");
        password.sendKeys(pass);

    }

    public void setSbtBtn(){
        staticWait(1);
        logger.info("clicking button");
        sbtBtn.click();
    }


    public void switchToAlert(String expectedMessage){

        staticWait(2);
        String alertText = driver.switchTo().alert().getText();
        logger.info("Switching the alert");
        Assert.assertEquals("The alert message are not same ",expectedMessage,alertText);

        driver.switchTo().alert().accept();
    }



}
