package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.Linkler.*;
public class YeniGelenler extends BasePage{
    public YeniGelenler(AppiumDriver driver) {
        super(driver);
    }
    public YeniGelenler yeniGelenUrunler(){
       click(yeniGelenlerLink,5);
       click(bugunGelenler,5);
       getBugun().get(0).click();
        if(isBedenn()==true){
            try {
                click(isBeden,5);
                getBeden().get(0).click();
                click(SepeteEkleButton, 5);
            } catch (IndexOutOfBoundsException e){
            }
        } else {
            click(SepeteEkleButton, 5);
        }
           click(geriDonmek, 5);

        return this;
    }
    public YeniGelenler birgunOnceGelen(){
      click(dunGelenler,5);
      getBugun().get(0).click();
        if(isBedenn()==true){
            try {
                click(isBeden,5);
                getBeden().get(0).click();
                click(SepeteEkleButton, 5);
            } catch (IndexOutOfBoundsException e){
            }
        } else {
            click(SepeteEkleButton, 5);
        }
        click(geriDonmek,5);

        return this;
    }
    private List<WebElement> getBugun() {
        return findAll(bugunGelenlerdenSec);
    }

    public boolean isBedenn(){
       return isDisplayed(isBeden);

    }
    private List<WebElement> getBeden(){
      return   findAll(bedenSec);

    }
}
