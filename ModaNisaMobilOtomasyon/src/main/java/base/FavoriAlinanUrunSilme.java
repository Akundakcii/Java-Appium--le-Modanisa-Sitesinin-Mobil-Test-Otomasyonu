package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;
import static constans.Linkler.urunSilme;

public class FavoriAlinanUrunSilme extends BasePage{
    public FavoriAlinanUrunSilme(AppiumDriver driver) {
        super(driver);
    }
    public FavoriAlinanUrunSilme favoriUrunSilme(){

        List<WebElement> elements = driver.findElements(urunSilme);

        while(elements.size()>0){
            click(urunSilme1,5);
            click(urunSilmeOnay,5);
            elements = driver.findElements(urunSilme);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(alisveriseGeriDon,5);

        return this;
    }
  public boolean varmi(){
        return isDisplayed(AnasayfaButton);
  }
}
