package org.example;

import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.logging.ErrorManager;

public class FormForPayWithCard extends FormOnlinePay {
    public FormForPayWithCard(WebDriver driver) {
        super(driver);
    }

    private By iframe = By.xpath("//iframe[@class='bepaid-iframe']");
    private By symAdd = By.xpath("//div[@class = 'pay-description__cost']");
    private By phone = By.xpath("//div[@class = 'pay-description__text']");
    private By placeholderNumberOfCard = By.xpath("//label[@class ='ng-tns-c2312288139-1 ng-star-inserted']");
    private By placeholderDateOfCard = By.xpath("//label[@class = 'ng-tns-c2312288139-4 ng-star-inserted']");
    private By placeholderCCV = By.xpath("//label[@class = 'ng-tns-c2312288139-5 ng-star-inserted']");
    private By placeholderNameCardholder = By.xpath("//label[@class = 'ng-tns-c2312288139-3 ng-star-inserted']");
    private By iconPayStickers = By.xpath("//img[@class='ng-tns-c891095944-0 ng-star-inserted']");
    private By buttonPayWithSum = By.xpath("//button[@class = 'colored disabled']");



    public boolean isDisplayedFrame() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(iframe)).isDisplayed();
    }

    public String getSumAddInFrame() {
        driver.switchTo().frame(driver.findElement(iframe));
        String sum = wait.until(ExpectedConditions.visibilityOfElementLocated(symAdd)).getText();
        driver.switchTo().defaultContent();
        return sum;
    }

    public String getNumberInFrame() {
        driver.switchTo().frame(driver.findElement(iframe));
        String phonenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phone)).getText();
        driver.switchTo().defaultContent();
        return phonenumber;
    }

    public String getPlaceholderNumberOfCard() {
        driver.switchTo().frame(driver.findElement(iframe));
        String placeholder = wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderNumberOfCard)).getText();
        driver.switchTo().defaultContent();
        return placeholder;
    }

    public String getPlaceholderDateOfCard() {
        driver.switchTo().frame(driver.findElement(iframe));
        String placeholder = wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderDateOfCard)).getText();
        driver.switchTo().defaultContent();
        return placeholder;
    }

    public String getPlaceholderCCV() {
        driver.switchTo().frame(driver.findElement(iframe));
        String placeholder = wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderCCV)).getText();
        driver.switchTo().defaultContent();
        return placeholder;
    }

    public String getPlaceholderNameCardholder() {
        driver.switchTo().frame(driver.findElement(iframe));
        String placeholder = wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderNameCardholder)).getText();
        driver.switchTo().parentFrame();
        return placeholder;
    }

    public int getSizeIconPayStickers() {
        driver.switchTo().frame(driver.findElement(iframe));
        List<WebElement> list = driver.findElements(iconPayStickers);
        driver.switchTo().parentFrame();
        return list.size();
    }

    public String getSumAddInButtonInFrame() {
        driver.switchTo().frame(driver.findElement(iframe));
        String sum = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonPayWithSum)).getText();
        driver.switchTo().parentFrame();
        return sum;
    }
}

