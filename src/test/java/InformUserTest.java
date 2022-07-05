import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class InformUserTest  extends Methods  {


        @Epic(value = "getUserInfoTest")
        @Feature("InfoUser")
        @Story("Valid info user")
        @Description("User Info")
        @Test
        public void infoUserPositiveTest() throws InterruptedException {

            MyProfilePage myProfilePage = new MyProfilePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            SoftAssert softAssert = new SoftAssert();

            System.out.println(this.getClass().getName() + " " + "started!");

            Thread.sleep(1000);

            loginPage.emailInput.setValue("Lik@mail.ru");
            loginPage.passwordInput.setValue("123456");
            loginPage.buttonLogin.click();
            myProfilePage.myProfileButton.click();

            softAssert.assertTrue(myProfilePage.stringUserNameReg.isDisplayed(), "User name: Lik123");
            softAssert.assertTrue(myProfilePage.stringUserEmailReg.isDisplayed(), "User email: Lik@mail.ru");

        }

        @Epic(value = "getUserInfoTest")
        @Feature("InfoUser")
        @Story("Not valid info user")
        @Description("User not get inform user")
        @Test
        public void infoUserNegativeTest() throws InterruptedException {

            MyProfilePage myProfilePage = new MyProfilePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            SoftAssert softAssert = new SoftAssert();

            System.out.println(this.getClass().getName() + " " + "started!");

            Thread.sleep(1000);

            loginPage.emailInput.setValue("Lik@mail.ru");
            loginPage.passwordInput.setValue("1234567");
            loginPage.buttonLogin.click();
            softAssert.assertTrue(loginPage.errorPassword.isDisplayed(), "password not valid");


        }
    }


