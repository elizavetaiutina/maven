package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FormOnlinePay {
    WebDriverWait wait;
    WebDriver driver;

    public FormOnlinePay(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public String getTitleBlock() {
        acceptCookiesIfPresent();
        return driver.findElement(By.xpath("//section[@class='pay']//h2")).getText();
    }

    public int getSizeOfListLogoPayStickers() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        return list.size();
    }

    public String checkLinkAboutService() {
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        return driver.getCurrentUrl();
    }

    public FormForPayWithCard checkOfButton() {
        acceptCookiesIfPresent();
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("297777777");

        WebElement sumAdd = driver.findElement(By.id("connection-sum"));
        sumAdd.sendKeys("100");

        WebElement buttonAdd = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));
        buttonAdd.click();

        return new FormForPayWithCard(driver);
    }

    public String getPlaceHolder(String id) {
        return driver.findElement(By.id(id)).getAttribute("placeholder");
    }

    protected void acceptCookiesIfPresent() {
        try {
            WebElement acceptCookie = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(., 'Принять')]")));
            acceptCookie.click();
        } catch (TimeoutException ignored) {
        }
    }
}
