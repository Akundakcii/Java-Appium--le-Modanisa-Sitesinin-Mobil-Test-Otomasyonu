package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    AppiumDriver driver;
    WebDriverWait wait;


    public BasePage(AppiumDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);

    }
    public void waitSecons(int sure){
        driver.manage().timeouts().implicitlyWait(sure, TimeUnit.SECONDS);
    }

    public WebElement find(By Locator) {

        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public void write(By Locator, String text,int saniye) {
        find(Locator).sendKeys(text);
        waitSecons(saniye);

    }
    public void click(By Locator,int saniye){

        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        find(Locator).click();
        waitSecons(saniye);

    }
    public Boolean isDisplayed(By Locator) {
        return find(Locator).isDisplayed();
    }

    public List<WebElement> findAll(By Locator) {
        //Liste verilerini aktarıp indis seklinde cektığımız method.
        return driver.findElements(Locator);
    }




}
