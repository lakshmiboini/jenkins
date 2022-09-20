package pages;

import net.serenitybdd.core.pages.PageObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RegisterPage extends PageObject {

public void setAssert(){
    Assert.assertTrue("Welcome: Mercury Tours".equals(getTitle()));
}
    public void clickRegister(){

        $(By.xpath("//a[text()='REGISTER']")).click();
    }
    public void createAccount() throws IOException, InvalidFormatException {

        ExcelReader reader=new ExcelReader();
        List<Map<String,String>> data=reader.getData("src/test/resources/testData/demodata.xlsx","Sheet1");
        $(By.name("firstName")).sendKeys(data.get(0).get("FirstName"));
        $(By.name("lastName")).sendKeys(data.get(0).get("LastName"));
        $(By.xpath("//input[@name='phone']")).sendKeys(data.get(0).get("Phone"));
        $(By.id("userName")).sendKeys(data.get(0).get("Email"));
        $(By.name("address1")).sendKeys(data.get(0).get("Address"));
        $("//input[@name='city']").sendKeys(data.get(0).get("City"));
        $("//input[@name='state']").sendKeys(data.get(0).get("State"));
        $(By.name("postalCode")).sendKeys(data.get(0).get("PostalCode"));
        $("//select[@name='country']").selectByVisibleText(data.get(0).get("Country"));
        $("//input[@id='email']").sendKeys(data.get(0).get("UserName"));
        $("//input[@name='password']").sendKeys(data.get(0).get("Password"));
        $("//input[@name='confirmPassword']").sendKeys(data.get(0).get("ConfirmPassword"));
    }
    public void getPageTitle()
    {  Assert.assertTrue(getTitle().equals("Register: Mercury Tours"));
    }
    public void clickonSubmit(){
        $(By.name("submit")).click();
    }

   public void logout(){
        $("//a[text()='SIGN-OFF']").click();
   }

}
