import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

class ChromeCreateTest {

    static WebDriver driver = WebDriverManager.chromedriver().create();

    @BeforeAll
    static void setup() {
        driver.get("https://www.mts.by");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterAll
    static void teardown() {

    }

    @DisplayName("Проверка названия блока")
    @Test
    void testNameBlock() {
        Assertions.assertTrue(driver.findElement(By.className("pay")).getText().contains("Онлайн пополнение\nбез комиссии"));
    }

    @DisplayName("Проверка наличия логотипов платежных систем")
    @Test
    void testLogoPayStickers() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        Assertions.assertEquals(5, list.size());
    }

    @DisplayName("Проверка ссылки")
    @Test
    void testLink() {
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        String url = driver.getCurrentUrl();
        Assertions.assertTrue(url.contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
        WebDriver.Navigation navigate = driver.navigate();
        navigate.back();
    }

    @DisplayName("Проверка кнопки пополнения")
    @Test
    void testButton() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("297777777");

        WebElement sumAdd = driver.findElement(By.id("connection-sum"));
        sumAdd.sendKeys("1000");

        WebElement buttonAdd = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));
        buttonAdd.click();

        Assertions.assertTrue(driver.findElement(By.className("bepaid-app")).isEnabled());
    }
}