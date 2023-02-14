package Tekrar02.StaticVeNonStatic;

// classlar yeni bir tip di.
public class Ogrenci {
    //özellikleri
    String ad;
    String soyad;
    String tel;

    static int ogrSay=0;// sen bitanesin

    public Ogrenci() {
        ogrSay++;
    }

    // davranis, metodu
    public void kimlikYazdir()
    {
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("tel = " + tel);
    }

    public static void ogrSayYazdir()
    {

    }

}
