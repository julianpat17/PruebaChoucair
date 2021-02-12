package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.YourPageSteps;

import java.util.List;

public class YourPageDefinitions {

    @Steps
    YourPageSteps yourPageSteps;

    @Given("^I open the main page$")
    public void iOpenTheMainPage() {
        yourPageSteps.openPage();
    }

    @Given("^Click on sign in link$")
    public void clickOnSignInLink() {
        yourPageSteps.IclickingOnSingIn();
    }

    @When("^I type my email (.*) address in Create and account section\\.$")
    public void iTypeMyEmailAddressInCreateAndAccountSection(String email) {
        yourPageSteps.typeEmail(email);
    }

    @When("^Click on Create an Account button\\.$")
    public void clickOnCreateAnAccountButton() {
        yourPageSteps.createAccount();
    }

    @When("^Type my Personal Information (.*) , Address and Contact inf\\.$")
    public void typeMyPersonalInformationAddressAndContactInf(List<String> parameters) {
        yourPageSteps.typeMyInfo(parameters);
    }

    @When("^Click on Register button\\.$")
    public void clickOnRegisterButton() {
        yourPageSteps.clickOnRegister();
    }

    @Then("^I check that the user was registered (.*),(.*)$")
    public void iCheckThatTheUserWasRegisteredNameLastName(String name, String lastName) {
        yourPageSteps.verify(name,lastName);

    }

    @Given("^I choose a product$")
    public void iChooseAProduct() {
        yourPageSteps.chooseAProduct();

    }

    @And("^I add to the product to the cart$")
    public void iAddToTheProductToTheCart() {
        yourPageSteps.addToCart();
    }

    @When("^I do the purchase$")
    public void iDoThePurchase() {
        yourPageSteps.finishPurchase();
        yourPageSteps.checkOut();
    }

    @Then("^I got a purchase confirmation(.*)$")
    public void iGotAPurchaseConfirmation(String parameter) {

    }



}
