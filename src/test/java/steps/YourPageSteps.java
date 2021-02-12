package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.NewExperienceLoginPage;
import pagesObject.NewExperiencePurchasePage;
import pagesObject.NewExperienceRegisterPage;

import java.util.List;

public class YourPageSteps {

    NewExperienceRegisterPage newExperienceRegisterPage;
    NewExperienceLoginPage newExperienceLoginPage;
    NewExperiencePurchasePage newExperiencePurchasePage;

    @Step
    public void openPage() {
        newExperienceRegisterPage.open();
    }

    @Step
    public void IclickingOnSingIn() {
        newExperienceRegisterPage.clickOnSingIn();
    }

    @Step
    public void typeEmail(String email) {
        newExperienceLoginPage.typeMyEmail(email);
    }

    @Step
    public void createAccount(){
        newExperienceLoginPage.createAccount();
    }

    @Step
    public void typeMyInfo(List<String> parameters){

        newExperienceLoginPage.typeMyPersonalInfo(parameters);
    }

    @Step
    public void clickOnRegister(){
        newExperienceLoginPage.clickingOnRegister();
    }

    @Step
    public void verify(String name, String lastName){
        newExperienceLoginPage.verifySuccessRegister(name, lastName);
    }

    @Step
    public void chooseAProduct() {
        newExperiencePurchasePage.clickOptionWomen();
        newExperiencePurchasePage.chooseProduct();

    }

    @Step
    public void addToCart(){
        newExperiencePurchasePage.addToCart();

    }

    @Step
    public void finishPurchase(){
       newExperiencePurchasePage.clickOnProcessCarrierButton();
    }

    @Step
    public void checkOut(){
        newExperiencePurchasePage.doingCheckOut();
    }

    @Step
    public void verifyPurchase(String parameter){
        newExperiencePurchasePage.verifyPurchase(parameter);
    }

}
