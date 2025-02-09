package com.appiumcalculatortest.appium.Hooks;

import com.appiumcalculatortest.drivers.DriverSingleton;
import com.appiumcalculatortest.drivers.utilities.TargetEnvironment;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class Hook {
    @BeforeAll
    public static void initialize() throws MalformedURLException {
        DriverSingleton.getDriver(TargetEnvironment.CALCULATOR);
    }

    @AfterAll
    public static void finalTeardown() {
        DriverSingleton.closeDriver();
    }
}
