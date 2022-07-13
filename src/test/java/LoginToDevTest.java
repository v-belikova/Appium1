import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginToDevTest extends Methods {


    @Epic(value = "LoginTest")
    @Feature("Login")
    @Story("Valid registration")
    @Description("User login")
    @Test
    public void loginPositiveTest() throws InterruptedException {

        MyProfilePage myProfilePage = new MyProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();

      assertTrue(myProfilePage.string1Hello.isDisplayed(), "Hello, Lik123");

    }

    @Epic(value = "LoginTest")
    @Feature("Login")
    @Story("Not valid login")
    @Description("User not login")
    @Test
    public void loginNegativeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);


        System.out.println(this.getClass().getName() + " " + "started!");

        loginPage.emailInput.setValue("Lik@");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();

        assertTrue(loginPage.errorLogin.isDisplayed(), "user email must be a well-formed email address");

    }

    @Epic(value = "LoginTest")
    @Feature("Login")
    @Story("Not valid password")
    @Description("User not login")
    @Test
    public void loginNegative2Test() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);


        System.out.println(this.getClass().getName() + " " + "started!");

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("1234567");
        loginPage.buttonLogin.click();

        assertTrue(loginPage.errorPassword.isDisplayed(), "password not valid");

    }
}
