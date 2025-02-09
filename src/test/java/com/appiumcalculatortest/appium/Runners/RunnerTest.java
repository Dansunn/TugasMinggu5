package com.appiumcalculatortest.appium.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = {
                    "src/test/resources/features/Calculator.feature",
            },
            glue = {
                    "com.appiumcalculatortest.appium.Steps",
                    "com.appiumcalculatortest.appium.Hooks",
            },
            plugin = {
                    "pretty",
                    "html:target/cucumber-reporting-mobile/reporting.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            }
    )
    public class RunnerTest extends AbstractTestNGCucumberTests {

    }
