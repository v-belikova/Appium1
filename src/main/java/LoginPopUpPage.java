import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopUpPage {

    public LoginPopUpPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'AUTH_HEADER:CLOSE_MODAL_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "AUTH_HEADER:CLOSE_MODAL_BUTTON")
    public MobileElement closeButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:AUTH_HEADER_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:AUTH_HEADER_TEXT")
    public MobileElement welcomeToText;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:AUTH_HEADER_IMG')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:AUTH_HEADER_IMG")
    public MobileElement welcomeToImg;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:INPUT_TITLE_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:INPUT_TITLE_TEXT")
    public MobileElement phoneHeaderText;
    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:PHONE_INPUT")
    public MobileElement phoneInput;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:ALL_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:ALL_TEXT")
    public MobileElement acceptText;
    // documents
    @AndroidFindBy(xpath = "//*[contains(@text, 'ConsentProcessPersData.pdf')]")
    @iOSXCUITFindBy(iOSNsPredicate = "value contains 'api.mobility.hyundai.ru, безопасное и проверенное подключение'")
    public MobileElement consentHeader;
    @AndroidFindBy(xpath = "//*[contains(@text, 'UserAgreement.pdf')]")
    @iOSXCUITFindBy(iOSNsPredicate = "value contains 'api.mobility.hyundai.ru, безопасное и проверенное подключение'")
    public MobileElement agreementHeader;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'com.google.android.apps.docs:id/projector_toolbar')]")
    @iOSXCUITFindBy(accessibility = "Показать панель инструментов")
    public MobileElement documentHeader;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:CHECKBOX')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:CHECKBOX")
    public MobileElement checkbox;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_INPUT_SCREEN:BUTTON_CONTINUE')]")
    @iOSXCUITFindBy(accessibility = "PHONE_INPUT_SCREEN:BUTTON_CONTINUE")
    public MobileElement continueButton;

    // prod/dev modal
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(accessibility = "Вам предоставлен доступ к DEV окружению")
    public MobileElement modalHeaderText;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Остаться на PROD")
    public MobileElement prodButton;
    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(accessibility = "Переключиться на DEV")
    public MobileElement devButton;

    // enter code page
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:AUTH_HEADER_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:AUTH_HEADER_TEXT")
    public MobileElement codeWelcomeToText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:AUTH_HEADER_IMG')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:AUTH_HEADER_IMG")
    public MobileElement codeWelcomeToImg;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:INPUT_TITLE_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:INPUT_TITLE_TEXT")
    public MobileElement codePhoneHeaderText;
    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and @enabled = 'false']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`name == \"PHONE_DIGITS_CODE_SCREEN:PHONE_INPUT\"`]")
    public MobileElement enteredPhoneNumber;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:CODE_INPUT_TITLE_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:CODE_INPUT_TITLE_TEXT")
    public MobileElement devCodeInputHeaderText;
    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and @enabled = 'true']")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:CODE_INPUT")
    public MobileElement devCodeInput;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:TIMER_TEXT')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:TIMER_TEXT")
    public MobileElement timerText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:REFRESH_TIMER_IMG')]")
    @iOSXCUITFindBy(accessibility = "PHONE_DIGITS_CODE_SCREEN:REFRESH_TIMER_IMG")
    public MobileElement refreshTimerImg;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'PHONE_DIGITS_CODE_SCREEN:REPEAT_CALL')]")
    @iOSXCUITFindBy(accessibility = "Сделать звонок повторно")
    public MobileElement repeatCall;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Данные указаны неверно или устарели')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Данные указаны неверно или устарели'")
    public MobileElement wrongCodeText;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Ошибка валидации')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Ошибка валидации'")
    public MobileElement invalidCodeText;

}
