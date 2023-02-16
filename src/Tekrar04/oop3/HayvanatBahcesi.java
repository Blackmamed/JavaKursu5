package Tekrar04.oop3;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kd=new Kedi();
//        kd.ses();
//        kd.yemek();

        Hayvan kd2=new Kedi();

        Kopek kp=new Kopek();
//        kp.ses();
//        kp.yemek();

        sesVer(kd);
        sesVer(kp);
    }

    static void sesVer(Hayvan hy)
    {
        hy.ses();

        if (hy instanceof Kopek)
            ((Kopek)hy).kokladi();
    }

}
