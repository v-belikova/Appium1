import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class UpdateInformUserTest extends Methods {


    @Epic(value = "UserUpdateInfoTest")
    @Feature("UpdateInfoUser")
    @Story("Valid update info user")
    @Description("User Update Info")
    @Test
    public void infoUpdateUserPositiveTest() throws InterruptedException {

        MyProfilePage myProfilePage = new MyProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        UpdateUserPage updateUserPage = new UpdateUserPage(driver);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);

        loginPage.emailInput.setValue("Long@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        myProfilePage.myProfileButton.click();
        myProfilePage.updateButton.click();
        Thread.sleep(1000);
        updateUserPage.emailUpdateInput.setValue("Long@mail.ru");
        updateUserPage.nameUpdateInput.sendKeys("Long", Keys.ENTER);
        updateUserPage.saveButton.click();
        updateUserPage.backButton.click();


        softAssert.assertTrue(updateUserPage.nameDisplayUpdateInput.isDisplayed(), "User name: Long");
        softAssert.assertTrue(updateUserPage.emailDisplayUpdateInput.isDisplayed(), "User email: Long@mail.ru");

    }

    @Epic(value = "UserUpdateInfoTest")
    @Feature("UpdateInfoUser")
    @Story("Not valid update info user")
    @Description("User not update inform user")
    @Test
    public void infoUpdateUserNegativeTest() throws InterruptedException {

        MyProfilePage myProfilePage = new MyProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        UpdateUserPage updateUserPage = new UpdateUserPage(driver);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);

        loginPage.emailInput.setValue("Long@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        myProfilePage.myProfileButton.click();
        myProfilePage.updateButton.click();
        Thread.sleep(2000);
        updateUserPage.emailUpdateInput.setValue("Long@mail.ru");
        updateUserPage.nameUpdateInput.setValue("+ВЖбцвбцубс1эбмэБмЭУБЙЙ и в ижп пжвты жпыаД тждыар тждпру жьдтпорапьтвр");
        updateUserPage.saveButton.click();

        softAssert.assertTrue(updateUserPage.errorUpdate.isDisplayed(), "USERNAME_SIZE_NOT_VALID");

    }

}



