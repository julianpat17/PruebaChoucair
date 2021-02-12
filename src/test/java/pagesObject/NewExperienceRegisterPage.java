package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class NewExperienceRegisterPage extends PageObject {


    @FindBy(xpath = "//a[@class='login']")
    WebElementFacade btnSingIn;

    public void clickOnSingIn(){
        btnSingIn.click();
    }
}
