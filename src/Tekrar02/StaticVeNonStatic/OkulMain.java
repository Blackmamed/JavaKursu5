package Tekrar02.StaticVeNonStatic;

import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi=oku.nextInt();

        OkulMain.tekMiCiftMi(sayi); // static metodlar
        //run olduğunda direk kullanılabilen metdolardır.

        Ogrenci ogr1=new Ogrenci();
        ogr1.kimlikYazdir();
        //static OLMAYAN metodlar ise ancak içinde
        // bulunduğu class dan bir tane oluşturularak kullanılabilir.


        Ogrenci.ogrSayYazdir(); // static metodlar
        //run olduğunda direk kullanılabilen metdolardır.

    }

    public static void tekMiCiftMi(int sayi){
        if (sayi %2 == 0)
            System.out.println(" çifttir");
        else
            System.out.println("tektir");
    }

}
