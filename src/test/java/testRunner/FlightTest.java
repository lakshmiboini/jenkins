package testRunner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageSteps.FlightBookingSteps;
import pageSteps.RegisterPageSteps;

@RunWith(SerenityRunner.class)
public class FlightTest {



    @Steps
    RegisterPageSteps registerPageSteps;

    @Steps
    FlightBookingSteps flightBookingSteps;
    @Managed
    WebDriver driver;
    @Title("login and booking tickets sucessfully and logout")
    @Test
    public void validating() throws InterruptedException {


       registerPageSteps.isOnDemoPage();
        flightBookingSteps.enter_username();
        flightBookingSteps.enterPwd();
        flightBookingSteps.submit();
        flightBookingSteps.clickingbBtn();
        flightBookingSteps.addblocking(driver);
        Thread.sleep(4000);
       flightBookingSteps.radioBtn();
        flightBookingSteps.drop1();
        flightBookingSteps.drop2();
       flightBookingSteps.drop3();
        flightBookingSteps.drop4();
        flightBookingSteps.drop5();
        flightBookingSteps.drop6();
        flightBookingSteps.drop7();
        flightBookingSteps.clickingbtn1();
        flightBookingSteps.dropdown();
        flightBookingSteps.continuebutton();


    }
}
