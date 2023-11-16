package modaNisa;

import base.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Otomasyon extends BaseTest {
    GirisPage girisPage;
    AdressEkleme adressEkleme;
    ListeOlusturma listeOlusturma;
    UrunAratma urunAratma;
    Urunislem urunislem;
    UrunSilme urunSilme;
    ListeUrunEkle listeUrunEkle;
    FavoriUrunAlmak favoriUrunAlmak;
    FavoriAlinanUrunSilme favoriAlinanUrunSilme;
    KesfetLink kesfetLink;
  KesfetUrunleriSil kesfetUrunleriSil;
  YeniGelenler yeniGelenler;
  YeniGelenlerSilme yeniGelenlerSilme;
  KategoriUrunleri kategoriUrunleri;
  KategoriUrunSilme kategoriUrunSilme;
FirsatUrunleriAl firsatUrunleriAl;


    @BeforeClass
    public void before(){
        girisPage = new GirisPage(getAppiumDriver());
        adressEkleme = new AdressEkleme(getAppiumDriver());
        listeOlusturma = new ListeOlusturma(getAppiumDriver());
        urunAratma =new UrunAratma(getAppiumDriver());
        urunislem=new Urunislem(getAppiumDriver());
        urunSilme =new UrunSilme(getAppiumDriver());
        listeUrunEkle=new ListeUrunEkle(getAppiumDriver());
        favoriUrunAlmak=new FavoriUrunAlmak(getAppiumDriver());
        favoriAlinanUrunSilme=new FavoriAlinanUrunSilme(getAppiumDriver());
        kesfetLink=new KesfetLink(getAppiumDriver());
       kesfetUrunleriSil = new KesfetUrunleriSil(getAppiumDriver());
       yeniGelenler = new YeniGelenler(getAppiumDriver());
       yeniGelenlerSilme = new YeniGelenlerSilme(getAppiumDriver());
       kategoriUrunleri = new KategoriUrunleri(getAppiumDriver());
        kategoriUrunSilme =new KategoriUrunSilme(getAppiumDriver());
       firsatUrunleriAl = new FirsatUrunleriAl(getAppiumDriver());


    }

    @Test(priority = 1)
    public void test(){
        girisPage.giris("MODA NİSA GİRİŞ EPOSTA ","ŞİFRE GİRİNİZ");
       // Assert.assertTrue(girisPage.varmi(),"Giriş Yapılamadı.");
    }

@Test(priority = 2)
public void test2(){
        adressEkleme.adressEkleme("5545122368","Balkes Ev","Narsız Mevki Balkes","10300");
        Assert.assertTrue(adressEkleme.varmi(),"Adress Eklenmedi");
}


@Test(priority = 3)
    public void test3(){
        listeOlusturma.liste("Deneme");
        Assert.assertTrue(listeOlusturma.varmi(),"Liste Eklenmedi");
}

@Test(priority = 4)
public void test4(){
listeUrunEkle.listeyeUrunEkle("mont");

}

@Test(priority = 5)
    public void test5(){
    favoriUrunAlmak.favoriAlma();
    Assert.assertEquals(favoriUrunAlmak.varmi(),"Sepetim (2 Ürün)","Ürün Sepete Eklenmedi");
}

@Test(priority = 6)
    public void test6(){
    favoriAlinanUrunSilme.favoriUrunSilme();
    Assert.assertTrue(favoriAlinanUrunSilme.varmi());

}


@Test(priority = 7)
    public void test7(){
    urunAratma.urunAra("Bot");
    Assert.assertTrue(urunAratma.varmi(),"Ürün Sepete Eklenmedi");
}



@Test(priority = 8)
    public void test8(){
    urunislem.kargoKontrol();
    Assert.assertTrue(urunislem.varmi(),"Şipariş Ödeme Olmadı");
}

@Test(priority = 9)
    public void test9(){
    urunSilme.listEkle();
}


@Test(priority = 10)
    public void test10(){
    kesfetLink.kesfet()
            .EnUcuz();
    Assert.assertEquals(kesfetLink.fiyat(),kesfetLink.totalFiyatt(),"Doğru Sonuc Değil");

}

@Test(priority = 11)
    public void test11(){
    kesfetUrunleriSil.KesfetSil();
}

@Test(priority = 12)
    public void test12(){
yeniGelenler.yeniGelenUrunler()
            .birgunOnceGelen();

}
@Test(priority = 13)
public void test13(){

    yeniGelenlerSilme.Silme();

}

@Test(priority = 14)
    public void test14(){

    kategoriUrunleri.kategori()
            .Filtre()
            .urunSec();
    Assert.assertEquals(kategoriUrunleri.sepetFiyatii(),kategoriUrunleri.sepetTotal(),"Fiyatlar Uyusmuyor");
}
@Test(priority = 15)
    public void test15() {
    kategoriUrunSilme.kategoriUrunuSil();
}


@Test(priority = 16)
    public void test16(){
    firsatUrunleriAl.firsatAL();
}

}

