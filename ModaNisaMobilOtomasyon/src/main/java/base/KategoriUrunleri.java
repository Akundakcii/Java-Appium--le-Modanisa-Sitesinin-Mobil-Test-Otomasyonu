package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import static constans.Linkler.*;
public class KategoriUrunleri extends BasePage{
    public KategoriUrunleri(AppiumDriver driver) {
        super(driver);
    }
private double x ;
    private double y ;
    public KategoriUrunleri kategori (){
    click(KategoriButton,5);
    getKategori().get(1).click();
    waitSecons(5);
    getKategori2().get(1).click();
    click(FiltreButton,5);
getFiltre().get(0).click();
waitSecons(5);
getFiltreSec().get(1).click();
click(FiltreKaydet,5);

      //  click(FiltreKaydet,5);
        return this;
    }
    public KategoriUrunleri Filtre(){
        getFiltre().get(1).click();
        waitSecons(5);
        getFiltreSec().get(1).click();
        click(FiltreKaydet,5);
        getFiltre().get(2).click();
        waitSecons(5);
      getFiltreRenk().get(0).click();
        click(FiltreKaydet,5);
        getFiltre().get(3).click();
        waitSecons(5);
        getFiltreSec().get(0).click();
        click(FiltreKaydet,5);

        click(FiltreKaydet,5);
        return this;

    }
    public KategoriUrunleri urunSec() {

        getUrun().get(0).click();
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
           click(SepeteGit,5);
        String urunFiyati = find(sepetFiyati).getText().replace("TL", "").replace(",", ".");
        if (!urunFiyati.isEmpty()) {
            x = Double.parseDouble(urunFiyati);
        }
        String urunFiyati1 = find(SepetTotal).getText().replace("TL", "").replace(",", ".");
        if (!urunFiyati.isEmpty()) {
            y= Double.parseDouble(urunFiyati1);
        }



        return this;
    }

    private List<WebElement> getKategori(){
        return findAll(KategoriSelected);
    }
    private List<WebElement> getKategori2(){
        return findAll(KategoriSelected2);
    }
    private List<WebElement>getFiltre(){
        return findAll(FiltreSeleceted);
    }
    private List<WebElement>getFiltreSec(){
        return findAll(FiltreSec);
    }
    private List<WebElement>getFiltreRenk(){
        return findAll(FiltreRenk);
    }
    private List<WebElement>getUrun(){

        return findAll(FiltreSonuc);
    }
        public boolean isBedenn(){
            isDisplayed(isBeden);
            return true;
        }
    private List<WebElement> getBeden(){
        return   findAll(bedenSec);

    }
    public double sepetFiyatii(){

        return x;
    }
    public double sepetTotal(){
        return y;
    }
}
