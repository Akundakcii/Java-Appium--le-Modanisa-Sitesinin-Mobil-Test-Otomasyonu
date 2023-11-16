package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;

public class ListeUrunEkle extends BasePage {
    public ListeUrunEkle(AppiumDriver driver) {
        super(driver);
    }

    public ListeUrunEkle listeyeUrunEkle(String urun) {
boolean x = false
        ;
        click(ListeUrunEkle, 5);
        if (x == true) {

            click(AnasayfaGit, 5);
            click(SearchBoxTik, 5);
            write(SearchBox, urun, 5);
            getMont().get(0).click();
            waitSecons(2);
            getAllProducts().get(1).click();
            waitSecons(2);
            getAllProducts().get(2).click();
            waitSecons(2);
            click(hesabimButton, 5);
            click(ListeButton, 5);
            click(ListeUrunEkle, 5);

            List<WebElement> elements = driver.findElements(likeUrun);
            int index = 1;
            while (index <= elements.size()) {
                String xpath = "(//android.widget.ImageView[@resource-id=\"com.modanisa:id/affiliate_checkbox\"])[" + index + "]";
                try {
                    click(By.xpath(xpath), 5);
                } catch (Exception e) {
                    System.out.println("Element tıklanamadı: " + e.getMessage());
                    break;
                }
                index++;
            }
            click(listeyeEkle, 5);
            click(geriDon, 5);
        }
        else{
        click(geriDon, 5);}
        return this;
    }

    private List<WebElement> getAllProducts() {
        return findAll(montLike);
    }

    private List<WebElement> getMont() {
        return findAll(botilkindis);
    }
    public boolean Anasayfa(){

        return isDisplayed(AnasayfaGit);
    }

}
