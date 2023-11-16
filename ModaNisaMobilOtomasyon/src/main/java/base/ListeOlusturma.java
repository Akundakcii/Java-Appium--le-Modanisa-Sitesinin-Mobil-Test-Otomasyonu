package base;

import io.appium.java_client.AppiumDriver;
import static constans.Linkler.*;


public class ListeOlusturma extends BasePage{
    public ListeOlusturma(AppiumDriver driver) {
        super(driver);
    }
    public ListeOlusturma liste(String ListeText){

        click(hesabimButton, 5);
        click(ListeButton, 5);
        if(varmi()==false) {
            click(ListeEkleme, 5);
            write(listeText, ListeText, 2);
            click(listeEklemeButton, 5);
            if (popvarmi() == 1) {
                click(popup, 5);
            }
        }
        return this;
    }
public boolean varmi(){
        return isDisplayed(listeVarmi);
}
int x = 0;

public int popvarmi(){
      if( isDisplayed(popup)){
          x =1;
      }
      else {x=0;}
              return x;
}


}
