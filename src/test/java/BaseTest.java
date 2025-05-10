import io.github.bonigarcia.wdm.WebDriverManager;
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

    @DisplayName("Проверка названия блока")
    @Test
    public void testNameBlock() {
        //mainTest.getTitleBlock();
        System.out.println(formOnlinePay.getTitleBlock());
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

    @DisplayName("Проверка кнопки пополнения")
    @Test
    void testButton() {
        formOnlinePay.checkOfButton();
        Assertions.assertTrue(driver.findElement(By.className("bepaid-app")).isEnabled());
    }
}
