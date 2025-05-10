package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainTest {
    WebDriver driver;

    public MainTest(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleBlock() {
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

    public void checkOfButton() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("297777777");

        WebElement sumAdd = driver.findElement(By.id("connection-sum"));
        sumAdd.sendKeys("1000");

        WebElement buttonAdd = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));
        buttonAdd.click();
    }
}
