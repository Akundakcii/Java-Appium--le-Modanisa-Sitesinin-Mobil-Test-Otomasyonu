package constans;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;

public class Linkler {
    public static final By girisLocator = By.id("com.modanisa:id/startShopping");
    public static final By bilgirimgonder = By.id("com.android.permissioncontroller:id/permission_deny_button");
    public static final By hesabimButton = By.id("com.modanisa:id/tab_myaccount");
    public static final By girisUyeYap = By.id("com.modanisa:id/loginOrSignup");
    public static final By emailGiris = By.id("com.modanisa:id/emailTabLayout");
    public static final By emailText = new MobileBy.ByAccessibilityId("emailEditText");
    public static final By sifreText =new MobileBy.ByAccessibilityId("passwordEditText");

    public static final By girisLogin = By.id("com.modanisa:id/login");
    public static final By hesabim = By.id("com.modanisa:id/toolbar");
  //  public static final By girisReklam = new By.ByXPath("//android.widget.RelativeLayout[@resource-id=\"com.modanisa:id/buttonContainer\"]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View");
    public static final By reklamCikis = new By.ByClassName("android.widget.Image");
    //---***
    //--- Adres Ekleme---//
    public static final By adresButton = By.id("com.modanisa:id/myAddressesLayout");
    public static final By adressEkleme = By.id("com.modanisa:id/addNewAddress");
    public static final By telefonText = new MobileBy.ByAccessibilityId("phoneEditText");
    public static final By adressBaslik = new MobileBy.ByAccessibilityId("addressTitle");
    public static final By adressAdd = new MobileBy.ByAccessibilityId("address");
    public static final By secimliSehirTik = new MobileBy.ByAccessibilityId("city1");
    public static final By balikesirSelected = new By.ByXPath("//android.widget.TextView[@resource-id=\"com.modanisa:id/textView\" and @text=\"Balıkesir\"]");
    public static final By secimlilceTik = new MobileBy.ByAccessibilityId("state2");
    public static final By edremitSelected = new By.ByXPath("//android.widget.TextView[@resource-id=\"com.modanisa:id/textView\" and @text=\"Edremit\"]");
    public static final By postaKodu = new MobileBy.ByAccessibilityId("zipCode");
    public static final By onayButton = By.id("com.modanisa:id/saveAndContinue");
    public static final By varmi1 = new By.ByXPath("//android.widget.LinearLayout[@resource-id=\"com.modanisa:id/addressLayout\"]/android.widget.LinearLayout");
    ///***
///---Liste Ekleme---///
    public static final By ListeButton = By.id("com.modanisa:id/myCollections");
    public static final By ListeEkleme = By.id("com.modanisa:id/layout_empty_list_screen");
    public static final By listeText = new By.ByClassName("android.widget.EditText");
    public static final By listeEklemeButton = By.id("com.modanisa:id/new_list_create_button");
    public static final By popup = By.id("com.modanisa:id/close_popup");
    public static final By listeVarmi = new By.ByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.modanisa:id/recyclerview_affiliate_lists\"]/android.view.ViewGroup");
    //----**
    //Urun Arama
    public static final By AnasayfaButton = By.id("com.modanisa:id/tab_homepage");
    public static final By SearchBoxTik = new By.ByXPath("//android.widget.ImageView[@text=\"Ara\"]");
    public static final By SearchBox = new By.ByClassName("android.widget.ImageView");
    public static final By botilkindis = new By.ByXPath("//android.view.View[@content-desc=\"suggest_list_item\"]");
    public static final By botSec = new By.ByXPath("//android.view.View[@content-desc=\"product_list_page_body\n" +
            "share-list-button-icon\"]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View");
    public static final By bedenTik = new MobileBy.ByAccessibilityId("select-size-button");
    public static final By bedenSec = new By.ByXPath("//android.view.View[@content-desc=\"size-menu\"]/android.view.View/android.view.View/android.view.View");

    public static final By SepeteEkleButton = new By.ByClassName("android.widget.Button");

    public static final By SepeteGit = new MobileBy.ByAccessibilityId("product-basket-icon");
    public static final By sepettemi = By.id("com.modanisa:id/toolBarTitle");

///***
    ///Ürün İslem

    public static final By sepetFiyat = By.id("com.modanisa:id/total");

    public static final By sepeteGerigit = By.id("com.modanisa:id/toolBarBack");
    public static final By getSepeteGerigit2 = new By.ByXPath("//android.widget.ImageView[@content-desc=\"page-back-button-icon\"]");
    public static final By guvenleAl = By.id("com.modanisa:id/proceedToCheckout");
    public static final By urunislenAssertion = new By.ByXPath("//android.widget.TextView[@text=\"Ödeme Seçenekleri\"]");
    //****
    ///Urun Silme
    public static final By urunSilme = new By.ByXPath("//android.widget.ImageView[@resource-id=\"com.modanisa:id/remove\"]");
    public static final By urunSilme1 = new By.ByXPath("(//android.widget.ImageView[@resource-id=\"com.modanisa:id/remove\"])[1]");
    public static final By urunSilmeOnay = By.id("android:id/button1");
    public static final By sepetButton = By.id("com.modanisa:id/tab_basket");
    ///**
    // Liste Ekleme
    public static final By ListeUrunEkle = By.id("com.modanisa:id/recyclerview_affiliate_list_thumb");
    public static final By AnasayfaGit = By.id("com.modanisa:id/homepage_button");
    public static final By montLike = new By.ByXPath("//android.view.View[@content-desc=\"product_list_page_body\n" +
            "share-list-button-icon\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button/android.widget.ImageView");

    public static final By likeUrun = new By.ByXPath("(//android.widget.ImageView[@resource-id=\"com.modanisa:id/affiliate_checkbox\"])");
    public static final By listeyeEkle = By.id("com.modanisa:id/add_to_list_button");
    public static final By geriDon = By.id("com.modanisa:id/tempToolbarBack");
//***
    ///Favori Ürün Almak *Buraya kada Linkler Güncel

    public static final By favoriButton = By.id("com.modanisa:id/tab_favorites");
    public static final By favoriUrun = new By.ByXPath("(//android.widget.Button[@resource-id=\"com.modanisa:id/bt_variant\"])");
    public static final By favUrunBeden = new By.ByXPath("//android.widget.TextView[@resource-id=\"com.modanisa:id/textView\"]");

    public static final By favoriUrunAssertion = By.id("com.modanisa:id/toolBarTitle");
    public static final By alisveriseGeriDon = By.id("com.modanisa:id/backToShopping");

    ///
    ///**Kesfet Urunlerı **
    public static final By kesfetLink = new By.ByXPath("//android.view.View[@content-desc=\"KEŞFET\n" +
            "Sekme 2 / 3\"]");
    public static final By haftaninFirsatlari = new By.ByXPath("//android.widget.RelativeLayout[@resource-id=\"com.modanisa:id/search_and_firstory_fragment\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static final By siralama = new MobileBy.ByAccessibilityId("{\"key\":null,\"value\":\"Sırala\"}");
    public static final By pahaliUcuz = new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"com.modanisa:id/product_list\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton");
    public static final By PahlidanUcuza = new MobileBy.ByAccessibilityId("{\"key\":null,\"value\":\"Pahalıdan Ucuza\"}");
    public static final By UcuzdanPahliya = new MobileBy.ByAccessibilityId("{\"key\":null,\"value\":\"Ucuzdan Pahalıya\"}");

    public static final By enPahakliUrun = new By.ByXPath("//android.view.View[@content-desc=\"product_list_page_body\n" +
            "share-list-button-icon\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View");
    public static final By uygulaButton = new MobileBy.ByAccessibilityId("{\"key\":null,\"value\":\"Uygula\"}");

    public static final By geriDonmek = new MobileBy.ByAccessibilityId("page-back-button-icon");

    public static final By sepeteGit =new MobileBy.ByAccessibilityId("product-basket-icon");

    public static final By urunAciklamaFiyat= new By.ByXPath("//android.view.View[@content-desc=\"product-price-container\"]/android.view.View");
public static final By totalFiyat = By.id("com.modanisa:id/installmentTotalAmount");
    //****
    //-- Yeni Gelenler burda kalındı
    public static final By yeniGelenlerLink = new By.ByXPath("//android.view.View[@content-desc=\"YENİ GELENLER\n" +
            "Sekme 3 / 3\"]");
    public static final By bugunGelenler = new By.ByXPath("//android.widget.RelativeLayout[@resource-id=\"com.modanisa:id/search_and_firstory_fragment\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View");
    public static final By bugunGelenlerdenSec = new By.ByXPath("//android.widget.RelativeLayout[@resource-id=\"com.modanisa:id/search_and_firstory_fragment\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static final By dunGelenler = new By.ByXPath("//android.widget.RelativeLayout[@resource-id=\"com.modanisa:id/search_and_firstory_fragment\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View");
    public static final By isBeden = new By.ByXPath("//android.view.View[@content-desc=\"product-detail-container\"]/android.view.View[2]");

//****
  //--- Kategori

  public static final  By KategoriButton = By.id("com.modanisa:id/tab_categories");
  public static final By KategoriSelected = new By.ByXPath("//android.widget.ImageView[@content-desc]");
public static final By KategoriSelected2= new By.ByXPath("//android.view.View[@content-desc=\"subcategory-slot\"]/android.widget.ImageView");
public static final By FiltreButton= new MobileBy.ByAccessibilityId("{\"key\":null,\"value\":\"Filtrele\"}");
public static final By FiltreSeleceted = new By.ByXPath("(//android.widget.ImageView[@content-desc=\"filter_item\"])");
public static final By FiltreSec = new By.ByXPath("(//android.widget.ImageView[@content-desc=\"filter_option\"])");
public static final By FiltreKaydet = new MobileBy.ByAccessibilityId("{\"key\":\"bottom-sheet-action-button\",\"enabled\":true}");
public static final By FiltreRenk = new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"com.modanisa:id/product_list\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View");
 public static final By FiltreSonuc= new By.ByXPath("//android.view.View[@content-desc=\"product_list_page_body\n" +
         "share-list-button-icon\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View");
public static final By sepetFiyati = By.id("com.modanisa:id/price");
public static final By SepetTotal = By.id("com.modanisa:id/total");
//***
  /// Banner Linkleri
  public static final By bannerLinkler = new By.ByXPath("//android.widget.HorizontalScrollView/android.widget.ImageView");

public static final By geriD = new MobileBy.ByAccessibilityId("product_list_page_back_button");
}
