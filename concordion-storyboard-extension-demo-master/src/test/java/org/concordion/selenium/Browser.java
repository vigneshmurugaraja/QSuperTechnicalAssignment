package org.concordion.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Manages the browser session.
 */
public class Browser {
    private WebDriver driver;

    public Browser() {
    	 //New Change: Introduced the gecko driver to invoke Firefox browser
    	 System.setProperty("webdriver.gecko.driver", "C:\\Selenium-Vignesh\\01_Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
    	 driver = new FirefoxDriver();

         EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
         efwd.register(new SeleniumEventLogger());
         driver = efwd;
    }

    public void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
