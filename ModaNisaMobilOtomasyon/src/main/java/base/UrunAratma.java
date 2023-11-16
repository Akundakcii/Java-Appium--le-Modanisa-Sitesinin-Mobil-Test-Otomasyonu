package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;


public class UrunAratma extends BasePage {

    public UrunAratma(AppiumDriver driver) {
        super(driver);
    }

    public UrunAratma urunAra(String urun) {

        click(AnasayfaButton, 5);
        click(SearchBoxTik, 5);
        write(SearchBox, urun, 2);
        getBot().get(0).click();
        waitSecons(2);
        getAllProducts().get(1).click();
        waitSecons(2);
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

        click(SepeteGit, 5);
        return this;

    }


    private List<WebElement> getAllProducts() {
        return findAll(botSec);
    }



    public boolean varmi() {
        return isDisplayed(sepettemi);
    }

    private List<WebElement> getBot() {
        return findAll(botilkindis);
    }
    public boolean isBedenn(){
        isDisplayed(isBeden);
        return true;
    }
    private List<WebElement> getBeden(){
        return   findAll(bedenSec);

    }
}
