import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScrollTest extends Methods {


    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Valid registration")
    @Description("User registration")
    @Test
    public void scrollPositiveTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        myProfilePage.NewsfeedButton.click();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        driver.executeScript("mobile: scroll", scrollObject);

    }

}
