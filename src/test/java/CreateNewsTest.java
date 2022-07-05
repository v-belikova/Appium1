import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class CreateNewsTest extends Methods {

        @Epic(value = "CreateNewsTest")
        @Feature("Create News")
        @Story("Valid Create News")
        @Description("Create News")
        @Test
        public void createNewsPositiveTest() throws InterruptedException {

                MyProfilePage myProfilePage = new MyProfilePage(driver);
                LoginPage loginPage = new LoginPage(driver);
                UpdateUserPage updateUserPage = new UpdateUserPage(driver);
                NewsPostPage newsPostPage = new NewsPostPage(driver);
                SoftAssert softAssert = new SoftAssert();

                System.out.println(this.getClass().getName() + " " + "started!");

                Thread.sleep(1000);

                loginPage.emailInput.setValue("Lik@mail.ru");
                loginPage.passwordInput.setValue("123456");
                loginPage.buttonLogin.click();
                myProfilePage.myProfileButton.click();
                myProfilePage.newPostButton.click();
                Thread.sleep(5000);
                newsPostPage.titleInput.setValue("Hello");
                newsPostPage.descriptionInput.setValue("Beautiful live");
                newsPostPage.tagsInput.setValue("live is ....");
                newsPostPage.saveButton.click();

        }

        @Epic(value = "CreateNewsTest")
        @Feature("Create News")
        @Story("Not valid Create News")
        @Description("User not CreateNews")
        @Test
        public void createNewsNegativeTest() throws InterruptedException {

                MyProfilePage myProfilePage = new MyProfilePage(driver);
                NewsPostPage newsPostPage = new NewsPostPage(driver);
                LoginPage loginPage = new LoginPage(driver);
                SoftAssert softAssert = new SoftAssert();

                System.out.println(this.getClass().getName() + " " + "started!");

                loginPage.emailInput.setValue("Lik@");
                loginPage.passwordInput.setValue("123456");
                loginPage.buttonLogin.click();

                softAssert.assertTrue(loginPage.errorLogin.isDisplayed(), "user email must be a well-formed email address");


        }
}
