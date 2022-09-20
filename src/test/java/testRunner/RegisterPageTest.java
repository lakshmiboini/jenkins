package testRunner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageSteps.RegisterPageSteps;
import pages.RegisterPage;

@RunWith(SerenityRunner.class)
public class RegisterPageTest {

    @Steps
    RegisterPageSteps registerPageSteps;

    @Managed()
    WebDriver browser;

    @Test
    public void appLoginTest(){
        registerPageSteps.isOnDemoPage();
        registerPageSteps.validateAssert();
        registerPageSteps.setRegisterPage();
        registerPageSteps.setCreateAccount();
        registerPageSteps.getAccPageTitle();
        registerPageSteps.submitBtn();
        registerPageSteps.signOff();
    }



}