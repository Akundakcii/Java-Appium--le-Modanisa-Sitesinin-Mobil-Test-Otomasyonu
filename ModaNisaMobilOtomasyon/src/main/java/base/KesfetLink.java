package base;

import constans.Linkler;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;


public class KesfetLink extends BasePage {
    public KesfetLink(AppiumDriver driver) {
        super(driver);
    }
    private double y;
    private double z;
    private double totalFiyat1;
    public KesfetLink kesfet() {

        click(kesfetLink, 5);
        haftaninFirsati().get(0).click();
        click(siralama, 5);

        click(PahlidanUcuza, 5);
        waitSecons(5);
        click(uygulaButton, 5);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        enPahali().get(0).click();
        String urunFiyati = find(urunAciklamaFiyat).getText().replace("TL", "").replace(",", ".");
        if (!urunFiyati.isEmpty()) {
            y = Double.parseDouble(urunFiyati);
        }

        waitSecons(3);
        if (isBedenn() == true) {
            try {
                click(isBeden, 5);
                getBeden().get(0).click();
                click(SepeteEkleButton, 5); // Sepete ekleme işlemi buraya taşındı
            } catch (IndexOutOfBoundsException e) {
            }
        } else {
            click(SepeteEkleButton, 5); // Beden seçeneği yoksa burada sepete ekleme işlemi gerçekleşir
        }
        click(geriDonmek, 5);
        return this;
    }

    //En ucuz Urun
    public KesfetLink EnUcuz() {


        click(siralama, 5);
        click(UcuzdanPahliya, 5);
        click(uygulaButton, 5);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        enPahali().get(0).click();
        String urunFiyati = find(urunAciklamaFiyat).getText().replace("TL", "").replace(",", ".");
        if (!urunFiyati.isEmpty()) {
            z = Double.parseDouble(urunFiyati);
        }
        if (isBedenn() == true) {
            try {
                click(isBeden, 5);
                getBeden().get(0).click();
                click(SepeteEkleButton, 5);
            } catch (IndexOutOfBoundsException e) {
            }
        } else {
            click(SepeteEkleButton, 5);
        }
        click(sepeteGit, 5);
        click(guvenleAl, 5);
        totalFiyat1 = Double.parseDouble(find(totalFiyat).getText().replace("TL", "").replace(",", "."));


        return this;

    }

    private List<WebElement> haftaninFirsati() {
        return findAll(haftaninFirsatlari);
    }

    private List<WebElement> pahaliUcuz() {
        return findAll(pahaliUcuz);
    }

    private List<WebElement> enPahali() {
        return findAll(enPahakliUrun);
    }
boolean x = false;
    public boolean isBedenn() {

        if(isDisplayed(isBeden)){
            x=true;

        }
else {
    x=false;
        }
return x;
    }

    private List<WebElement> getBeden() {
        return findAll(bedenSec);

    }
public double fiyat (){

       double sonuc =  z + y ;
       return sonuc;
}
public double totalFiyatt (){
        return totalFiyat1;
}

}
