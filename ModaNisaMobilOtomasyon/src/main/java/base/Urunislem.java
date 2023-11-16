package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;

public class Urunislem extends BasePage {

    public Urunislem(AppiumDriver driver) {
        super(driver);

    }

    public Urunislem kargoKontrol() {
        double x = Double.parseDouble((find(sepetFiyat).getText()).replace("TL", "").replace(",", "."));
        while (x < 400.00) {

            click(sepeteGerigit,5);
            click(getSepeteGerigit2,5);
            click(AnasayfaButton,5);
            click(SearchBoxTik,5);
            write(SearchBox, "Bot", 2);
            getBot().get(0).click();
            waitSecons(2);
            getAllProducts().get(1).click();
            waitSecons(2);
            click(bedenTik,5);
            getBedenAll().get(0).click();
            waitSecons(2);
            click(SepeteEkleButton,5);
            click(SepeteGit,5);


            x = Double.parseDouble((find(sepetFiyat).getText()).replace("TL", "").replace(",", "."));
        }
        click(guvenleAl,5);

        return this;
    }


    private List<WebElement> getBedenAll() {
        return findAll(bedenSec);
    }

    private List<WebElement> getAllProducts() {
        return findAll(botSec);
    }

    private List<WebElement> getBot() {
        return findAll(botilkindis);
    }
    public boolean varmi (){

        return isDisplayed(urunislenAssertion);
    }
}






