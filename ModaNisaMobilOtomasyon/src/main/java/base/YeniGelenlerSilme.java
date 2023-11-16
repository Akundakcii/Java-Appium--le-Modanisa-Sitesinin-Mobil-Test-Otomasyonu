package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;
public class YeniGelenlerSilme extends BasePage{
    public YeniGelenlerSilme(AppiumDriver driver) {
        super(driver);
    }

    public YeniGelenlerSilme Silme() {
      click(sepetButton,5);

        List<WebElement> elements = driver.findElements(urunSilme);

        while (elements.size() > 0) {
            click(urunSilme1, 5);
            click(urunSilmeOnay, 5);
            elements = driver.findElements(urunSilme);
        }
        click(alisveriseGeriDon, 5);
  return this;
    }
}
