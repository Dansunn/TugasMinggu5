package com.appiumcalculatortest.drivers.strategies;

import com.appiumcalculatortest.drivers.managers.AndroidCalculatorManager;
import com.appiumcalculatortest.drivers.managers.AndroidEcommerceManager;
import com.appiumcalculatortest.drivers.utilities.TargetEnvironment;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class DriverStrategyImplementer {
    public AndroidDriver setStrategy(String strategy) throws MalformedURLException {
        switch (strategy) {
            case TargetEnvironment.CALCULATOR:
                return AndroidCalculatorManager.make();
            case TargetEnvironment.ECOMMERCE:
                return AndroidEcommerceManager.make();
            default:
                return AndroidCalculatorManager.make();
        }
    }
}

