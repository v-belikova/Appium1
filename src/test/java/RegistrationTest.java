import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationTest extends Methods {


    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Valid registration")
    @Description("User registration")
    @Test
    public void registrationPositiveTest() throws InterruptedException {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);
        registrationPage.buttonRegister.click();
        Thread.sleep(5000);

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.choicePicturesAvatar.click();
        registrationPage.emailInputReg.setValue(generateRandomHexString(7) + "@mail.ru");
        registrationPage.nameInputReg.setValue("Viktoria123");
        registrationPage.passwordInputReg.sendKeys(generateRandomHexString(7), Keys.ENTER);
        registrationPage.buttonRegister.click();
        registrationPage.goBackButton.click();
        Thread.sleep(5000);

        softAssert.assertTrue(myProfilePage.stringHello.isDisplayed(), "Hello, Viktoria123");


    }

    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Not valid email")
    @Description("User not registration")
    @Test
    public void registrationNegativeTest() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);
        registrationPage.buttonRegister.click();
        Thread.sleep(5000);

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.choicePicturesAvatar.click();
        registrationPage.emailInputReg.sendKeys(generateRandomHexString(5));
        registrationPage.nameInputReg.sendKeys("Viktoria123");
        registrationPage.passwordInputReg.sendKeys(generateRandomHexString(7), Keys.ENTER);
        registrationPage.buttonRegister.click();
        registrationPage.goBackButton.click();

        assertTrue(registrationPage.errorEmail.isDisplayed(), "Log in or register");

    }

    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Not valid user name")
    @Description("User not registration")
    @Test
    public void registrationNegative2Test() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);
        registrationPage.buttonRegister.click();
        Thread.sleep(5000);

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.choicePicturesAvatar.click();
        registrationPage.emailInputReg.sendKeys(generateRandomHexString(5) + "@mail.ru");
        registrationPage.nameInputReg.sendKeys("hfghgjhlhgshglna.gn l jjei jtgjl lj joijldhjljhll lldsflb kldflgkl lkn nlghl");
        registrationPage.passwordInputReg.sendKeys(generateRandomHexString(7), Keys.ENTER);
        registrationPage.buttonRegister.click();
        registrationPage.goBackButton.click();

        assertTrue(registrationPage.errorEmail.isDisplayed(), "Log in or register");

    }

    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Not valid password")
    @Description("User not registration")
    @Test
    public void registrationNegative3Test() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);
        registrationPage.buttonRegister.click();
        Thread.sleep(5000);

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.choicePicturesAvatar.click();
        registrationPage.emailInputReg.sendKeys(generateRandomHexString(5) + "@mail.ru");
        registrationPage.nameInputReg.sendKeys("Vermut");
        registrationPage.passwordInputReg.sendKeys("");
        registrationPage.buttonRegister.click();
        registrationPage.goBackButton.click();

        assertTrue(registrationPage.errorEmail.isDisplayed(), "Log in or register");

    }
}

