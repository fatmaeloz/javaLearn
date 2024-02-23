package j03_ScannerClasss_TypeCasting;

public class C02_TypeCasting {


    public static void main(String[] args) {
        boolean başarılı=true;
        System.out.println("başarılı = " + başarılı);
        String succes=String.valueOf(başarılı);//Wraperclass
        System.out.println("succes = " + succes);
    double sayı1=49;
        System.out.println("sayı1= " + sayı1);//AW->49.0
        int sayı2=74;
        int sayı3=12;
        System.out.println("sayı2/sayı3 = " + (sayı2/sayı3));
  /*
  javada iki int değer bulunduğunda sonuç mutlaka int olur.
  yani bölme ondalıklı bir sayı olsada casting yaparak int yapar.


   */



byte b=15;
int nun=b;
        System.out.println("nun = " + nun);
        int i=1453;
        double d=i;
        System.out.println("d = " + d);
        double d1=d/sayı2;
        System.out.println("d1 = " + d1);
        //Hap bilgi ->İki farklı data type işleme girerse AW(küçük data büyük dataya casting(çevrilıyor))
        //veri kaybını önlemek için

        double d2=14.53;
        System.out.println("d2 = " + d2);
        int num2= (int) d2;//buyuk data  küçük dataya çevriliyor
        System.out.println("num2 = " + num2);

        double d3=571.622;
        System.out.println("d3 = " + d3);//571.622
        long l=(long) d3;
        System.out.println("l = " + l);//571

        int num3=129;
        System.out.println("num3 = " + num3);//129
        byte b2 =(byte) num3;
        System.out.println("b2 = " + b2);//127

    }
}
