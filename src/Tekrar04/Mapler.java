package Tekrar04;

import java.util.*;

public class Mapler {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boyut sabit , hız derecesi :1
        ArrayList<Integer> liste=new ArrayList<>(); // boyut dinamik, hız derecesi :2
        Set<Integer> ts=new TreeSet<>(); // boyut değişken, tekrar yok, sortlu, hız derecesi :3
        // Setlerde direk bir eleman erişim yok onun yerine SET yani toplu çalışmaya uygun

        // Eğer bize hem SET gibi çalışşsın, fakat istediği eleman direk ulaşabileyim : MAP
        // HashMap, TreeMap, LinkedHashMap

        //istediğin eleman direk ulaşmanın yolu, her değer bir anahtar vermenden geçiyor
        //index-değer   ,  KEY-VALUE
        TreeMap<Integer, String> tm=new TreeMap<>();
        tm.put(1001, "ismet temur");
        tm.put(1002, "Ali Yılmaz");
        tm.put(1010, "Ayşe Demir");

        System.out.println("hm.get(1002) = "+tm.get(1002));
        System.out.println("hm = " + tm);

        System.out.println("hm.keySet() = " + tm.keySet());
        System.out.println("hm.values() = " + tm.values());

        for(Map.Entry<Integer,String> e: tm.entrySet()){
            System.out.println("key,value = " + e.getKey()+","+e.getValue());
        }

    }

}
