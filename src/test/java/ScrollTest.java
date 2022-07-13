import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScrollTest extends Methods {


    @Epic(value = "ScrollTest")
    @Feature("ScrollTest")
    @Story("Valid ScrollTest")
    @Description("ScrollTest")
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
        List<MobileElement> scrollObject1 = (List<MobileElement>) driver.findElementsByXPath("(//XCUIElementTypeOther[@name])");
        List<String> links = new ArrayList<>();
        for (int i = 0; i < 40; ++i) {
            links.add(scrollObject1.get(i).getAttribute("name"));
            scrollObject.put("direction", "down");
            driver.executeScript("mobile: scroll", scrollObject);
            System.out.println(links);

        }
    }

    @Epic(value = "ScrollTest")
    @Feature("ScrollTest")
    @Story("Valid ScrollTest")
    @Description("ScrollTest")
    @Test
    public void scrollPositiveAndroidTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);

        System.out.println(this.getClass().getName() + " " + "started!");

        loginPage.emailInput.setValue("Lik@mail.ru");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonLogin.click();
        myProfilePage.NewsfeedButton.click();
        TouchAction action = new TouchAction(driver);
        int height = driver.manage().window().getSize().height;
        int width = driver.manage().window().getSize().width;
        action.press(PointOption.point(width / 2, height / 2))
                .moveTo(PointOption.point(width / 2, height * 3 / 4)).release().perform();
    }
}







