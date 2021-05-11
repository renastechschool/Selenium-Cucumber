package renastech.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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



    @FindBy(xpath = "//input[@name='uid']")
    private WebElement username2Box;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password2;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement sbtBtn2;

    @FindBy(xpath= "//a[contains(text(),'Mini Statement')]")
    private WebElement miniProject;

    @FindBy(xpath= "//select[@name='accountno']")
    private WebElement selectAccount;

    @FindBy(name="AccSubmit")
    private WebElement smt;

    @FindBy(xpath = "//p[@class='heading3']")
    private WebElement headerMessage;


    public void setUsername2Box(String username){
        staticWait(2);
        username2Box.sendKeys(username);
        logger.info("Enter the username");
    }
    public void setPassword2(String password){
        staticWait(2);
        password2.sendKeys(password);
        logger.info("Entered password");
    }

    public void setSbtBtn2(){
        staticWait(1);
        sbtBtn2.click();
        logger.info("Login the application");
    }

    public void setMiniProject(){
        staticWait(2);
        miniProject.click();
        logger.info("Clicked Mini statement");
    }

    public void setSelectAccount(String accountNumber){

        Select select = new Select(selectAccount);
        select.selectByVisibleText(accountNumber);
        staticWait(1);
        logger.info("Select account number" + accountNumber);
    }

    public void setSmt(){
        staticWait(1);
        smt.click();
        logger.info("Click submit button after select account");
    }


    public void verifyMessage(String expectedMessage){

        String actual = headerMessage.getText();
        Assert.assertEquals("The message are not same",expectedMessage,actual);
        logger.info("Message verified");
    }




}
