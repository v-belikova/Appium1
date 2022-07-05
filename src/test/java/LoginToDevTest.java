import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class LoginToDevTest extends Methods {


    @Epic(value = "LoginTest")
    @Feature("Login")
    @Story("Valid registration")
    @Description("User login")
    @Test
    public void loginPositiveTest() throws InterruptedException {

        MyProfilePage myProfilePage = new MyProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();

    }

    @Epic(value = "LoginTest")
    @Feature("Login")
    @Story("Not valid login")
    @Description("User not login")
    @Test
    public void loginNegativeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(this.getClass().getName() + " " + "started!");

        loginPage.emailInput.setValue("Lik@");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        softAssert.assertTrue(loginPage.errorLogin.isDisplayed(), "user email must be a well-formed email address");


    }
}
