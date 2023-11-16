package base;

import io.appium.java_client.AppiumDriver;

import static constans.Linkler.*;

public class GirisPage extends BasePage {

    AppiumDriver driver;

    public GirisPage(AppiumDriver driver) {
        super(driver);

    }
    public GirisPage giris (String eposta,String sifre){
        click(girisLocator,5);
        click(bilgirimgonder,5);
        click(hesabimButton,5);
        click(girisUyeYap,5);
        click(emailGiris,5);
        waitSecons(2);
        write(emailText,eposta,2);
        write(sifreText,sifre,2);
        click(girisLogin,5);
        click(AnasayfaButton,5);
      /*  boolean x =popopp();
     if (x==true){
            click(reklamCikis,5);
        }*/


        return this;
    }
    public boolean varmi() {
        return isDisplayed(hesabim);
    }

}
