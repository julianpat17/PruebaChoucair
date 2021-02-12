package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewExperienceLoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='email_create']")
    WebElementFacade emailBox;

    @FindBy(xpath = "//*[@id='SubmitCreate']/span")
    WebElementFacade btnCreateAccount;

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElementFacade radioBtnMr;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElementFacade firstNameBox;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElementFacade lastNameBox;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade passBox;

    @FindBy(xpath = "//*[@id='uniform-days']")
    WebElementFacade selectDays;

    @FindBy(xpath = "//*[@id='days']/option[2]")
    WebElementFacade selectDaysNum;

    @FindBy(xpath = "//*[@id='uniform-months']")
    WebElementFacade selectMoths;

    @FindBy(xpath = "//*[@id='months']/option[2]")
    WebElementFacade selectMonthsOption;

    @FindBy(xpath = "//*[@id='uniform-years']")
    WebElementFacade selectYears;

    @FindBy(xpath = "//*[@id='years']/option[2]")
    WebElementFacade selectYearsOption;

    @FindBy(xpath = "//input[@id='company']")
    WebElementFacade companyBox;

    @FindBy(xpath = "//input[@id='address1']")
    WebElementFacade addressOneBox;

    @FindBy(xpath = "//input[@id='address2']")
    WebElementFacade addressTwoBox;

    @FindBy(xpath = "//input[@id='city']")
    WebElementFacade cityBox;

    @FindBy(xpath = "//*[@id='uniform-id_state']")
    WebElementFacade selectState;

    @FindBy(xpath = "//*[@id='id_state']/option[3]")
    WebElementFacade selectStateOption;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElementFacade postalCode;

    @FindBy(xpath = "//*[@id='uniform-id_country']")
    WebElementFacade selectCountry;

    @FindBy(xpath = "//*[@id='id_country']/option[2]")
    WebElementFacade selectCountryOption;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElementFacade otherInfoBox;

    @FindBy(xpath = "//input[@id='phone']")
    WebElementFacade homePhoneBox;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElementFacade mobilePhoneBox;

    @FindBy(xpath = "//input[@id='alias']")
    WebElementFacade aliasBox;

    @FindBy(xpath = "//span[text()='Register']")
    WebElementFacade btnRegister;

    @FindBy(xpath = "//p[@class='info-account']")
    WebElementFacade labelToVerifyTheSuccessTest;


    public void typeMyEmail(String email) {
        emailBox.type(email);
    }

    public void createAccount() {
        waitFor(btnCreateAccount).waitUntilEnabled().and().click();
    }

    public void typeMyPersonalInfo(List<String> parameters) {

        Actions actions = new Actions(getDriver());
        radioBtnMr.click();
        firstNameBox.type(parameters.get(0));
        lastNameBox.type(parameters.get(1));
        passBox.type(parameters.get(2));
        selectDays.click();
        selectDaysNum.click();
        actions.moveToElement(selectMoths).click().perform();
        selectMonthsOption.click();
        actions.moveToElement(selectYears).click().perform();
        selectYearsOption.click();
        companyBox.type(parameters.get(3));
        addressOneBox.type(parameters.get(4));
        addressTwoBox.type(parameters.get(5));
        cityBox.type(parameters.get(6));
        selectState.click();
        selectStateOption.click();
        actions.moveToElement(postalCode).click().perform();
        postalCode.type(parameters.get(7));
        selectCountry.click();
        selectCountryOption.click();
        otherInfoBox.type(parameters.get(8));
        homePhoneBox.type(parameters.get(9));
        mobilePhoneBox.type(parameters.get(10));
        aliasBox.type(parameters.get(11));
    }

    public void clickingOnRegister() {
        btnRegister.click();
    }


    public void verifySuccessRegister(String name, String lastName) {


        WebElementFacade currentUser = $("//span[text()='"+name+""+" "+""+lastName+"']");
        System.out.println(currentUser.getText());
        if( currentUser.isCurrentlyVisible() ){
            System.out.println("The corrent user is: "+name +lastName);
        }else {
            Assert.fail("the user is not logged");
        }

    }
}
