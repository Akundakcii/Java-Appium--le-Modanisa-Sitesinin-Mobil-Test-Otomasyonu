package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static constans.Linkler.*;
public class FirsatUrunleriAl extends BasePage{
    public FirsatUrunleriAl(AppiumDriver driver) {
        super(driver);
    }

    public FirsatUrunleriAl firsatAL()  {
        click(AnasayfaButton,5);
        getFirsat().get(0).click();
        click(geriD,5);
        // Cokatanlar
        getFirsat().get(1).click();
        click(geriD,5);
        // 399 Altı
        getFirsat().get(2).click();
        click(geriD,5);
        //199 Altı
        getFirsat().get(3).click();
        click(geriD,5);

        return this;
    }
    private List<WebElement> getFirsat(){
        return findAll(bannerLinkler);
    }
}
