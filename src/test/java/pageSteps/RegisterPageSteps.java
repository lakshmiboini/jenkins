package pageSteps;

import net.thucydides.core.annotations.Step;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterPageSteps {
private RegisterPage registerPage;

     @Step
    public void isOnDemoPage(){
        registerPage.open();
    }
@Step
public void validateAssert()
{
    registerPage.setAssert();
}
    @Step
    public void setRegisterPage()
    {
        registerPage.clickRegister();
    }
    @Step
    public void setCreateAccount()
    {
        try {
            registerPage.createAccount();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Step
    public void getAccPageTitle()
    {
        registerPage.getPageTitle();
    }
    @Step
    public void submitBtn()
    {
        registerPage.clickonSubmit();

    }
    @Step
    public void signOff()
    {
        registerPage.logout();
    }

}
