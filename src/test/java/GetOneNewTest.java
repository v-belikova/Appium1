import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetOneNewTest extends Methods {


    @Epic(value = "getOneNewTest")
    @Feature("getOneNewTest")
    @Story("Valid getOneNewTest")
    @Description("getOneNewTest")
    @Test
    public void getNewsPositiveTest() throws InterruptedException {
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        Thread.sleep(1000);

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        myProfilePage.NewsfeedButton.click();

        MobileElement elementTwo = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeStaticText[@name='TITLE'])[1]");
        List<MobileElement> scrollObject1 = (List<MobileElement>) driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=]");
        List<String> links = new ArrayList<>();
        for (int i = 0; i < 40; ++i) {
            links.add(scrollObject1.get(i).getAttribute("name"));

            System.out.println(links);


        }
    }
}
