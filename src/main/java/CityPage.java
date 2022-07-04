import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class CityPage {

    public CityPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Bottom Sheet")
    @iOSXCUITFindBy(accessibility = "Bottom Sheet")
    public MobileElement citiesPopUp;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'SELECT_CITY_MODAL:CITY_MODAL_HEADER_TEXT')]")
    @iOSXCUITFindBy(accessibility = "SELECT_CITY_MODAL:CITY_MODAL_HEADER_TEXT")
    public MobileElement cityHeaderText;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "SELECT_CITY_MODAL:CITY_INPUT")
    public MobileElement searchInput;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'SELECT_CITY_MODAL:CITY_0')]")
    @iOSXCUITFindBy(accessibility = "SELECT_CITY_MODAL:CITY_0")
    public MobileElement firstCity;
}
