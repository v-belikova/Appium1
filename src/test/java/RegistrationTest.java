import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTest extends Methods{



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

        //skipStartCarousel();//?
        Thread.sleep(1000);
        driver.hideKeyboard();

        registrationPage.buttonRegister.click();

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.avatarChooseReg.click();
        registrationPage.emailInputReg.sendKeys(generateRandomHexString(5) + "@mail.ru");
        registrationPage.nameInputReg.sendKeys("Viktoria123");
        registrationPage.passwordInputReg.sendKeys(generateRandomHexString(7));

        registrationPage.buttonRegister.click();

        registrationPage.goBackButton.click();


    }
    @Epic(value = "RegistrationTest")
    @Feature("Registration")
    @Story("Not valid registration")
    @Description("User not registration")
    @Test
    public void registrationNegativeTest() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");

        SoftAssert softAssert = new SoftAssert();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        Thread.sleep(1000);
        driver.hideKeyboard();

        registrationPage.buttonRegister.click();

        registrationPage.avatarReg.click();
        registrationPage.avatarChoicePictureReg.click();
        registrationPage.avatarChooseReg.click();
        registrationPage.emailInputReg.sendKeys(generateRandomHexString(5) + "ru");
        registrationPage.nameInputReg.sendKeys("Viktoria123");
        registrationPage.passwordInputReg.sendKeys(generateRandomHexString(7));

        registrationPage.buttonRegister.click();

        registrationPage.goBackButton.click();

    }
}

