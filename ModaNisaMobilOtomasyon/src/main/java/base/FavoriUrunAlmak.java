package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static constans.Linkler.*;

import java.util.List;

import static constans.Linkler.*;

public class FavoriUrunAlmak extends BasePage{

    public FavoriUrunAlmak(AppiumDriver driver) {
        super(driver);
    }

    public FavoriUrunAlmak favoriAlma(){


        click(favoriButton,5);
        List<WebElement> elements = driver.findElements(favoriUrun);
        int index = 1;
        while (index <= elements.size()) {
            String xpath = "(//android.widget.Button[@resource-id=\"com.modanisa:id/bt_variant\"])[" + index + "]";
            String xpath2 ="(//android.widget.Button[@resource-id=\"com.modanisa:id/bt_add_cart\"])["+ index + "]";
            try {
                click(By.xpath(xpath), 5);
                getBeden().get(0).click();
                click(By.xpath(xpath2),5);
                click(sepeteGerigit,5);
            } catch (Exception e) {
                System.out.println("Element tıklanamadı: " + e.getMessage());
                break;
            }
            index++;
        }
        click(sepetButton, 5);

        return this;
    }

    private List<WebElement> getBeden() {
        return findAll(favUrunBeden);
    }
    public String varmi(){

        String urun;
        return   urun = find(favoriUrunAssertion).getText();
    }

    }

