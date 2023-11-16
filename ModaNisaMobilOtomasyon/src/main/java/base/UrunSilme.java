package base;

import com.mongodb.gridfs.CLI;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import static constans.Linkler.*;

import java.util.List;

public class UrunSilme extends BasePage {
    public UrunSilme(AppiumDriver driver) {
        super(driver);
    }

    public UrunSilme listEkle() {

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
