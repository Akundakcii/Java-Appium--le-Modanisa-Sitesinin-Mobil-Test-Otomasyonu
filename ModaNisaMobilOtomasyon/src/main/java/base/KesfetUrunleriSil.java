package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;

public class KesfetUrunleriSil extends BasePage{
    public KesfetUrunleriSil(AppiumDriver driver) {
        super(driver);
    }
    public KesfetUrunleriSil KesfetSil(){

        click(sepeteGerigit,5);
        List<WebElement> elements = driver.findElements(urunSilme);

        while(elements.size()>0){
            click(urunSilme1,5);
            click(urunSilmeOnay,5);
            elements = driver.findElements(urunSilme);
        }
        click(alisveriseGeriDon,5);
        click(geriDonmek,5);
        click(AnasayfaButton,5);
        return this;
    }
}
