package com.appiumcalculatortest.appium.Steps;

import com.appiumcalculatortest.Screens.CalculatorScreen;
import com.appiumcalculatortest.drivers.DriverSingleton;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PenguranganSteps {

    private AndroidDriver driver;
    private CalculatorScreen calculatorScreen;

    @Before
    public void setup() {
        driver = DriverSingleton.getDriver();
        calculatorScreen = new CalculatorScreen(driver);
    }

    @Given("saya menekan tombol clear untuk pengurangan")
    public void clickButtonClear() {
        calculatorScreen.clickClear();
    }

    @And("saya menekan tombol {int}")
    public void clickAngka(int number) {
        calculatorScreen.clickAngka(number);
    }

    @And("saya menekan tombol minus")
    public void clickButtonPlus() {
        calculatorScreen.clickMinus();
    }

    @And("saya menekan tombol sama dengan untuk pengurangan")
    public void clickButtonEqual() {
        calculatorScreen.clickEqual();
    }

    @Then("saya mendapatkan hasil pengurangan {int}")
    public void getResult(int result) {
        String expected = result + " Calculation result";
        String actual = calculatorScreen.getResult();

        Assert.assertEquals(expected, actual);
    }
}
