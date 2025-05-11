import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.FormForPayWithCard;
import org.example.FormOnlinePay;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


class BaseTest {
    static WebDriver driver = WebDriverManager.chromedriver().create();
    private static FormOnlinePay formOnlinePay;

    @BeforeAll
    static void setup() {
        driver.get("https://www.mts.by");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        formOnlinePay = new FormOnlinePay(driver);
    }

    @BeforeEach
    void set() {
        driver.get("https://www.mts.by"); //наверное это не очень хорошая практика ?
    }

    @DisplayName("Проверка названия блока")
    @Test
    public void testNameBlock() {
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", formOnlinePay.getTitleBlock());
    }

    @DisplayName("Проверка наличия логотипов платежных систем")
    @Test
    void testLogoPayStickers() {
        Assertions.assertEquals(5, formOnlinePay.getSizeOfListLogoPayStickers());
    }

    @DisplayName("Проверка работы ссылки")
    @Test
    void testLinkAboutService() {
        String url = formOnlinePay.checkLinkAboutService();
        Assertions.assertTrue(url.contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
        //Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", url);
        WebDriver.Navigation navigate = driver.navigate();
        navigate.back();
    }

    @DisplayName("Проверка placeholder полей ввода вкладки 'Услуги связи'")
    @Test
    void testPlaceholderOfInputCommunicationServices() {
        Assertions.assertEquals("Номер телефона", formOnlinePay.getPlaceHolder("connection-phone"));
        Assertions.assertEquals("Сумма", formOnlinePay.getPlaceHolder("connection-sum"));
        Assertions.assertEquals("E-mail для отправки чека", formOnlinePay.getPlaceHolder("connection-email"));
    }

    @DisplayName("Проверка placeholder полей ввода вкладки 'Домашний интернет'")
    @Test
    void testPlaceholderOfInputHomeInternetConnection() {
        Assertions.assertEquals("Номер абонента", formOnlinePay.getPlaceHolder("internet-phone"));
        Assertions.assertEquals("Сумма", formOnlinePay.getPlaceHolder("internet-sum"));
        Assertions.assertEquals("E-mail для отправки чека", formOnlinePay.getPlaceHolder("internet-email"));
    }

    @DisplayName("Проверка placeholder полей ввода вкладки 'Рассрочка'")
    @Test
    void testPlaceholderOfInputInstallment() {
        Assertions.assertEquals("Номер счета на 44", formOnlinePay.getPlaceHolder("score-instalment"));
        Assertions.assertEquals("Сумма", formOnlinePay.getPlaceHolder("instalment-sum"));
        Assertions.assertEquals("E-mail для отправки чека", formOnlinePay.getPlaceHolder("instalment-email"));
    }

    @DisplayName("Проверка placeholder полей ввода вкладки 'Задолженность'")
    @Test
    void testPlaceholderOfInputArrears() {
        Assertions.assertEquals("Номер счета на 2073", formOnlinePay.getPlaceHolder("score-arrears"));
        Assertions.assertEquals("Сумма", formOnlinePay.getPlaceHolder("arrears-sum"));
        Assertions.assertEquals("E-mail для отправки чека", formOnlinePay.getPlaceHolder("arrears-email"));
    }

    @DisplayName("Проверка кнопки пополнения")
    @Test
    void testButton() {
        formOnlinePay.checkOfButton();
        Assertions.assertTrue(driver.findElement(By.className("bepaid-app")).isEnabled());
    }

    @DisplayName("Проверка отображения данных во фрейм окне")
    @Test
    void testFrame() {
        FormForPayWithCard formForPayWithCard = formOnlinePay.checkOfButton();

        Assertions.assertTrue(formForPayWithCard.isDisplayedFrame()); //Проверка отображения фрейма
        Assertions.assertEquals("100.00 BYN", formForPayWithCard.getSumAddInFrame()); //Проверка отображения суммы пополнения во фрейме
        Assertions.assertTrue(formForPayWithCard.getNumberInFrame().contains("375297777777")); //Проверка отображения номера телефона во фрейме
        //проверка placeholder полей ввода карты
        Assertions.assertEquals("Номер карты", formForPayWithCard.getPlaceholderNumberOfCard());
        Assertions.assertEquals("Срок действия", formForPayWithCard.getPlaceholderDateOfCard());
        Assertions.assertEquals("CVC", formForPayWithCard.getPlaceholderCCV());
        Assertions.assertEquals("Имя держателя (как на карте)", formForPayWithCard.getPlaceholderNameCardholder());
        //проверка наличия иконок
        Assertions.assertEquals(3, formForPayWithCard.getSizeIconPayStickers());
        Assertions.assertTrue(formForPayWithCard.getSumAddInButtonInFrame().contains("100.00 BYN")); //Проверка отображения суммы пополнения на кнопке во фрейме
    }
}
