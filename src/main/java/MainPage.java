import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // header buttons
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'MAIN_HEADER:HEADER_LOGO')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"MAIN_HEADER:HEADER_LOGO\"`]/XCUIElementTypeImage")
    public MobileElement headerLogo;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TITLE_HEADER:HEADER_TEXT')]")
    @iOSXCUITFindBy(accessibility = "TITLE_HEADER:HEADER_TEXT")
    public MobileElement headerText;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TITLE_HEADER:CHAT_LOGO_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "TITLE_HEADER:CHAT_LOGO_BUTTON")
    public MobileElement chatButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TITLE_HEADER:PROFILE_ICON')]")
    @iOSXCUITFindBy(accessibility = "TITLE_HEADER:PROFILE_ICON")
    public MobileElement profileButton;

    // welcome view
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'text1')]")
    @iOSXCUITFindBy(accessibility = "text1")
    public MobileElement welcomeHeader;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'text2')]")
    @iOSXCUITFindBy(accessibility = "text2")
    public MobileElement welcomeDescription;

    // bottom buttons
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TAB_BUTTON:MAIN_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "Главная, tab, 1 of 5")
    public MobileElement mainButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TAB_BUTTON:MY_AUTO_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "Мои авто, tab, 2 of 5")
    public MobileElement myAutoButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TAB_BUTTON:MOBIKEY_TAB')]")
    @iOSXCUITFindBy(accessibility = "TAB_BUTTON:MOBIKEY_TAB")
    public MobileElement loginButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TAB_BUTTON:SERVICES_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement servicesButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'TAB_BUTTON:MARKET_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "Маркет, tab, 5 of 5")
    public MobileElement marketButton;

}
