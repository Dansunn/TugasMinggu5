package com.appiumcalculatortest.Screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorScreen {
    private AndroidDriver driver;
    WebDriverWait wait;

    private By buttonClear = AppiumBy.accessibilityId("Clear");
    private By buttonPlus = AppiumBy.accessibilityId("Plus");
    private By buttonEqual = AppiumBy.accessibilityId("Calculation");
    private By btnMinus = AppiumBy.accessibilityId("Minus");
    private By textEdit = AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");

    public CalculatorScreen(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void clickAngka(int number){
        String angkaString = String.valueOf(number);
        for (char digit : angkaString.toCharArray()) {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(String.valueOf(digit)))
            );
            element.click();
        }
    }

    public void clickClear() {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(buttonClear)
        );

        element.click();
    }

    public void clickMinus(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(btnMinus));
        element.click();
    }

    public void clickPlus() {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(buttonPlus)
        );

        element.click();
    }

    public void clickEqual() {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(buttonEqual)
        );

        element.click();
    }

    public String getResult() {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(textEdit)
        );
        return element.getText();
    }
}

