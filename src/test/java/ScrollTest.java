import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

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
        List<MobileElement> scrollObject1 = (List<MobileElement>) driver.findElementsByXPath("//XCUIElementTypeStaticText[@name]");
        List<String> links = new ArrayList<>();
        String size = null;
        for (int i = 0; i < 5; ++i) {
            links.add(scrollObject1.get(i).getAttribute("name"));
            scrollObject.put("direction", "down");
            driver.executeScript("mobile: scroll", scrollObject);
            System.out.println(links.size());
            size = String.valueOf(links.size());
        }
        assertNotEquals(size, "null");
    }

    @Epic(value = "ScrollTest")
    @Feature("ScrollTest")
    @Story("Valid ScrollTest")
    @Description("ScrollTest")
    @Test
    public void scrollPositiveAndroidTest() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        NewsPostPage newsPostPage = new NewsPostPage(driver);


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


        assertTrue(newsPostPage.backButton.isDisplayed());
    }


}









