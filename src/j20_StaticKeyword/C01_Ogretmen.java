package j20_StaticKeyword;

public class C01_Ogretmen {
    //fields->obj. variables->Instance variables
    String isim;
    int tecrube;
    //Class variable
    static String okulIsmi="Sivas Lisesi";

    public C01_Ogretmen(String isim, int tecrube) {//full p li const
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public static void maasHesapla(){//statıc meth
        System.out.println("Maasın hayırlı olsun ilk maasın ile ne ısmarlıyorsun");

    }
    public void evlilikTebrikEt(){//non-static meth
        System.out.println("başka derdin mi yoktu arkadasım");

    }
}
