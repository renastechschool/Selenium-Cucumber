package renastech.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.stepsDefinitions.Hooks;
import renastech.utils.BrowserUtils;

public class Addresses extends BrowserUtils {

    private static final Logger logger = Logger.getLogger(Addresses.class);

    public Addresses(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "address_first_name")
    private WebElement firstName;

    @FindBy(id = "address_last_name")
    private WebElement lastname;

    @FindBy(id = "address_street_address")
    private WebElement address1 ;

    @FindBy(id = "address_secondary_address")
    private WebElement address2;

    @FindBy(id = "address_city")
    private WebElement city;

    @FindBy(id = "address_state")
    private WebElement state;

    @FindBy(id = "address_zip_code")
    private WebElement zipcode;

    @FindBy(id = "address_country_canada")
    private WebElement country;

    @FindBy(id = "address_birthday")
    private WebElement birthday;

    @FindBy(id = "address_age")
    private WebElement age;

    @FindBy(xpath = "//input[@value='Create Address']")
    private WebElement submitButton;


    public void sentInfoOutlineExample(String firstName1, String lastNAme1, String address11){
        staticWait(1);
        firstName.sendKeys(firstName1);
        staticWait(1);
        lastname.sendKeys(lastNAme1);
        staticWait(1);
        address1.sendKeys(address11);
        staticWait(1);

    }

    public void clickSubmitButton(){
        staticWait(1);
        submitButton.click();
    }

    public void setZipcode(String zipcodeName){
        staticWait(1);
        zipcode.sendKeys(zipcodeName);
    }
    public void setCountry(String countryName){
//        staticWait(1);
//        country.click();

      //  clickAndWait(country);
    }

    public void setBirthday(String birthdayDate){
        staticWait(1);
        birthday.sendKeys(birthdayDate);
    }
    public void setAge(String age1){
        staticWait(1);
        age.sendKeys(age1);


   //     waitEnterText(age,age1);


    }


    public void setState(String stateName){
        staticWait(1);
        Select select = new Select(state);
        select.selectByVisibleText(stateName);


    }


    public void setCity(String cityName){
        staticWait(1);
        city.sendKeys(cityName);
    }
    public void setFirstName(String name){
        staticWait(1);
        firstName.sendKeys(name);
    }

    public void setLastname(String lastName){
        staticWait(1);
        lastname.sendKeys(lastName);
    }


    public void setAddress1(String address){
        staticWait(1);
        address1.sendKeys(address);
    }

    public void setAddress2(String address){
        staticWait(1);
        address2.sendKeys(address);
    }



}
