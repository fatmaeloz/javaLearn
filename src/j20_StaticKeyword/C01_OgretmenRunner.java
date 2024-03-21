package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen t1=new C01_Ogretmen("Sema",11);
        System.out.println("t1.isim = " + t1.isim);//obj ile instance variable call edildi->Sema
        System.out.println("t1.tecrube = " + t1.tecrube);//obj ile instance variable call edildi->11
        t1.evlilikTebrikEt();//obj ile non-static meth call edildi
        t1.maasHesapla();//obj ile static meth call edildi->BAD PRACTICE
        C01_Ogretmen.maasHesapla();//ClassName ile meth call edildi
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//ClassName ile static variable call edildi->Sivas Lisesi
        C01_Ogretmen.okulIsmi="Sivas Anadolu Lisesi";//ClassName ile static variable call edildi
        System.out.println("t1.okulIsmi = " + t1.okulIsmi);//obj ile static variable call edildi->Sivas Anadolu Lisesi
        C01_Ogretmen t2=new C01_Ogretmen("Merve",13);
        System.out.println("t2.tecrube = " + t2.tecrube);//13
        System.out.println("t2.isim = " + t2.isim);//Merve
        System.out.println("t2.okulIsmi = " + t2.okulIsmi);//Sivas Anadolu Lisesi
    }
}
