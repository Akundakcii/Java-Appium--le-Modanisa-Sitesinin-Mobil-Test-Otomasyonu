package base;

import io.appium.java_client.AppiumDriver;

import static constans.Linkler.*;

public class AdressEkleme extends BasePage {
    public AdressEkleme(AppiumDriver driver) {
        super(driver);
    }

    public AdressEkleme adressEkleme(String telefon, String adresBaslik, String adresEkleme, String postakod) {
        click(hesabimButton, 5);
        click(adresButton, 5);
        click(adressEkleme, 5);
        write(telefonText, telefon, 2);
        write(adressBaslik, adresBaslik, 2);
        write(adressAdd, adresEkleme, 2);
        click(secimliSehirTik, 5);
        click(balikesirSelected, 5);
        click(secimlilceTik, 5);
        click(edremitSelected, 5);
        write(postaKodu, postakod, 2);
        click(onayButton, 5);
        return this;
    }

    public boolean varmi() {
        return isDisplayed(varmi1);
    }
}
