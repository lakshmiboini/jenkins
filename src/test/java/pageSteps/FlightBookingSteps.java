package pageSteps;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import pages.FlightBookingPage;

public class FlightBookingSteps {
   FlightBookingPage flightpage;

    @Step
    public void enter_username(){
        flightpage.enterUsername();
    }
    @Step
    public void enterPwd()  {
        flightpage.enterPassword();
    }
    @Step
    public void submit(){
        flightpage.submitBtn();
    }
    @Step
    public void clickingbBtn(){
        flightpage.clickFlightButton();
    }
    @Step
    public void radioBtn(){
        flightpage.radiobutton();
    }
    @Step
    public void addblocking(WebDriver driver){
        try{
            flightpage.addBlock(driver);
        }catch(Exception e){
            System.out.println("The add has not blocked "+" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
    @Step
    public void drop1(){
        flightpage.selectPassengers();
    }
    @Step
    public void drop2(){
        flightpage.selectDeparture();
    }
    @Step
    public void drop3(){
        flightpage.selectMonth();
    }
    @Step
    public void drop4(){
        flightpage.selectDate();
    }
    @Step
    public void drop5(){
        flightpage.selectArrival();
    }
    @Step
    public void drop6(){
        flightpage.selectReturnMonth();
    }
    @Step
    public void drop7(){
        flightpage.selectReturnDate();
    }
    public void clickingbtn1(){
        flightpage.clickServiceClass();
    }
    public void dropdown(){
        flightpage.selectAirline();
    }
    public void continuebutton(){
        flightpage.selectContinue();
    }
}
